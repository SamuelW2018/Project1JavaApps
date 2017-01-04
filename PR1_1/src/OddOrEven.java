import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args)
	{
		System.out.printf("Please enter a number.\n");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		int y = x % 2;
		if (y == 1)
			System.out.printf("The number %d is odd.\n", x);
		else
			System.out.printf("The number %d is even.\n", x);
	}
}
