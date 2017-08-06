package raws;
import java.awt.EventQueue;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;

import javax.crypto.SealedObject;
import javax.management.ListenerNotFoundException;
import javax.swing.filechooser.FileSystemView;

import raws.SearchPage;

public class fileLists {
	static PrintWriter output;
	boolean fileOk = true;
	
	public fileLists() throws Exception {
			
			File drctry = new File("C:\\Users\\Yeasin\\workspace\\Titus\\directories.txt");
			if(drctry.exists()) {
				fileOk = false;
			}
			output = new PrintWriter(drctry);
			SearchPage.txtScanningResult.setText("Scanning complete"); // NEED a Green signal for checking the search
			
		} 

	
	public  static void listf(String directoryName, ArrayList<File> files) throws Exception {
		
		File directory = new File(directoryName);        
        File[] fList = directory.listFiles();
        if(fList==null) return;
        for (File file : fList) {
            if (file.isFile()) {
//            	output.println("File --- "+file.getAbsolutePath());
                files.add(file);
//	            System.out.println("File --- "+file.getAbsolutePath()); 
                output.println("File --- "+file.getAbsolutePath()); 
            } else if (file.isDirectory()) {
//            	System.out.println("Folder --- "+file.getAbsolutePath()); 
                output.println("Folder --- " + file.getAbsolutePath()); 
                listf(file.getAbsolutePath(), files);
            }

        }
    }

	


}