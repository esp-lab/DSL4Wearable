package iotwearable.editor.utilities;

//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
/**
 *  * Registering a listener
		IResourceChangeListener listener = new IoTWProjectManager();
		   ResourcesPlugin.getWorkspace().addResourceChangeListener(
		      listener,  IResourceChangeEvent.PRE_CLOSE
		      | IResourceChangeEvent.PRE_DELETE
		      | IResourceChangeEvent.PRE_BUILD
		      | IResourceChangeEvent.POST_BUILD
		      | IResourceChangeEvent.POST_CHANGE);
	At: Activator.class
 *
 */
public class ResourceListener implements IResourceChangeListener{
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
        switch (event.getType()) {
           case IResourceChangeEvent.PRE_CLOSE:
        	   //do something
              break;
           case IResourceChangeEvent.PRE_DELETE:
        	   //do something
              break;
           case IResourceChangeEvent.POST_CHANGE:
              try {
				event.getDelta().accept(new DeltaPrinter());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              break;
           case IResourceChangeEvent.PRE_BUILD:
              try {
				event.getDelta().accept(new DeltaPrinter());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              break;
           case IResourceChangeEvent.POST_BUILD:
              try {
				event.getDelta().accept(new DeltaPrinter());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              break;
        }
	}
	 class DeltaPrinter implements IResourceDeltaVisitor {
	      public boolean visit(IResourceDelta delta) {
//	  		ProjectManager manager = new ProjectManager();
//	         IResource res = delta.getResource();
	         switch (delta.getKind()) {
	            case IResourceDelta.ADDED:
//	            	if(!projectManager.isProject() && res.getFileExtension().equals("iotw")){
//	            		try {
//							res.delete(true, null);
//						} catch (CoreException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//	              		System.out.println("The project only includes an iotw file for the mainboard and an iotw file for the state machine.");
//	              	}
	               break;
	            case IResourceDelta.REMOVED:
	               break;
	            case IResourceDelta.CHANGED:
	               int flags = delta.getFlags();
	               if ((flags & IResourceDelta.CONTENT) != 0) {
//	                     System.out.println("--> Content Change");
	               }
	               if ((flags & IResourceDelta.REPLACED) != 0) {
//	                     System.out.println("--> Content Replaced");
	               }
//	               if ((flags & IResourceDelta.MARKERS) != 0) {
//	                     System.out.println("--> Marker Change");
//	                     IMarkerDelta[] markers = delta.getMarkerDeltas();
//	                     // if interested in markers, check these deltas
//	               }
	               break;
	         }
	         return true; // visit the children
	      }
	   }
}
