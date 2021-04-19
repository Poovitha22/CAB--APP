package second;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CarBook {
	public static int car(int a,int b)
	{
		int c;
		if(a==1) {
			 c=b*10;	
		}
		else {
			c=b*15;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the car type");
		Scanner n=new Scanner(System.in);
		int a=n.nextInt();
		System.out.println("enter the kms");
		int b=n.nextInt();
        int x=car(a,b);
        LocalDate now=LocalDate.now();
        LocalTime time=LocalTime.now();
	    System.out.println(x + " date:"+now +" time:" + time);
        n.close();
	}

}
