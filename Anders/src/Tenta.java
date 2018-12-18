
public class Tenta {
	public static void main(String[] args) {
		Tenta tenta = new Tenta();
		tenta.printTimes("test", 5);
		System.out.println(tenta.div(3, 2));
		tenta.chooseCountry("NO");
		double[] array = {1.2, 3.5, 2.2, 5.8};
		System.out.println(tenta.sumInArray(array));
	}
	
	public void printTimes(String text, int times) {
		for(int i = 0; i < times; i++) {
			System.out.println(text);
		}
	}
	
	public double div(int a, int b) {
		return (double)a/b;
	}
	
	public void chooseCountry(String countryCode) {
		System.out.println(country(countryCode));
	}
	
	private String country(String countryCode) {
		switch(countryCode) {
			case "SE": return "Sweden";
			case "IS": return "Iceland";
			case "RU": return "Russia";
			case "NO": return "Norway";
			default: return "other countries";
		}
	}
	
	public double sumInArray(double[] array) {
		double sum = 0d;
		for(double number : array) {
			sum += number;
		}
		return sum;
	}

}
