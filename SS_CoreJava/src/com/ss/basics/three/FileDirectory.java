/**
 * 12/10/20
 * Write a Java program to get a list of all file/directory
 * 	names under a given directory.
 */
package com.ss.basics.three;

import java.io.File;
import java.nio.file.DirectoryStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author ronh ron henson
 *
 */
public class FileDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String directory = "./";	

		if (args.length == 1) {
			directory = args[0];
		}
	
		File dirName = new File(directory);
		
		if (dirName.isDirectory()) {
			dir(directory);
		} else {
			System.out.println("<" + directory + ">" + " is not found");
		} 
	}
	
			
	public static void dir(String dirPath) {
		
		Path path = Paths.get(dirPath);
		try (DirectoryStream<Path> directory = Files.newDirectoryStream(path)) {
			directory.forEach(file -> {
				System.out.println(file.getFileName());
			});
		} catch (Exception e) {
				e.printStackTrace();
		}
	
	}
}
