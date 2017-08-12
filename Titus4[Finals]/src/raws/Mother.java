package raws;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.FileHandler;

import javax.swing.JOptionPane;

public class Mother {
	public static int  UI_Flag = 0;
	
	
	public static void callDir() throws Exception{
		File[] rootDir; // for saving all the directories
		rootDir = File.listRoots();
		if(fileLists.file_exist == false)fileLists.dig();
		ArrayList<File> allList = new ArrayList<>(); // All the root directories
														// will be stored in
														// array list
		if(fileLists.file_exist == false ||fileLists.btn_refresh == true ){
			for (File path : rootDir) {
//				System.out.println("----Drive " + path.getName());
				fileLists.listf(path.getAbsolutePath(), allList);
			}
			Face.cmplt = true;
		}
	}
	
	public static void main(String[] args) throws Exception {

		long startTime = System.currentTimeMillis();
		// Calling the object .. creating a file using constructor
		Face sp = new Face();	
		// File listing available to the drive
		if(UI_Flag == 0)sp.runUI();
		Mother.callDir();
		long endTime   = System.currentTimeMillis(); // 143019 eats for 
        long total_time = (long) ((endTime - startTime)/1000.00);
		JOptionPane.showMessageDialog(null,"Scanning is complete in " + total_time + " Sec!");

		
	
		
	}

}
