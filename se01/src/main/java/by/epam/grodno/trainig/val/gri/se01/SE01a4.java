package by.epam.grodno.trainig.val.gri.se01;

public class SE01a4 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int n=10;
		int array [] [];
		array = new int[n+1] [n+1];
		
		while (i<=n )
		{
			if (j==i)
			{
				array [i][j]=1;
				System.out.print(" " + array[i][j]);
			}
			else
			{
			array [i][j]=0;
			
			System.out.print(" " + array[i][j]);
			
			}
           
			if (i==n && j<n)
			{
				System.out.println(""); //перенести строку
				j++;
				i=0;
			}
			else
			{ i++; }
			
			
		}
	}

}
