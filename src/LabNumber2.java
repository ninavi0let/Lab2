import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double length;
		double width;
		double height;

		double area;
		double perimeter;
		double volume;

		String cont = "y";

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		while (cont.equals(new String("y"))) {
			System.out.println("Enter length");
			length = scnr.nextDouble();

			System.out.println("Enter width");
			width = scnr.nextDouble();

			System.out.println("Enter height");
			height = scnr.nextDouble();

			area = length * width;
			perimeter = (length * 2) + (width * 2);
			volume = length * width * height;

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			System.out.println("Continue? (y/n):");
			cont = scnr.next();

		}

		System.out.println("Goodbye!");

	}

}
