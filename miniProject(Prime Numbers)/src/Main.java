
public class Main {
	static void isPrime(int number) {
		int temp = 0;
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0)
				temp++;
		}
		if (temp == 0 && number>1)
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is not a prime number");

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			isPrime(i);
		}
	}
}
