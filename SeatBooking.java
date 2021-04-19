package second;

import java.util.Scanner;

public class SeatBooking {

	public static void seatBooking(int a ,int b) {
		int c;
		switch(a) 
		{
		case 1:
		{
		System.out.println("YOU BOOKING THE SEAT IS SILVER AND YOUR COST IS RS.100");
		c=b*100;	
		System.out.println("YOUR BOOKING AMOUNT " + c);
		System.out.println("BOOKING SUCCESFULLY ENJOY YOUR CINIEMA!!!!!!");
		break;
		}
		case 2:
		{
		System.out.println("YOU BOOKING THE SEAT IS GOLD AND YOUR COST IS RS.150");		
		c=b*150;	
		System.out.println("YOUR BOOKING AMOUNT " + c);
        System.out.println("BOOKING SUCCESFULLY ENJOY YOUR CINIEMA!!!!!!");
        break;
		}
		case 3:
		{
		System.out.println("YOU BOOKING THE SEAT IS PRIME AND YOUR COST IS RS.200");
		c=b*200;	
		System.out.println("YOUR BOOKING AMOUNT " + c);
		System.out.println("BOOKING SUCCESFULLY ENJOY YOUR CINIEMA!!!!!!");
		break;
		}
		default:
		{
			System.out.println("YOUR BOOKING IS NOT SUCCESSFULLY PLEASE ENTER THE VAILD SEAT.....");
		break;
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
		int b=10;
        seatBooking(a,b);
		
		sc.close();


	}

}
