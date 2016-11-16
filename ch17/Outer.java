package kr.hs.dgsw.ch17;

public class Outer {
	int x = 10;
	static int y = 20;
	
	static class StaticInner{
		int z = 30;
		static int k = 40;
		void show(){
//			System.out.println(x + y); // 에러!, static member 에만 접근 가능!
			System.out.println(y+z+k); // 90
		}
	}
	
	class Inner{
		
		int z = 30;
//		static int k = 40; // 에러!, static member 선언 불가
		int k = x; // x 에 접근 가능
		void show(){
			System.out.println(y+z+k); // 60
		}
	}
	
	public static void main(String[] args) {
		
		Outer.StaticInner osi = new Outer.StaticInner(); // 객체 생성
		osi.show();
		
		Outer o = new Outer(); // Outer 객체 먼저 생성
		Outer.Inner i = o.new Inner(); // Outer 객체 참조를 통해 Inner 객체 생성완료
		i.show();
		
		Outer$SecondInner si = new Outer$SecondInner(o);
		si.show();
	}
}

// 이런 형태로 클래스를 정의하는 것은 가능하지만
// 이건 inner 클래스가 아님!!!
class Outer$SecondInner{
	
	Outer o;
	int z = 30;
	int k;
	
	public Outer$SecondInner(Outer o){
		this.o = o;
		k = o.x;
	}
	
	void show(){
		System.out.println(Outer.y + z + k);
	}
}

/*
 * static inner class
 * 1. Outer class의 static 멤버에만 접근할 수 있다.
 * 2. static 멤버 역할 뿐만 아니라 객체도 생성할 수 있다.
 * 3. 객체를 생성할 때는 (outer 클래스의 이름).(innser 클래스의 이름)을 사용한다.
 * 
 * non-static inner class
 * 1. outer class의 모든 멤버에 접근할 수 있다.
 * 2 . static 멤버를 선언할 수 없다.
 *
 */
