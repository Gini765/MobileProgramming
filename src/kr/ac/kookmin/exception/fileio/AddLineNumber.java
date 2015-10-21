package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Makes numbered.txt the same as original.txt, but with each line numbered.
 */
public class AddLineNumber {
	public static void main(String[] args) {
		String path = AddLineNumber.class.getResource("").getPath();
		System.out.println(path);

		try {
			BufferedReader inputStream = new BufferedReader(new FileReader(path + "original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("C://Users//User//Desktop//numbered.txt"));
			
			int i = 0;
			int count = 0;
			
			while (i != -1) {
				String a = inputStream.readLine();
				count++;
				outputStream.println(count + " " + a);
				
				if(inputStream.read() == -1)
					i = -1;
			}
			
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("File dosn't exist!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}