package Ch06;

public class Ex062_2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++){
			if(PrimeNumber(i)){
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean PrimeNumber(int num){
		if(num==1)
			return false;
		for(int i=2; i<num; i++){
			if(num%i==0)
				return false;
		}
		return true;
	}

}
