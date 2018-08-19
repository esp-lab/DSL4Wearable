package iotwearable.editor.window;

import javax.swing.JOptionPane;

public class MessageWindow{
	public static void show(String titleBar, String message){
		JOptionPane.showMessageDialog(null, message, "Message: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}