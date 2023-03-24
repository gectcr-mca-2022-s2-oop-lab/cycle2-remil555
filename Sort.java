package cycle2;

import java.util.Scanner;
import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		String flower[] = new String[n];
		System.out.println("Enter the string:");
		Scanner sc1 = new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			flower[i]=sc1.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if(flower[i].compareTo(flower[j]) > 0) {
					String temp = flower[i];
					flower[i] = flower[j];
					flower[j] = temp;

				}
			}
		}
		System.out.println(Arrays.toString(flower));
	}

}
