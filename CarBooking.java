package second;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CarBooking {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the car type");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
if(a==1) {
	System.out.println("enter the kms");
	int b=sc.nextInt();
	int c=b*10;
	LocalDate now=LocalDate.now();
    LocalTime time=LocalTime.now();
    System.out.println(c + " date:"+now +" time:" + time);

}
else
	System.out.println("enter the kms");
    int b=sc.nextInt();
    int c=b*15;
    LocalDate now=LocalDate.now();
    LocalTime time=LocalTime.now();
    System.out.println(c + " date:"+now +" time:" + time);

   sc.close();  
	
	}

}
