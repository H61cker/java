package Ch06;

public class Ex061_2 {

	public static void main(String[] args) {
		
		int n1=20;
		int n2=10;
		
		calculator(n1,n2);

	}
	
	public static void calculator(int n1 , int n2){
		if(n1>n2)
			System.out.println(n1-n2);
		else
			System.out.println((n1-n2)*-1);
	}

}
