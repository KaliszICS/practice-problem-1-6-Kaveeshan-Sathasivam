import java.util.Scanner;

public class PracticeProblem {


	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a boolean: ");
        boolean value = scanner.nextBoolean();

        System.out.println(value);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        System.out.println(number > 5);

	}

	public static void q3() {
		//Write question 3 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input pizza: ");
        String input = scanner.nextLine();

        System.out.println(input.equals("pizza"));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
        double number = scanner.nextDouble(); // Save the number in a double variable

        // Store the result in a boolean
        boolean isZero = (number == 0.0);

        // Output the boolean
        System.out.println(isZero);

        scanner.close();

	}

	public static void q5() {
		//Write question 5 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        System.out.println(number != 0);
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word earlier than google: ");
        String word = scanner.nextLine();

        System.out.println(word.compareTo("google") < 0);


	}

}
