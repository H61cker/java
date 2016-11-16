package Ch06;

public class Ex062_1 {

	public static void main(String[] args) {
		int radius = 5;
		System.out.println(radius_Area(radius));
		System.out.println(radius_Girth(radius));
	}

	public static double radius_Area(int area){
		return (area*area)*3.14;
	}
	
	public static double radius_Girth(int area){
		return (2*area)*3.14;
	}
}
