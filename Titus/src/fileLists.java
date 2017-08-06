import java.io.*;
import java.nio.*;
import java.nio.file.*;

import javax.crypto.SealedObject;
import javax.management.ListenerNotFoundException;

import raws.SearchPage;

public class fileLists extends SearchPage {

//	void listFolder(File dir){
//		File[] subDirs = dir.listFiles(new FileFilter() {
//			
//			@Override
//			public boolean accept(File pathName) {
//				// TODO Auto-generated method stub
//				return pathName.isDirectory(); 
//			}
//		});
//		
//		System.out.println("\nDirectory " + dir.getAbsolutePath());
//		listFile(dir);
//		
//		for(File folder : subDirs){
//			listFolder(folder);
//		}
//	}
	
//	private void listFile(File dir) {
//		// TODO Auto-generated method stub
//		File[] files = dir.listFiles();
//		
//		for(File file: files){
//			System.out.println(file.getName());
//		}
//		
//	}

	public static void main(String[] args){
//		new fileLists().listFolder(new File("D:\\"));
	
		File files = new File("D:\\");
		File[] list = files.listFiles();
		
		for(File f : list){
//			System.out.println(f);
			if(files.isDirectory()){
				System.out.println(f);
			}
		
		}
	
	
	}
	
}
