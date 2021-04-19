package second;
import java.util.Scanner;

public class FinalApp {
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
	System.out.println("enter the car type");
    String str = sc.nextLine();
	int b=10;
    System.out.println("enter the kms"+b);
    int c=0;
	if(str.equals("micro"))
	{
		c=b*10;
		System.out.println("your total bill amount is " + c);
	}
	else if(str.equals("mini"))
	{
		 c=b*15;
		System.out.println("your total bill amount is " + c);

	}
	else if(str.equals("prime"))
	{
		c=b*15;
		System.out.println("your total bill amount is " + c);

	}
sc.close();
	}
}
