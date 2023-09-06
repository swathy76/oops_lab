import java.util.Scanner;
public class Search
{
	
		int a[],flag=0,n;
		void  ReadArr()
		{
		Scanner sc=new Scanner(System.in);
                System.out.print("Enter limit of array:\n");
                n=sc.nextInt();
		a=new int[n];
		System.out.print("Enter Element to Store in Array :\n");
        for(int i=0; i<n; i++)
        {
		
           a[i] = sc.nextInt();
        }   
        
        }
        void PrintArr()
		{
			System.out.print("Elements in Array are :\n");
			for(int i=0; i<n; i++)
			{
				System.out.print(a[i] + "  ");
			}
		}
		void search()
		{
			int key;
			System.out.print("\nElements to search:\n");
			Scanner sc=new Scanner(System.in);
			key = sc.nextInt();
			for(int i=0; i<n; i++)
			{
				if(a[i]==key)
				{
					System.out.println("Element found\n");
                                        flag=1;
					break;
				}
                        }
			if(flag==0)
				{
					System.out.println("Element not found\n");
					
				}
			
		}	
		public static void main(String args[])
		{
			Search obj=new Search();
			obj.ReadArr();
			obj.PrintArr();
			obj.search();
		}
		
	
}
