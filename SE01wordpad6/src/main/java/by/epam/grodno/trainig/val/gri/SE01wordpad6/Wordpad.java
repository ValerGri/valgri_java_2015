/**
 * 
 */
package by.epam.grodno.trainig.val.gri.SE01wordpad6;

/**
 * @author Gri
 * 
 * @ импорт класса для консольного ввода информации
 * 
 *
 */
import java.util.Scanner; 
public class Wordpad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int comand=0;
		Scanner in = new Scanner(System.in);
        System.out.println("Для добавления записи в блокнот нажмите 1 ");
        System.out.println("Для удаления записи  нажмите 2 ");
        System.out.println("Для редактирования записи  нажмите 3 ");
        System.out.println("Для просмотра всех записей нажмите 4");
         comand=in.nextInt();
        if (comand== 1)
        {
        	System.out.println("Введите запись ");
        }
        if (comand== 2)
        {
        	System.out.println(" Удаление записи ");
        }
        if (comand== 3)
        {
        	System.out.println(" Редактирование записи ");
        }
        if (comand== 2)
        {
        	System.out.println(" Просмотр всех записей ");
        }
	}

}