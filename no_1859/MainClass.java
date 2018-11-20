package no_1859;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		long result = 0;
		int maxVal = -1;

		for(int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			
			result = 0;
			maxVal = -1;
			
			for(int j = 1; j <= N; j++) {
				int value = sc.nextInt();
				list.add(value);
			}
			
			for(int x = N-1; x >= 0; x--) {
				int tmp = list.get(x);
				if(maxVal < tmp) { //tmp이후 부터 발생하는 이익을 maxVal인 날 팔기
					maxVal = tmp;
				} else {
					result += (maxVal-list.get(x));
				}
			}
			
			System.out.println("#" + i + " " + result);
			list.clear();
		}
		sc.close();
	}

}
