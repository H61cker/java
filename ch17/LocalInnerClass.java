package kr.hs.dgsw.ch17;

/*
 * local class
 * 1. local Ŭ������ ���� ���� : �޼��� ����
 * 2. ���� �����ڴ� final or abstract�� ����
 * 3. static ��� ���� �Ұ�
 * 
 */

public class LocalInnerClass {
	
	int x = 10;
	static int y = 20;
	
	void show(int m){
		
		int l = 40;
		
		
		class LocalClass{
			int z = 30;
//			static int k = 40; // ����! static ��� ���� �Ұ�!
			void show(){
				System.out.println("output is " + ( x+ y + l + z + m));
			}
			
		}
		
		LocalClass lc = new LocalClass();
		lc.show();
		
	}
	
	public static void main(String[] args) {
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.show(100);
		
	}
}