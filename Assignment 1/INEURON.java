package Assignment1;

public class INEURON 
{
	public static void main(String[] args)//main method declare
	{
		int n=11;//data type declare with variable value
		for(int i=0;i<n;i++)//outer line for rows
		{
			for(int j=0;j<n;j++)//inner line for columns
			{
				if(
				   (i==0&&j<=(3*n)/4)||
				   (i==n-1&&j<=(3*n)/4)||
				   (j==(n-1)/2-1)
				   )
					
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)//inner line for columns
			{
				if((i==j)||
				   (j==0)||
				   (j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)//inner line for columns
			{
				if((i==0&&j>=n/4&&j<n-1)||
				   (i==(n-1)/2&&j>=n/4&&j<n-1)||
				   (i==n-1&&j>=n/4&&j<n-1)||
				   (j==n/4)
				   )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)//inner line for columns
			{
				if((j==n/4-1&&i<n-1)||
				   (j==(3*n)/4+1&&i<n-1)||
				   (i==n-1&&j>n/4-1&&j<(3*n)/4+1)
				   )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)//inner line for columns
			{
				if(
						(j==0)||
						(i==0&&j<(3*n)/4)||
						(i==(n-1)/2&&j>0&&j<(3*n)/4)||
						(j==(3*n)/4&&i>0&&i<(n-1)/2)||
						(i-j==(n-1)/2)&&(j<=(3*n)/4)&&(i<n-1/2)
				   )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}for(int j=0;j<n;j++)//inner line for columns
			{
				if(
						(i==0&&j>0&&j<(3*n)/4)||
						(i==n-1&&j>0&&j<(3*n)/4)||
						(j==0&&i>0&&i<n-1)||
						(j==(3*n)/4&&i>0&&i<n-1)
						
				   )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)//inner line for columns
			{
				if((i==j)||
				   (j==0)||
				   (j==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
			

}
