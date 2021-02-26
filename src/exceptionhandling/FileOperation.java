package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args){
		//attempt to locate a file and try to read the file
		String filePath = "/Users/matiur/eclipse-workspace-january2021sdet/Project6/flyingcar.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File is not locate able");
		}
		
		String data = "";
		try {
			br = new BufferedReader(fr);
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println("file is not found and obiously data is not read able");
		}
		
		//clean up process
		finally {
			try {
				if(fr != null) {
				  fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			 }
			
			try {
				if(br != null) {
				   br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
