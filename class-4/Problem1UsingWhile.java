public class Problem1UsingWhile {
	public static void main(String[] args) {
		milesToKilometers();
	}
	
	public static void milesToKilometers() {
		int i = 0;
		while (i <= 10){
			System.out.println(i + "          " + (i * 1.609));
			i++;
		}
	}
}