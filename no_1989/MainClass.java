package no_1989;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str = sc.nextLine();
	
		for(int i=1; i<= t; i++) {
			
			str = sc.nextLine();
			str = str.trim();
			
			char[] arr = new char[str.length()];
			char[] pel = new char[str.length()];
			
			for(int j = 0; j<str.length(); j++) 
				arr[j] = str.charAt(j);
			
			int h = arr.length-1;
			for(int k = 0; h>=0 ; k++, h--) 
				pel[k] = arr[h];
		
			for(int y = 0; y < arr.length; y++) {
				if(arr[y] != pel[y]) {
					System.out.printf("#%d 0\n",i);
					break;
				} else if(y == (arr.length-1))
					System.out.printf("#%d 1\n",i);
			}
			
		}

		sc.close();
	}
}
