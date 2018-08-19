package iotwearable.editor;

import iotwearable.editor.factory.DecisionFactory;
import iotwearable.editor.factory.EndPointFactory;
import iotwearable.editor.factory.OutsideFlowFactory;
//import iotwearable.editor.factory.OutsideFlowFactory;
import iotwearable.editor.factory.StartPointFactory;
import iotwearable.editor.factory.StateFlowFactory;
import iotwearable.editor.factory.StateFrameFactory;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PanningSelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;

public class StatePalette extends PaletteRoot {
	private PaletteDrawer group;

	public StatePalette() {
		ToolEntry toolSelect = new PanningSelectionToolEntry();
		group = new PaletteDrawer("State Machine");
		group.add(toolSelect);
		add(group);
		addEntry();
		setDefaultEntry(toolSelect);
	}

	private void addEntry() {
		CreationToolEntry _frame = new CombinedTemplateCreationEntry("Frame", "Frame",
				new StateFrameFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/frame.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/frame.png"));
		
		CreationToolEntry _decision = new CombinedTemplateCreationEntry("Decision",
				"Decision", new DecisionFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/rhombus.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/rhombus.png"));
		
		CreationToolEntry _startPoint = new CombinedTemplateCreationEntry("StartPoint",
				"StartPoint", new StartPointFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/startpoint.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/startpoint.png"));
		
		CreationToolEntry _endPoint = new CombinedTemplateCreationEntry("EndPoint",
				"EndPoint", new EndPointFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/endpoint.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/endpoint.png"));

		ConnectionCreationToolEntry _link = new ConnectionCreationToolEntry(
				"StateFlow", "StateFlow", new StateFlowFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/link.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/link.png"));
		
		ConnectionCreationToolEntry _linkDashed = new ConnectionCreationToolEntry(
				"Outside Flow", "Outside Flow", new OutsideFlowFactory(),
				ImageDescriptor.createFromFile(this.getClass(),"icons/linkDashed.png"),
				ImageDescriptor.createFromFile(this.getClass(),"icons/linkDashed.png"));

		group.add(_frame);
		group.add(_decision);
		group.add(_startPoint);
		group.add(_endPoint);
		group.add(_link);
		group.add(_linkDashed);
	}
}