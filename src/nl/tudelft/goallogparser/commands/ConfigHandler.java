package nl.tudelft.goallogparser.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class ConfigHandler extends AbstractHandler {

	private IWorkbenchWindow window;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MessageDialog form = new MessageDialog(null, "Hello", null, "My Question", 
				MessageDialog.QUESTION_WITH_CANCEL, 
				new String[]{
						IDialogConstants.YES_LABEL,
						IDialogConstants.NO_LABEL
				}, 0);
		form.open();
		return form;
	}

}
