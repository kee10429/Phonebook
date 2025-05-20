package com.javaex.ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException{
		
		//리스트 
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
		//System.out.println(pList.toString());
		
		//-----------------------------------------------------------------
		System.out.println("**************************************************");
		System.out.println("*               전화번호 관리 프로그램                 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println("1.리스트   2.등록   3.삭제   4.검색   5.종료");
		
		//------------------------------------------------------------------
		
		//스캐너 
		Scanner sc = new Scanner(System.in);
		//-------------------------------------------------------------------
		//출력
		//<1.리스트>
		
		while(true) {
			
			System.out.println("--------------------------------------------------");
			System.out.print(">메뉴번호:");
			
			String number =  sc.nextLine();
			
			if(number.equals("1")) {
				System.out.println("<1.리스트>");
				
				for(int i=0; i<pList.size(); i++) {
					Person p = pList.get(i);
					System.out.println((i+1) + ".   "+ p.getName() + "  " + p.getHp() + "   " + p.getCompany());
				}
				
			} else if(number.equals("2")) {
				System.out.println("<2.등록>");
				System.out.print(">이름:");
				String name = sc.nextLine();
				System.out.print(">휴대전화:");
				String hp = sc.nextLine();
				System.out.print(">회사번호:");
				String company = sc.nextLine();
				
				Person newPerson = new Person(name, hp, company);
				pList.add(newPerson);
				
				System.out.println("[등록되었습니다]");
				
				
			} else if (number.equals("3")) {
				System.out.println("<3.삭제>");
				System.out.print(">번호:");
				String dn = sc.nextLine();  
				
				int delNumber = Integer.parseInt(dn)-1;
				
				if(delNumber>=0) {
					pList.remove(delNumber);
					System.out.println("[삭제되었습니다]");
				}
				
				
			} else if (number.equals("4")) {
				
				
			} else if (number.equals("5")) {
				
				System.out.println("**********************************************");
				System.out.println("*                   감사합니다                  *");
				System.out.println("**********************************************");
				
				break;
			} else {
				System.out.println("[다시 입력해 주세요]");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//닫기
		br.close();
		sc.close();
		
		
	}

}
