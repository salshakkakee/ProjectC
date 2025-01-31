package Demo1;

public class DemoTestC {
	public static void main(String[] args) {
		String result1 = getNumber(9);
		String result2 = getNumber(-4);
		String result3 = getNumber(0);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	public static String getNumber(int number) {

		String result = "";

		if (number > 0) {
			result = "Positive";

		} else if (number < 0) {
			result = "Negative";

		} else {
			result = "Zero";

		}
		return result;
	}
}
