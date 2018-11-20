package no_1984;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			double maxVal = -1;
			
			double minVal = 10001;
			double tmp = 0;

			double sum = 0;
			double avgVal = 0;
			
			for (int j = 0; j < 10; j++) {
				
				tmp = sc.nextDouble();
				sum += tmp;
				
				if (minVal > tmp)
					minVal = tmp;
				if (maxVal < tmp)
					maxVal = tmp;
				
			}
			sum = sum-(minVal+maxVal);
			avgVal = sum/8;
			
			System.out.printf("#%d %d\n",(i+1),(int)Math.round(avgVal));

		}

		sc.close();
	}

}
