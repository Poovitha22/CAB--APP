package second;

import java.util.Scanner;

public class GstCalculation {
	public static void gst(int a) {// calculation of gst  
		double b=a+(a*0.07);
		System.out.println("WITH GST YOUR BOOKING AMOUNT "+ b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     gst(a);
     sc.close();
	}

}
