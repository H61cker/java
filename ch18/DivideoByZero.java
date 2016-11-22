package kr.hs.dgsw.ch18;

import java.util.Scanner;

public class DivideoByZero {
	
	public static void main(String[] args) {
		
		System.out.println("두 개의 정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try{
			
			System.out.println("몫 : " + (num1/num2));
			System.out.println("나머지 : " + (num1%num2));
			
		}catch(ArithmeticException e){
			
			System.out.println(e.getMessage());
			return;
			
		}catch( Exception e2){
			
		}
		
		finally{ // 무조건 실행된다.
			System.out.println("실행 완료!");
			sc.close();
		}
		
		
	}
}
