import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args)
	{
		System.out.printf("Please enter your weight in pounds");
		
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		
		System.out.printf("Please enter your height in inches");
		float y = input.nextFloat();
		
		float BMI = (x * 703) / (y*y);
		System.out.printf("Your BMI is %f.\n", BMI);
		
		System.out.printf("BMI VALUES \n");
		System.out.printf("Underweight: less than 18.5\n");
		System.out.printf("Normal:      between 18.5 and 24.9\n");
		System.out.printf("Overweight:  between 25 and 29.9\n");
		System.out.printf("Obese:       30 or greater\n");
	}
}
