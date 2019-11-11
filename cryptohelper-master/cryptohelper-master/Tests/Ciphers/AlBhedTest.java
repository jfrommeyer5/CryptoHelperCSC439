package Ciphers;

public class AlBhedTest {
	public static void main(String[] args) {
		String tester = AlBhed.encrypt("*");
		System.out.println("Begin Equivalence Testing");
		if (tester.length() == 0) {
			System.out.println("Passed special character test");
		}
		else {
			System.out.println("Failed special character test");
		}
		tester = AlBhed.encrypt("Hello World");
		if (tester.length() == 10) {
			System.out.println("Passed a-z character test");
		}
		else {
			System.out.println("Failed a-z character test");
		}
		tester = AlBhed.encrypt("1");
		if (tester.length() == 0) {
			System.out.println("Passed number character test");
		}
		else {
			System.out.println("Failed number character test");
		}
		System.out.println("Begin Decision Table Testing");
		System.out.println("\t\t 1 \t 2 \t 3 \t 4");
		System.out.println("Conditions");
		System.out.println("String \t  \t Yes \t Yes \t No \t No");
		System.out.println("a-z \t \t No \t Yes \t No \t Yes");
		System.out.println("Actions");
		System.out.println("Modify? \t No \t Yes \t No \t No");
	}
}
