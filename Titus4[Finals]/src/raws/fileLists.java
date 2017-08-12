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
	
	public static void dig() throws Exception {
			
				File drctry = new File("Directories.txt");
				file_directory = drctry;
				if(drctry.exists()) {
					file_exist = true;
					return; // One of the most important line.
				}
				output = new PrintWriter(drctry);
				
	} 

	
	public  static void listf(String directoryName, ArrayList<File> files) throws Exception {
		
		File directory = new File(directoryName);        
        File[] fList = directory.listFiles();
        if(fList==null) return;
        for (File file : fList) {
            if (file.isFile()) {
                files.add(file); 
                output.println(file.getAbsolutePath()); 
            } else if (file.isDirectory()) {

                output.println(file.getAbsolutePath()); 
                listf(file.getAbsolutePath(), files);
            }

        }

    }

	
//	public String tail( File file ) {
//		RandomAccessFile fileHandler = null;
//		try {
//			fileHandler = new RandomAccessFile( file, "directories.txt" );
//			long fileLength = fileHandler.length() - 1;
//			StringBuilder sb = new StringBuilder();
//
//			for(long filePointer = fileLength; filePointer != -1; filePointer--){
//				fileHandler.seek( filePointer );
//				int readByte = fileHandler.readByte();
//
//				if( readByte == 0xA ) {
//					if( filePointer == fileLength ) {
//						continue;
//					}
//					break;
//
//				} else if( readByte == 0xD ) {
//					if( filePointer == fileLength - 1 ) {
//						continue;
//					}
//					break;
//				}
//
//				sb.append( ( char ) readByte );
//			}
//			
//			String lastLine = sb.reverse().toString();
//			System.out.println(lastLine + fileLength);
//			return lastLine;
//			
//		} catch( java.io.FileNotFoundException e ) {
//			e.printStackTrace();
//			return null;
//		} catch( java.io.IOException e ) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			if (fileHandler != null )
//				try {
//					fileHandler.close();
//				} catch (IOException e) {
//                /* ignore */
//				}
//		}
//	}

}