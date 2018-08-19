package iotwearable.editor.action;
import iotwearable.editor.StateSchemaEditor;
import iotwearable.editor.factory.DecisionFactory;
import iotwearable.editor.factory.EndPointFactory;
import iotwearable.editor.factory.StartPointFactory;
import iotwearable.editor.factory.StateFrameFactory;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateComponent;
import iotwearable.model.iotw.StateSchema;

import org.eclipse.gef.Request;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.CreationTool;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;

public class StateSchemaContextMenuAction extends WorkbenchPartAction {

	public static final String ID_AddStateFrame = "AddStateFrame";
	public static final String ID_AddDecision = "AddDecision";
	public static final String ID_AddEndPoint = "AddEndPoint";
	public static final String ID_AddStartPoint = "AddStartPoint";
	public static final String REQUEST = "StateSchemaContextMenu";
	public static final boolean EnableBuzzer = true;
	private final Request request;
	private String Id;
	private boolean enable;
	private StateSchema stateSchema;
	public StateSchemaContextMenuAction(IWorkbenchPart part, String Id, StateSchema stateSchema) {
		super(part);
		this.Id=Id;
		this.stateSchema = stateSchema;
		enable= true;
		request = new Request(REQUEST);
		switch (Id) {
		case ID_AddStateFrame:
			setId(Id);
			setText("Add State Frame");
			break;
		case ID_AddDecision:
			setId(Id);
			setText("Add Decision");
			break;
		case ID_AddEndPoint:
			setId(Id);
			setText("Add End Point");
			break;
		case ID_AddStartPoint:
			setId(Id);
			setText("Add Start Point");
			break;
		default:
			break;
		}
	}
	public Request getRequest() {
		return request;
	}

	@Override
	public void run() {
		StateSchemaEditor editor = (StateSchemaEditor) getWorkbenchPart();
		CreationTool tool;
		switch (Id) {
		case ID_AddStateFrame:
			tool	= new CreationTool((CreationFactory) new StateFrameFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddDecision:
			tool = new CreationTool((CreationFactory) new DecisionFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddEndPoint:
			tool = new CreationTool((CreationFactory) new EndPointFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		case ID_AddStartPoint:
			tool = new CreationTool((CreationFactory) new StartPointFactory());;
			editor.getEditDomain().setActiveTool(tool);
			break;
		default:
			break;
		}
	}

	@Override
	protected boolean calculateEnabled() {
		switch (Id) {
		case ID_AddStartPoint:
			enable= checkCalculateEnabledStartPoint();
			break;
		default:
			enable = true;
			break;
		}
		return enable;
	}
	private boolean checkCalculateEnabledStartPoint()
	{
		for(StateComponent component: stateSchema.getComponents())
			if(component instanceof StartPoint)
			{
				return false;
			}
		return true;
	}
}
