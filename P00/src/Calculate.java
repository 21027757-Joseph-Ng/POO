
public class Calculate {

	public static void main(String[] args) {

	}
	
	public int add(int a, int b) {
		int result = a + b;
		if (result >= -32768 && result <= 32768) {
			return result;
		}
		else {
			return 0;
		}
	}
	
	public int substract(int a, int b) {
		int result = a - b;
		if (result >= -32768 && result <= 32768) {
			return result;
		}
		else {
			return 0;
		}
	}
	
	public int multiple(int a, int b) {
		int result = a * b;
		if (result >= -32768 && result <= 32768) {
			return result;
		}
		else {
			return 0;
		}
	}
	
	public double devide(double a, double b) {
		if (b != 0) {
			double result = a/b;
			if (result >= -32768 && result <= 32768) {
				return Math.round(result);
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}

}
