package no_1986;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int result = 0;
			
			System.out.printf("#%d ", (i+1));
			for (int j = 1; j <= N; j++) {
				if(j%2 == 1)
					result += j;
				else result -= j;
			}
			System.out.println(result);
		}
		sc.close();
	}

}
