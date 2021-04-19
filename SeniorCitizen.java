package second;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth(yyyy-mm-dd):");
       String dob=sc.next();//enter the date of birth......
       LocalDate now=LocalDate.now();
       LocalDate dateofbirth=LocalDate.parse(dob);
       Period period=Period.between(dateofbirth,now);
       int age=period.getYears();
       boolean validation=senior(age);
		System.out.println("your age is %d years" + validation);
		double h=0;
		if(age>=60)
		{
			System.out.println("you have an 50% discount!!!!");

		}
		else
		{
			System.out.println("Your bill amount " + h);
			System.exit(0);
		}
	      sc.close();

	  }
		public static boolean senior(int age)
		{
			boolean validation=true;
			if(age>=60)
			{
				validation=true;
			}
			else
			{
				validation =false;
			}

         return validation; 
		}
	

}
