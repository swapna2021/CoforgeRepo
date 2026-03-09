package com.coforge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DemoOnTryCatch {
	
//	public static void useFile() throws FileNotFoundException {
//		
//		
//	}
	
	public static void readFile() throws FileNotFoundException {
		
		FileReader reader=new FileReader("data.txt");
		
	}
	public static void main(String[] args) throws FileNotFoundException  {
		
//		int a=5,b[]= {1,2,0,2,5};
//		try {
//			for(int i=0;i<b.length;i++)
//			System.out.println(a/b[i]);
//		}
//		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println("Arithmetic Exception");
//		}
//		catch (ArrayIndexOutOfBoundsException ae) {
//			System.out.println("Exception occured");
//				e.printStackTrace();
//			System.out.println(e.getMessage());	
//		}
//		catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		String s="Swapna";
//		try {
//		System.out.println(s.charAt(0));
//		}
//		catch(NullPointerException ne) {
//			ne.printStackTrace();
//		}
//		finally {
//		System.out.println("application completed");
//		}
//		try {
//		useFile();
//		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		FileReader reader=null;
//		try {
//		reader =new FileReader("data.txt");
//		int ch;
//		while((ch=reader.read())!=-1)
//			System.out.println((char)ch);
//		}
//		catch(FileNotFoundException ex) {
//			ex.printStackTrace();
//		}
//		catch(IOException ex) {
//			ex.printStackTrace();
//		}
//		finally {
//			System.out.println("finally executed");
//				
//		}
		
		readFile();
		
	}

}
