package second;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class OlaAp {

	public static void main(String[] args) {
		// level 1 login
		double g = 0;
		System.out.println("enter the mobile no");
		Scanner sc = new Scanner(System.in);
		long mobileNo = sc.nextLong();// enter the mobile number
		String mobileNoString = String.valueOf(mobileNo);
		if (mobileNoString.length() == 10)// check the 10 digits number
		{
			System.out.println("enter the password");
		} else {
			System.out.println("retype the mobile number");
		}
		long keyNo = sc.nextLong();// enter the password
		String keyNoString = String.valueOf(keyNo);
		if (keyNoString.length() >= 8)// check the password
		{
			System.out.println("submit");
		} else {
			System.out.println("retype password");

		}
		// level 2 cabTypes
		
		String cabTypes1= "micro";
		String cabTypes2 = "mini";
		String cabTypes3 = "prime";
		System.out.println("per kilometre Rs.10 for " + cabTypes1);
		System.out.println("per kilometre Rs.15 for " + cabTypes2);
		System.out.println("per kilometre Rs.20 for " + cabTypes3);
		// level 3 prime estimeter
		System.out.println("enter the car type");
	    int a=sc.nextInt();
        int b = 10;
	    System.out.println("enter the kms " + b);
	    int c=0;
		if(a==1)
		{
			c=b*10;
			System.out.println("your total bill amount is " + c);
		}
		else if(a==2)
		{
			 c=b*15;
			System.out.println("your total bill amount is " + c);
		}
		else
		{
			c=b*20;
			System.out.println("your total bill amount is " + c);
		}
		// level 4 GST calculation
		double f=c+(c*0.07);
	    System.out.println("your total bill amount with GST is "+ f);
	    
	    // level 5 booking
	    System.out.println("enter the date :");
		String date=sc.next();//enter the journey date.......
		LocalDate journeydate=LocalDate.parse(date);
		String time="17:30:00";
        LocalTime cabpickuptime=LocalTime.parse(time);	    
        System.out.println(cabpickuptime);
        System.out.println(c + "journey date:"+ journeydate +"pickup time:" + time);
        System.out.println("submit");
	    
		//level 6 peak hours
	    
        int hour=cabpickuptime.getHour();
        System.out.println("Hour"+ hour);
         if (hour>=17 && hour<19)// check the peak hour timings........
         {
        	 System.out.println(" it is a peakhour");
        	 g= f +(f*0.0125);
        	 System.out.println("your actual bill amount is "+ g); 
         }
         else
         {
        	 System.out.println("it is not a peakhour");
        	 System.out.println("your bill amount is "+ f);
         }
     //level 7 senior citizen
         System.out.println("enter your date of birth(yyyy-mm-dd):");
         String dob=sc.next();//enter the date of birth......
        LocalDate now=LocalDate.now();
        LocalDate dateofbirth=LocalDate.parse(dob);
        Period period=Period.between(dateofbirth,now);
        int age=period.getYears();
		System.out.println("your age is %d years" + age);
		double h=0;
		if((age>=60)&&(hour>=17 && hour<19))
		{
			System.out.println("you have an 50% discount!!!!");
		    h=(g*0.5);
			System.out.println("Your bill amount " + h);
			
		}
		else if(age>=60)
		{
			System.out.println("You have an 50% discount!!!!");
			h=f*0.5;
			System.out.println("Your bill amount " + h);
		}
		else if((age<60) &&(hour>=17 && hour<19)) {
			System.out.println("your actual bill amount is "+ g);
		}
		else
		{
			System.out.println("Your actual bill amount is "+ f);
		}

	    sc.close();
}

}


