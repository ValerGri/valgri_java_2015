package by.epam.grodno.trainig.val.gri.SE01wordpad6;

import by.epam.grodno.trainig.val.gri.SE01wordpad6.Wordpad;
import java.util.Scanner;

public class Write_in_wordpad {
	Wordpad wordpad = new Wordpad();

	/**
	 * Метод для добавления новой записи str
	 * @param str
	 * @param i
	 */
	public void write(String str, int i) {

		wordpad.create(str, i);

	}
/**
 * Метод для просмотра i-ой записи
 * @param i
 */
	
	public void view_all(int i) {

		int buf = 0;

		while (buf < i) {
			System.out.println("Запись номер " + buf);
			System.out.println("" + wordpad.view(buf));

			buf++;

		}

	}
/**
 * Метод для удаления i-ой записи
 * @param i
 */
	public void delete(int i) {
		String str = null;
		wordpad.create(str, i);
	}
/**
 * Метод для редактирования i-ой записи
 * @param str
 * @param i
 */
	
	public void edit(String str, int i) {

		wordpad.create(str, i);
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Write_in_wordpad write_in_wordpad = new Write_in_wordpad();

		int comand = 0;
		Scanner in = new Scanner(System.in);
		int count = 0;
		int i = 0;
		while (count < 1) {

			System.out.println("Для добавления записи в блокнот нажмите 1 ");
			System.out.println("Для удаления записи  нажмите 2 ");
			System.out.println("Для редактирования записи  нажмите 3 ");
			System.out.println("Для просмотра всех записей нажмите 4");
			comand = in.nextInt();
			if (comand == 1) {
				System.out.println("Введите запись ");
				String st = in.next();
				write_in_wordpad.write(st, i);
				count--;
				i++;
			}
			if (comand == 2) {
				System.out.println(" Удаление записи ");
				System.out.println(" Введите номер удаляемой записи ");
				int num = in.nextInt();
				write_in_wordpad.delete(num);
				count--;
			}
			if (comand == 3) {
				System.out.println(" Редактирование записи ");
				System.out.println(" Введите номер редактируемой записи ");
				int num = in.nextInt();
				System.out.println(" Введите текст ");
				String st = in.next();
				write_in_wordpad.edit(st, num);
				count--;
			}
			if (comand == 4) {
				System.out.println(" Просмотр всех записей ");
				write_in_wordpad.view_all(i);

				count--;
			}

			count++;
		}
	}
}
