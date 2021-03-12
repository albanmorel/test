public class Calculator {

	public int add(int valueA, int valueB) {
		return valueA + valueB;
	}

	public int subtract(int valueA, int valueB) {
		return valueA - valueB;
	}

	public int multiplie(int valueA, int valueB) {
		return valueA * valueB;
	}

	public int divide(int valueA, int valueB) {
		try {
			return valueA / valueB;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public boolean isEven(int number) {
		return (number % 2 == 0);
	}

	public boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}