import java.util.Scanner;
class Symmetric
{
	public static void main(String args[])
	{
	int row,col,i,j,count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = s.nextInt();
		System.out.println("Enter the number of columns\n");
		col = s.nextInt();
		
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		
		System.out.println("Enter the elements of matrix\n");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
			
		}
	

for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				b[j][i]=a[i][j];
			}
			System.out.println();
		}
System.out.println("Transporse matrix");
for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(b[j][i]+"\t");
			}
			System.out.println();
		}
		
for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					count++;
					break;
				}
			}
			System.out.println();
		}
if(count==1)
{
	System.out.println("Symmetric Matrix");
}
else
{
	System.out.println("Not Symmetric");
}
	}
}
