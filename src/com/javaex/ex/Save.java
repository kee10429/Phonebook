package com.javaex.ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Save {
	
	public static void main (String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\미니프로젝트\\PhoneDB_원본.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person p : pList) {
			String line = p.getName() + "," + p.getHp() + "," + p.getCompany();
			bw.write(line);
			bw.newLine();
			
		}
		
		
		bw.close();
	}
	
}
