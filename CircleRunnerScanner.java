import java.util.Scanner;

public class CircleRunnerScanner {

	public static void main(String[] args) {

		Circles one = new Circles();
		one.changeRadius(10);
		System.out.println(one);
		System.out.println();

		Circles two = new Circles(11.9);
		System.out.println(two);
		System.out.println();

		Scanner key = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = key.nextDouble();
		Circles three = new Circles(r);
		System.out.println(three);
		System.exit(0);
	}

}