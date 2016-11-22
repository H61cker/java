package kr.hs.dgsw.ch17;

/*
 * local class
 * 1. local 클래스의 접근 범위 : 메서드 내부
 * 2. 접근 제한자는 final or abstract만 가능
 * 3. static 멤버 선언 불가
 * 
 */

public class LocalInnerClass {
	
	int x = 10;
	static int y = 20;
	
	void show(int m){
		
		int l = 40;
		
		
		class LocalClass{
			int z = 30;
//			static int k = 40; // 에러! static 멤버 선언 불가!
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