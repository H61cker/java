package kr.hs.dgsw.ch17;

class Parent{
	int i=7;
	public int get(){
		return i;
	}


}

class Child extends Parent
{
	int i=5;
	public int get(){
		return i;
	}
}

public class ChildTest {
	
	public static void print(Parent p){
		System.out.println(p.i);
		System.out.println(p.get());
	}
	
	public static void main(String[] args) 
	{
		Parent p = new Parent();
		System.out.println("-----------1------------");
		System.out.println(p.i);
		System.out.println(p.get());
		
		Child c = new Child();
		System.out.println("--------2¹ø--------");
		System.out.println(c.i);
		System.out.println(c.get());
		
		Parent p2 = new Child();
		System.out.println("--------3¹ø--------");
		System.out.println(p2.i);
		
		System.out.println("-----------4¹ø-------");
		print(c);
		print(p2);
	}
}
