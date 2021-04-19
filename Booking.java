package second;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Booking {

	public static void seatRange(int a)
	{
		switch(a) {
		case 1:
		{
		System.out.println("YOU BOOKING THE SEAT IS SILVER AND YOUR COST IS RS.100");
		break;
		}
		case 2:
		{
		System.out.println("YOU BOOKING THE SEAT IS GOLD AND YOUR COST IS RS.150");
		break;
		}
		case 3:
		{
		System.out.println("YOU BOOKING THE SEAT IS PRIME AND YOUR COST IS RS.200");
		break;
		}
		default:
		{
			System.out.println("PLEASE ENTER THE VALID SEAT");
		}
		
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TYPES OF SEAT RANGE");
		System.out.println("SEAT 1 IS SILVER RS.100 PER SEAT");
		System.out.println("SEAT 2 IS GOLD RS.150 PER SEAT");
		System.out.println("SEAT 3 IS PRIME RS.200 PER SEAT ");
		System.out.println("ENTER THE SEAT RANGE ");
		Scanner sc=new Scanner(System.in);//ENTER THE SEAT RANGE 
		int a=sc.nextInt();
        seatRange(a);
        System.out.println("ENTER THE BOOKING TIME");
		String time=sc.next();// enter the booking time
		LocalTime bookingtime=LocalTime.parse(time);
		System.out.println(bookingtime);
		LocalDate currentdate=LocalDate.now();
        int hour=bookingtime.getHour();
        System.out.println("SHOW TIMING MRG:10:30 AFT:2:30 EVE:6:30 NGT:10:30 "+ hour);
        System.out.println("BOOKING DATE " + currentdate);
        sc.close();

	}


}
