package Ch06;

public class Ex063_2 {

	public static void main(String[] args) {
		
		Binary(10);

	}
	
	public static void Binary(int n)
	{
		if(n==0)
			return;
		else{
			int bin;
			bin = n%2;
			n /= 2;
			Binary(n);
			System.out.print(bin);
		}
	}

}
