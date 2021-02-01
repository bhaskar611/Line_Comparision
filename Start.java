import java.util.*;

public class Start {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program ");


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cordinates of 1st point");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Enter the cordinates of 2nd point");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int cal1 = (int) Math.pow((x2-x1), 2);
		int cal2 = (int) Math.pow((y2-y1), 2);

		double Length =  Math.sqrt(cal1+cal2);

		System.out.println("Lenght of line: "+ Length);

	}
}




