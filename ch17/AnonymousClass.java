package kr.hs.dgsw.ch17;


interface Shapes{
	void calArea();
}


class ShapeImpl implements Shapes{
	
	public void calArea(){
		
		System.out.println("in CalArea of ShapeImpl1");
	}
	
}

public class AnonymousClass {
	int x = 10;
	static int y = 20;
	
	static void show(Shapes s){
		s.calArea();
	}
	
	public static void main(String[] args) {
		
		int z =30;
		
		show(new ShapeImpl());
		
		show(new Shapes(){
			
			public void calArea(){
				System.out.println("in calArea of anonymous class " + y + z);
				// x에는 ㅈ버근 불가!!!
			}
		});
		
	}
	
}
