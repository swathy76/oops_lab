import java.util.Scanner;
public class sort
{
	public static void main(String[] args)
	{
		int n;
		String temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of names: ");
		n=s.nextInt();
		String names[]=new String[n];
		Scanner s1=new Scanner(System.in);
		System.out.println("enter  the names:");
		for(int i=0;i<n;i++)
		{
			names[i]=s1.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Names in sorted order:");
		for(int i=0;i<n;i++)
		System.out.println(names[i]);
	}
}