/**
 * 
 */
package by.epam.grodno.trainig.val.gri.SE01wordpad6;

/**
 * @author Gri
 * 
 * 
 * 
 *
 */

public class Wordpad {
	String[] s = new String[10]; 
/**
 * Метод создающий запись
 * @param string
 * @param number
 */
	public void create(String string, int number) {

		s[number] = string;

	}

	/**
	 * Метод, возвращающий запись под номером number
	 * @param number
	 * @return
	 */
	public String view(int number) {
		return s[number];
	}

}