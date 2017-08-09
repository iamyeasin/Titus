package raws;

import java.io.File;
import java.util.ArrayList;

public class MainController {
	public static void main(String[] args) throws Exception {

		// Calling the object .. creating a file using constructor
		TitusInterface sp = new TitusInterface();
		fileLists fl = new fileLists();	
		// File listing available to the drive
		sp.runUI();
		
		File[] rootDir; // for saving all the directories
		rootDir = File.listRoots();

		ArrayList<File> allList = new ArrayList<>(); // All the root directories
														// will be stored in
														// array list
		if(fl.file_exist == false || fl.btn_refresh == true){
			for (File path : rootDir) {
//				System.out.println("----Drive " + path.getName());
				fl.listf(path.getAbsolutePath(), allList);
			
			}
			TitusInterface.cmplt = true;
		}
		
		System.out.println("Searching complete");
		
		// Reading Datas from searched file
		SearchEngine.readData();
	}

}
