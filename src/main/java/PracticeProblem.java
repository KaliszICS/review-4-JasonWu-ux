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
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = s.nextLine();
		String combined = "5" + input;
 		int num = Integer.parseInt(combined);
		num = num + 5;
		System.out.println(num);
    	s.close();

	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String input = s.nextLine();
		String combined = "4" + input;
		String combined2 = combined + "3";
 		Double num = Double.parseDouble(combined2);
		num = num + 3.4;
		System.out.println(num);
		s.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		boolean input = s.nextBoolean();
		boolean result = !input;
		System.out.println(result);

		s.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int input = s.nextInt();
		char result = (char)(input * 10 + 5);
		System.out.println(result);
		s.close();
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int input = s.nextInt();
		double result = input * 5.0;
		System.out.println(result);
		s.close();

	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String input = s.nextLine();
		double num = Double.parseDouble(input);
		int intPart = (int) num;
		String combined = "1" + intPart;
		int result = Integer.parseInt(combined);
		System.out.println(result);
		s.close();
	}

}
