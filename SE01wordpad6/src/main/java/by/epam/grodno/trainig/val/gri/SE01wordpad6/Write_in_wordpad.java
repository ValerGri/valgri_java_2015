package by.epam.grodno.trainig.val.gri.SE01wordpad6;

import by.epam.grodno.trainig.val.gri.SE01wordpad6.Wordpad;
import java.util.Scanner;



public class Write_in_wordpad {
	Wordpad wordpad =new Wordpad();
	
	public  void Write(String str, int i) {
		
		wordpad.create(str, i);
		

	}
	public void view_all(int i)
	{
		
	int buf=0;
	
	while (buf<i)
	{
		System.out.println("s" +wordpad.View(buf));	
		buf++;
		
	}
	buf=0; // reset
	}


	public static void main(String[] args) {
		Write_in_wordpad write_in_wordpad =new Write_in_wordpad();
		
		int comand=0;
Scanner in = new Scanner(System.in);
int count=0;
int i=0;
while ( count<1 ){
	
System.out.println("Для добавления записи в блокнот нажмите 1 ");
System.out.println("Для удаления записи  нажмите 2 ");
System.out.println("Для редактирования записи  нажмите 3 ");
System.out.println("Для просмотра всех записей нажмите 4");
 comand=in.nextInt();
if (comand== 1)
{
	System.out.println("Введите запись ");
	String st = in.next();
	write_in_wordpad.Write(st, i );
	count--;
	i++;
}
if (comand== 2)
{
	System.out.println(" Удаление записи ");
}
if (comand== 3)
{
	System.out.println(" Редактирование записи ");
}
if (comand== 4)
{
	System.out.println(" Просмотр всех записей " );
	write_in_wordpad.view_all( i );
	count--;
}

count++;
}
	}
}
