import java.io.*;
import java.util.*;

public class Pgm4 
{

	public static void main(String[] args) 
	{
	
		int i;
		try 
		{
			File f = new File("E:\\java\\CO6\\file2.txt");
			FileWriter w = new FileWriter(f);
			System.out.println("Enter the no. of integers to be inserted:");
			Scanner s = new Scanner(System.in);			
			int[] num = new int[20];
			int N = s.nextInt();
			System.out.println("\nEnter the integers:");
			for( i=0;i<N;i++) 
			{
				num[i] = s.nextInt();			
			}
			for(i=0;i<N;i++) 
			{
				w.write(num[i] + "\n");		
			}
			System.out.println("Integers inserted into File!!!!");
			w.close();
			FileReader r = new FileReader(f);
			FileOutputStream fo1 = new FileOutputStream("E:\\java\\CO6\\Even.txt");
			FileOutputStream fo2 = new FileOutputStream("E:\\java\\CO6\\Odd.txt");
			
			System.out.println("Copying even numbers and odd numbers to separate files.\n.\n.\n.");
			 
			while((i=r.read()) != -1) 
			   	  
			    {
			     if(i%2==0)
			      fo1.write(i);
			     else
			      fo2.write(i);
			    }
			 
			System.out.println("Done. . !!!");
			r.close();
			fo1.close();
			fo2.close();
			
		}
		catch(IOException e) 
		{
			System.out.println("An error occured..."+e);
		}

	}

}