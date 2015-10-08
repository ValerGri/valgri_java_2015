package by.epam.grodno.trainig.val.gri.se01;

public class SE01c3 {

	public static void main(String[] args) {
		int a=0;
		int b=50;
		int h=1;
		System.out.print(" x ");
		System.out.print("  F(x)");
		System.out.println("     ");
		for (int x=a; x<=b; x=x+h )
		{ double f=0.0d;
			if (2*x==90)// тангенс не определён
			{
				System.out.println(" ERROR ");
			}
			else
			{
			f=Math.tan(2*x)-3;
			System.out.print(" " +x);
			System.out.println(" " +f);
			}
			
		}
	}

}
