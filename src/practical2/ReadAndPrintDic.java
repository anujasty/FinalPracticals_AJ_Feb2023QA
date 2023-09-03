package practical2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadAndPrintDic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doesFileExist("data/Dictionary.txt");
		readTextFile("data/Dictionary.txt");
	}
	
	
	public static void doesFileExist(String path) {
		try {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			fr.close();
			}
		catch(IOException e) {
			e.printStackTrace();  
		}
	}
	
	
	public static void readTextFile(String path) {
		;
		try {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader r = new BufferedReader(fr);
			String line = null;
			while ((line = r.readLine()) != null) {  //included this line to avoid printing an empty line
													 //to console in case if the line reading is empty line
													 //and does not need parsing.
				String[] csvLineElements = (line.split("[-,]+"));
				if (  !line.isEmpty() ) {
					for (int i = 0; i < csvLineElements.length; i++) {
					
						System.out.println();
						System.out.println(csvLineElements[i].trim());
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



