package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		//리스트 만들기
		java.util.List<Person> pList = new ArrayList<Person>();
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\미니프로젝트\\PhoneDB_원본.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복
		while(true) {
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			String[] sArray = str.split(",");
			
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];
			
			Person p = new Person(name, hp, company);
			pList.add(p);
		}
		
		//전체값 출력
		System.out.println(pList.toString());
		
		
		//닫기
		br.close();
		
		
	}

}
