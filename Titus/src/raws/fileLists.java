package raws;
import java.awt.EventQueue;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;

import javax.crypto.SealedObject;
import javax.management.ListenerNotFoundException;
import javax.swing.filechooser.FileSystemView;

public class fileLists {
	static PrintWriter output;
	static public boolean file_exist = false;
	static public boolean btn_refresh = false;
	static public File file_directory;
	
	public fileLists() throws Exception {
			try{
				File drctry = new File("C:\\Users\\Yeasin\\workspace\\Titus\\Directories.txt");
				if(drctry.exists()) {
					file_exist = true;
	//				System.out.println("File already exits");
				}
				output = new PrintWriter(drctry);
			}
			catch(FileNotFoundException e){
				e.getStackTrace();
			}
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
                output.println(file.getAbsolutePath()); 
            } else if (file.isDirectory()) {
//            	System.out.println("Folder --- "+file.getAbsolutePath()); 
                output.println(file.getAbsolutePath()); 
                listf(file.getAbsolutePath(), files);
            }

        }
    }

	


}