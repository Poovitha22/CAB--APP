package second;

import java.util.Scanner;

public class LoginScreen { 
	public static boolean num(long mobileNo, long passWord)
	{   
		boolean validation=true;
		String mobileNoString = String.valueOf(mobileNo);
		String passWordString = String.valueOf(passWord);
        if((mobileNoString.length() == 10) && (passWordString.length() >= 8))// check the 10 digits number
		{
			
			validation = true;
		}
        else 
		{
		    validation = false;
		}
      return validation;
		
	}
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MOBILE NUMBER :");
		long mobileNo = sc.nextLong();// enter the mobile number
		System.out.println("ENTER THE PASSWORD :");
		long passWord = sc.nextLong();// enter the password
		boolean  validate = num(mobileNo,passWord);
		if(validate==true)
		{
			System.out.println("LOGIN SUCCESSFULLY!!!!!");
		}
		else
		{
			System.out.println("ENTER THE VALID INFORMATION");
			System.exit(0);
		}
        sc.close();
	}
}
