package by.epam.grodno.trainig.val.gri.se03;

import java.io.IOException;

import java.io.UnsupportedEncodingException;

import java.util.Locale;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Local {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Выберите язык");
		System.out.println("1 – Английский");

		System.out.println("2 – Русский");
		int lang = in.nextInt();
		String country = "", language = "";
		if (lang == 1) {
			country = "US";

			language = "EN";
		}
		if (lang == 2) {
			country = "RU";
			language = "RUS";
		}
		Locale current = new Locale(language, country);

		ResourceBundle rb = ResourceBundle.getBundle("by.epam.grodno.trainig.val.gri.se03.text", current);
		try {

			String st = rb.getString("str1");

			String s1 =

			new String(st.getBytes("ISO-8859-1"), "UTF-8");
			System.out.println("1");
			System.out.println(s1);

			st = rb.getString("str2");

			String s2 =

			new String(st.getBytes("ISO-8859-1"), "UTF-8");

			System.out.println("2");
			System.out.println(s2);
			st = rb.getString("str3");

			String s3 =

			new String(st.getBytes("ISO-8859-1"), "UTF-8");

			System.out.println("3");
			System.out.println(s3);
			int langanswear = in.nextInt();
			switch (langanswear) {
			case 1:
				st = rb.getString("str4");

				String s4 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
				System.out.println(s4);
				break;
			case 2: st = rb.getString("str5");

			String s5 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
			System.out.println(s5);	
			break;
			case 3: st = rb.getString("str6");

			String s6 = new String(st.getBytes("ISO-8859-1"), "UTF-8");
			System.out.println(s6);
			break;

			}

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}

	}

}
