package cycle2;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter your string1:");

		String str1 = s.nextLine();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your string2:");

		String str2 = sc.nextLine();

		System.out.println("1.length of the string1 is:" + str1.length());

		System.out.println("2.concatenation of strings is:" + str1.concat(str2));

		System.out.println("3.both strings are equal-" + str1.equals(str2));

		System.out.println("4.converting to lowercase:" + str1.toLowerCase());

		System.out.println("5.converting to uppercase:" + str2.toUpperCase());

		System.out.println("6.removing whitespaces:" + str1.trim());

		System.out.println("enter an index number:");

		int i;

		Scanner sc1 = new Scanner(System.in);

		i = sc1.nextInt();

		System.out.println("7.character at index number" + " " + i + "is" + " " + str1.charAt(i));

		System.out.println(
				"8.substring from the index number" + " " + i + " " + "to the end is" + " " + str1.substring(i));

		System.out.println("enter another index number:");

		int j;

		Scanner s1 = new Scanner(System.in);

		j = s1.nextInt();

		System.out.println("9.substring from the index number" + "" + i + "to the index number" + "" + (j - 1) + ":"
				+ "" + str1.substring(i, j));

		System.out.println("10.replacing of characters:" + str1.replace(str1.charAt(i), str1.charAt(j)));

	}

}
