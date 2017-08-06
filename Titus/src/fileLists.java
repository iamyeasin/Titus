import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.ArrayList;

import javax.crypto.SealedObject;
import javax.management.ListenerNotFoundException;
import javax.swing.filechooser.FileSystemView;

import raws.SearchPage;

public class fileLists extends SearchPage {

	public  static void listf(String directoryName, ArrayList<File> files) {
        File directory = new File(directoryName);
        // files(ArrayList<File>) is ur main list what u will use all the time for accessing files;
        // get all the files from a directory
        File[] fList = directory.listFiles();
        if(fList==null) return;
        for (File file : fList) {
            if (file.isFile()) {

                files.add(file);
//                System.out.println("File --- "+file.getAbsolutePath()); // comment this line out.. its to show files when u test run it
            } else if (file.isDirectory()) {
//                System.out.println("Folder --- "+file.getAbsolutePath()); // comment this line out.. its to show files when u test run it
                listf(file.getAbsolutePath(), files);
            }

        }
    }
	
	public static void main(String[] args){
		File[] paths;
        FileSystemView fsv = FileSystemView.getFileSystemView();
		
			// returns pathnames for files and directory
		        paths = File.listRoots();
		        ArrayList<File> theUltimateFileList = new ArrayList<>();
		        // for each pathname in pathname array
		        for(File path:paths){
		
//		            System.out.println(" ------- Drive: "+path);
		            listf(path.getAbsolutePath(),theUltimateFileList);		
		
		        }
		        
	}

}
