import java.util.Scanner;
class shape
{
	static int area(int a)
	{
		return a*a;
	}
	static int area(int l,int b)
	{
		return l*b;
	}
	static double area(double r)
	{
		return 3.14*r*r;
	}
	
}
class Overshape1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter side of square:");
		int a=sc.nextInt();
		System.out.println("Enter length of rectangle:");
		int l=sc.nextInt();
		System.out.println("Enter breadth of retangle:");
		int b=sc.nextInt();
		System.out.println("Enter radius of circle:");
		double r=sc.nextDouble();
		System.out.println("Area of square:"+shape.area(a));
		System.out.println("Area of rectangle:"+shape.area(l,b));
		System.out.println("Area of circle:"+shape.area(r));


	}
}