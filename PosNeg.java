import java.util.*;

public class PosNeg{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = num.nextInt();  //type casting, type conversion
		if (a>0)
			System.out.println("It is positive");
		else if (a<0)
			System.out.println("It is positive");
		else if (a==0)
			System.out.println("It is zero");
			num.close();
	}
}
	