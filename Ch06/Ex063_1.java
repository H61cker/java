package Ch06;

public class Ex063_1 {

	public static void main(String[] args) {
		System.out.println(Number(10));
	}
	
	public static int Number( int n ){
		if( n == 1)
			return 2;
		else
			return 2*Number(n-1);
		
	}

}
