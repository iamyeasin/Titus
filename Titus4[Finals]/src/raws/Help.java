package raws;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.Cursor;
import javax.swing.JTextPane;

public class Help {
	public static void Mui(){
		String msg = "<html>Project prototype is Searching Directories to the HardDrives<br>"
				+ "If you don't find something but you know that it is in somewhere your drive try<br>"
				+ "Rescan option and wait until scanning is complete";

	    JOptionPane optionPane = new JOptionPane();
	    optionPane.setMessage(msg);
//	    optionPane.setBackground(new Color(36,37,41));
	    optionPane.setMessageType(JOptionPane.DEFAULT_OPTION);
	    
	    JDialog dialog = optionPane.createDialog(null, "ShortLine");
	    dialog.setVisible(true);
//	    dialog.setBackground(new Color(36,37,41));
		
	}
}