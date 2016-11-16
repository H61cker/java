package kr.hs.dgsw.ch17;

public class Outer {
	int x = 10;
	static int y = 20;
	
	static class StaticInner{
		int z = 30;
		static int k = 40;
		void show(){
//			System.out.println(x + y); // ����!, static member ���� ���� ����!
			System.out.println(y+z+k); // 90
		}
	}
	
	class Inner{
		
		int z = 30;
//		static int k = 40; // ����!, static member ���� �Ұ�
		int k = x; // x �� ���� ����
		void show(){
			System.out.println(y+z+k); // 60
		}
	}
	
	public static void main(String[] args) {
		
		Outer.StaticInner osi = new Outer.StaticInner(); // ��ü ����
		osi.show();
		
		Outer o = new Outer(); // Outer ��ü ���� ����
		Outer.Inner i = o.new Inner(); // Outer ��ü ������ ���� Inner ��ü �����Ϸ�
		i.show();
		
		Outer$SecondInner si = new Outer$SecondInner(o);
		si.show();
	}
}

// �̷� ���·� Ŭ������ �����ϴ� ���� ����������
// �̰� inner Ŭ������ �ƴ�!!!
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
 * 1. Outer class�� static ������� ������ �� �ִ�.
 * 2. static ��� ���� �Ӹ� �ƴ϶� ��ü�� ������ �� �ִ�.
 * 3. ��ü�� ������ ���� (outer Ŭ������ �̸�).(innser Ŭ������ �̸�)�� ����Ѵ�.
 * 
 * non-static inner class
 * 1. outer class�� ��� ����� ������ �� �ִ�.
 * 2 . static ����� ������ �� ����.
 *
 */
