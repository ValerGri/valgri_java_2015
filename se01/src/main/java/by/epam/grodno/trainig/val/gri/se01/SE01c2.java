package by.epam.grodno.trainig.val.gri.se01;

public class SE01c2 {
	public static void main(String args []){
long array [];
	int index=0;	
array = new long[20];
int value=10;
while (index <20)
{

	array[index]=value;
	System.out.println(" " + array[index]);

	value=value+2;
index++;
	}
System.out.println(" Каждый второй элемент, умноженный на предыдущий ");

index=2;
do
{
	if (index ==2)
	
		System.out.println(" " + array[index]);
	else
	{
		long bufer=array[index];
		array[index]=array[index]*array[index-2];
		System.out.println(" " + array[index]);
		array[index]=bufer;//reset
	}
	index=index+2;
	} while (index <20);
	

}
}
