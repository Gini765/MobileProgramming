package kc.ac.kookmin.exception.intro;

import java.io.*;

public class Test {
	public static void main(String args[]) {
		BufferedReader textFile = null;

		try {
			String text;
			FileReader readIt = new FileReader("C://Users//User//git//MobileProgramming//a.txt");
			textFile = new BufferedReader(readIt);
			text = textFile.readLine();
			System.out.println(text);
		} catch (FileNotFoundException e) {
			System.out.println("File dosn't exist!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				textFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
