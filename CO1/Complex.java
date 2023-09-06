import java.util.Scanner;
public class Complex
{
	public static void main(String args[])
	{
		int a,b,c,d,fnum,snum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real part of first number : ");
		a=sc.nextInt();
		System.out.println("Enter the imaginary part of first number : ");
		b=sc.nextInt();
		System.out.println();
		System.out.println("Enter the real part of second number : ");
		c=sc.nextInt();
		System.out.println("Enter the imaginary part of second number : ");
		d=sc.nextInt();
		fnum=a+c;
		snum=b+d;
		System.out.printf("Sum is: "+ fnum+" + "+ snum +"i");
	}
}

	