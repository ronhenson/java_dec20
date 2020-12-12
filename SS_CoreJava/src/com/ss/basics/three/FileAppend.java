/**
 *  * Write a Java program to append text to an existing file.
 */
package com.ss.basics.three;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author ronh ron henson
 *
 */
public class FileAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String outputAppend = "Append this line to file";
		String fileName = "file/out/file_append_output.txt";
		fileOutput(fileName, outputAppend);
	}
	
	private static void fileOutput(String fileName, String outputAppend) {
		try(FileWriter output = new FileWriter(fileName, true)) {
			PrintWriter printWriter = new PrintWriter(output);
			printWriter.println(outputAppend);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
