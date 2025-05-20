package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복
		while(true) {
			
		}
		
		
	}

}
