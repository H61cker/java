package kr.hs.dgsw.ch18;

import java.util.Scanner;

public class DivideoByZero {
	
	public static void main(String[] args) {
		
		System.out.println("�� ���� ������ �Է��Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try{
			
			System.out.println("�� : " + (num1/num2));
			System.out.println("������ : " + (num1%num2));
			
		}catch(ArithmeticException e){
			
			System.out.println(e.getMessage());
			return;
			
		}catch( Exception e2){
			
		}
		
		finally{ // ������ ����ȴ�.
			System.out.println("���� �Ϸ�!");
			sc.close();
		}
		
		
	}
}
