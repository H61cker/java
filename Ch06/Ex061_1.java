package Ch06;


public class Ex061_1 {

	public static void main(String[] args) {
		
		int n1 = 20;
		int n2 = 10;
		
		Calculator(n1,n2);

	}
	
	public static void Calculator(int n1 , int n2){
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
	}

}