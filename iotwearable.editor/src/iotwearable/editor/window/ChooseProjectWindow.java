package iotwearable.editor.window;

import iotwearable.editor.utilities.Category;
import iotwearable.editor.utilities.MessageContent;
import iotwearable.editor.utilities.ProjectManager;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;
public class ChooseProjectWindow  {
	private List<ProjectManager.Node> listProject;
	private List<Category> Projects;
	public ChooseProjectWindow(List<ProjectManager.Node> listProject) {
		this.listProject = listProject;
		Projects = new ArrayList<>();

	}
	/**
	 * View window
	 * @return list<Category>
	 */
	public Category view()
	{
		if (listProject == null || listProject.isEmpty()) {
			MessageWindow.show("", MessageContent.NoProjectCanGen);
			return null;
		}
		else{
			int selection = JOptionPane.showConfirmDialog(null,
					initMenuProject(),
					"Select project to generate code",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if (selection == JOptionPane.OK_OPTION) {
				if(Projects.size()!=2 || !Projects.get(0).getProjectName().equals(Projects.get(1).getProjectName()))
				{
					JOptionPane.showMessageDialog(null,
							MessageContent.ErrorChooseProject,
							"Error choose", JOptionPane.INFORMATION_MESSAGE);
					return null;
				}
				else
				{
					Projects.get(0).getFile().add(Projects.get(1).getFile().get(0));
					Projects.remove(1);
				}
				Category category = new Category(Projects.get(0).getProjectName(),Projects.get(0).getFile());
				return category;
			} else {
				return null;
			}
		}

	}
	/**
	 * View Menu Project can be generate code
	 * @return
	 */
	public JPanel initMenuProject()
	{
		JPanel	panel=	new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new GridLayout(1,1,10,10));
		List<Object> rootNodes = new ArrayList<>();
		for (ProjectManager.Node project : listProject) {
			List<Object> list = new ArrayList<>();
			for(File fileName : project.getChild())
			{
				CheckBoxNode checkBoxNode = new CheckBoxNode(fileName.getName(), false) ;
				list.add(checkBoxNode);
			}
			Vector projectName = new NamedVector(project.getParrent(),list);
			rootNodes.add(projectName);
		}
		Vector	rootVector = new NamedVector("Root", rootNodes);
		JTree	tree = new JTree(rootVector);

		CheckBoxNodeRenderer renderer = new CheckBoxNodeRenderer();
		tree.setCellRenderer(renderer);

		tree.setCellEditor(new CheckBoxNodeEditor(tree));
		tree.setEditable(true);

		JScrollPane scrollPane = new JScrollPane(tree);
		panel.add(scrollPane);
		panel.setSize(400, 100);
		return panel;
	}

	class CheckBoxNodeRenderer implements TreeCellRenderer {
		private JCheckBox leafRenderer = new JCheckBox();

		private DefaultTreeCellRenderer nonLeafRenderer = new DefaultTreeCellRenderer();

		Color selectionBorderColor, 
		selectionForeground, 
		selectionBackground,
		textForeground, 
		textBackground;

		protected JCheckBox getLeafRenderer() {
			return leafRenderer;
		}

		public CheckBoxNodeRenderer() {
			Font fontValue;
			fontValue = UIManager.getFont("Tree.font");
			if (fontValue != null) {
				leafRenderer.setFont(fontValue);
			}
			Boolean booleanValue = (Boolean) UIManager
					.get("Tree.drawsFocusBorderAroundIcon");
			leafRenderer.setFocusPainted((booleanValue != null)
					&& (booleanValue.booleanValue()));

			selectionBorderColor = UIManager.getColor("Tree.selectionBorderColor");
			selectionForeground = UIManager.getColor("Tree.selectionForeground");
			selectionBackground = UIManager.getColor("Tree.selectionBackground");
			textForeground = UIManager.getColor("Tree.textForeground");
			textBackground = UIManager.getColor("Tree.textBackground");
		}

		public Component getTreeCellRendererComponent(JTree tree, Object value,
				boolean selected, boolean expanded, boolean leaf, int row,
				boolean hasFocus) {

			Component returnValue;
			if (leaf) {

				String stringValue = tree.convertValueToText(value, selected,
						expanded, leaf, row, false);
				leafRenderer.setText(stringValue);
				leafRenderer.setSelected(false);
				leafRenderer.setEnabled(tree.isEnabled());

				if (selected) {
					leafRenderer.setForeground(selectionForeground);
					leafRenderer.setBackground(selectionBackground);
				} else {
					leafRenderer.setForeground(textForeground);
					leafRenderer.setBackground(textBackground);
				}

				if (value instanceof DefaultMutableTreeNode) {
					Object userObject = ((DefaultMutableTreeNode) value)
							.getUserObject();
					if (userObject instanceof CheckBoxNode) {
						CheckBoxNode node = (CheckBoxNode) userObject;
						leafRenderer.setText(node.getText());
						leafRenderer.setSelected(node.isSelected());
					}
				}
				returnValue = leafRenderer;
			} else {
				returnValue = nonLeafRenderer.getTreeCellRendererComponent(tree,
						value, selected, expanded, leaf, row, hasFocus);
			}
			return returnValue;
		}
	}
	public class CheckBoxNodeEditor extends AbstractCellEditor implements TreeCellEditor {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private CheckBoxNodeRenderer renderer = new CheckBoxNodeRenderer();
		JTree tree;
		public CheckBoxNodeEditor(JTree tree) {
			this.tree = tree;
		}
		public Object getCellEditorValue() {
			JCheckBox checkbox = renderer.getLeafRenderer();
			CheckBoxNode checkBoxNode = new CheckBoxNode(checkbox.getText(),
					checkbox.isSelected());
			return checkBoxNode;
		}

		public boolean isCellEditable(EventObject event) {
			boolean returnValue = false;
			if (event instanceof MouseEvent) {
				MouseEvent mouseEvent = (MouseEvent) event;
				TreePath path = tree.getPathForLocation(mouseEvent.getX(),
						mouseEvent.getY());
				if (path != null) {
					Object node = path.getLastPathComponent();
					if ((node != null) && (node instanceof DefaultMutableTreeNode)) {
						DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) node;
						Object userObject = treeNode.getUserObject();
						returnValue = ((treeNode.isLeaf()) && (userObject instanceof CheckBoxNode));
					}
				}
			}
			return returnValue;
		}
		public Component getTreeCellEditorComponent(JTree tree, Object value,
				boolean selected, boolean expanded, boolean leaf, int row) {

			Component editor = renderer.getTreeCellRendererComponent(tree, value,
					true, expanded, leaf, row, true);
			ItemListener itemListener = new ItemListener() {
				public void itemStateChanged(ItemEvent itemEvent) {
					List<String> file = new ArrayList<String>();
					file.add(((JCheckBox)itemEvent.getItem()).getText());
					Category category = new Category(((DefaultMutableTreeNode)value).getParent().toString(),file);
					if(itemEvent.getStateChange() == 1)
					{
						if(Projects.isEmpty())
						{
							Projects.add(category);
						}
						else if(!Projects.contains(category))
						{
							boolean isAdd = true;
							for(Category cat : Projects)
							{
								if(!cat.getProjectName().equals(((DefaultMutableTreeNode)value).getParent().toString()) 
										|| cat.getFile().get(0).equals(((JCheckBox)itemEvent.getItem()).getText()))
								{
									isAdd=false;
									break;
								}

							}
							if(isAdd)
								Projects.add(category);
						}
					}
					if(itemEvent.getStateChange() != 1 && Projects.contains(category))
					{
						Projects.remove(category);
					}
					if (stopCellEditing()) {
						fireEditingStopped();
					}
				}
			};
			if (editor instanceof JCheckBox) {
				((JCheckBox) editor).addItemListener(itemListener);
			}

			return editor;
		}

	}

	public class CheckBoxNode  {
		String text;
		boolean selected;
		public CheckBoxNode(String text, boolean selected) {
			this.text = text;
			this.selected = selected;
		}
		public boolean isSelected() {
			return selected;
		}

		public void setSelected(boolean newValue) {
			selected = newValue;
		}

		public String getText() {
			return text;
		}

		public void setText(String newValue) {
			text = newValue;
		}

		public String toString() {
			return getClass().getName() + "[" + text + "/" + selected + "]";
		}

	}

	public class NamedVector extends Vector<Object> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String name;

		public NamedVector(String name) {
			this.name = name;
		}

		public NamedVector(String name, List<Object> list) {
			this.name = name;
			for (Object object : list) {
				add(object);
			}
		}
		@Override
		public String toString() {
			return name ;
		}
	}

}