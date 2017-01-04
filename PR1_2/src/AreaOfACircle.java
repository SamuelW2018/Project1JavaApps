import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String[] args)
	{
		System.out.printf("Input the radius of a circle");
		final float PI =  3.14f;
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		
		float Area = PI*r*r;
		
		System.out.printf("The area of the circle with radius %d is %f.\n", r, Area);
	}
}
