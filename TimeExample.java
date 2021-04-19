package second;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time="16:30:00";
		LocalDate dateofbirth=LocalDate.parse("2020-02-02");
		LocalTime cabpickuptime=LocalTime.parse(time);
		System.out.println(cabpickuptime);
		LocalDate currentdate=LocalDate.now();
		if(dateofbirth.isBefore(currentdate)) {
			System.out.println("isBefore");
		}
		else
		{
			System.out.println("isAfter");
		}
        int hour=cabpickuptime.getHour();
        System.out.println("Hour"+ hour);
         if (hour>=16&& hour<18)
         {
        	 System.out.println("peakhour");
         }
         else
         {
        	 System.out.println("not a peakhour");
         }
         String cabType="micro";
         if(cabType.equals("micro"))
         {
        	 System.out.println("happy journey");
 
         }
         else
         {
        	 System.out.println("safe journey");
         }
         if(dateofbirth.isEqual(LocalDate.now()));
         {
        	 System.out.println("Given date is today date");
         }
         long mobileNo=1234567890;
         String mobileNoString=String.valueOf(mobileNo);
         if(mobileNoString.length()==10)
         {
        	 System.out.println("mobileno: "+ mobileNo);
         }
	}

}
