/**
 * Write an an example that counts the number of times a
 * 	particular character, such as e, appears in a file.
 * 	The character can be specified at the command line
 */
package com.ss.dec08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;


/**
 * @author ronh ron henson
 *
 */
public class CountCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File fileName = getFileName();
		
		// test file; "file/in/file_count_characters.txt"
		
		Character letter = getLetter();
		
		readFile(fileName, letter);
	}
	
	public static Character getLetter() {
		char letter = '\0';
		try {
			BufferedReader readChar = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a character: ");
			letter = (char) readChar.read();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return Character.toLowerCase(letter);
	}
	
	public static File getFileName() {
		String file = "";
		try {
			BufferedReader readFileName = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter path and filename: ");
			file = readFileName.readLine(); 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		File fileName = new File(file);
		
		if (!fileName.exists()) {
			System.out.println(fileName + " not found");
		}
		
		return fileName;
	}
	
	private static void readFile(File fileName, Character letterLowerCase) {
		
		
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)) {
		
			int readInCharacterInteger = 0;
			int numberOfCharacters = 0;
			
			while ((readInCharacterInteger = br.read()) != -1) {
				Character characterRead = (char) Character.toLowerCase(readInCharacterInteger);
			
				if (letterLowerCase.equals(characterRead)) {
					numberOfCharacters++;
				} 
			}
			System.out.println(numberOfCharacters);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
