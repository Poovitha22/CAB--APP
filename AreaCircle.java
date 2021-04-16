package project1;

public class AreaCircle {
public static double area(double r)
{
	double area=Math.PI*r*r;
     return area;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r=2;
	 double result=area(r);
		System.out.println(result);

	}

}
