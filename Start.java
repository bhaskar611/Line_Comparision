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
		System.out.println("For Line 2: Enter the cordinates of 1st point");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
                System.out.println("For Line 2: Enter the cordinates of 2nd point");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();


		int cal1 = (int) Math.pow((x2-x1), 2);
		int cal2 = (int) Math.pow((y2-y1), 2);
		int cal3 = (int) Math.pow((x4-x3), 2);
		int cal4 = (int) Math.pow((y4-y3), 2);


                double Length1 =  Math.sqrt(cal1+cal2);
		double Length2 =  Math.sqrt(cal3+cal4);
		System.out.println("Length of Line1 and Line2 is "+ Length1 +" & "+ Length2);

		String L1 = Double.toString(Length1);
		String L2 = Double.toString(Length2);


		System.out.println(L1.equals(L2));

	}
}




