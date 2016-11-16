package kr.hs.dgsw.ch17;

interface iA{
	
	int num = 0; // final static 
	
	void show();
	
	// �������̵� �ص��ǰ� ���ص��ȴ� -> default Ű����
	default void show1(){
		System.out.println("show1 of interface iA");
	}
}

interface iB extends iA{}

class A implements iA, iB{
	public void show()
	{
		System.out.println("num is "+num);
		System.out.println("show of class A");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		
		A a = new A();
		a.show();
		a.show1();
		
	}
}
