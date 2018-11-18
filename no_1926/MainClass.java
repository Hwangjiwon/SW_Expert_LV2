package no_1926;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = "1 ";
		String a = null;
		
		if (N < 10 | N > 1000)
			return;
		
		for(int i = 2; i <= N; i++) {
			a = String.valueOf(i);
			str = str.concat(a).concat(" ");
			str = str.replace('3', '-');
			str = str.replace('6', '-');
			str = str.replace('9', '-');			
		}
		
		StringTokenizer st = new StringTokenizer(str, " ");
		String[] arr = new String[st.countTokens()];
		
		int j = 0;
		while(st.hasMoreElements()) { 
			arr[j++] = st.nextToken();
		}
		
		for(j = 0; j < arr.length; j++) {
			int cnt = 0;
			for(int k = 0; k < arr[j].length(); k++) {
				if(arr[j].charAt(k) == '-') cnt++;
			}
			if(cnt > 0) {
				for(int i = 0; i<cnt; i++)
					System.out.print("-");
				System.out.print(" ");
			}else System.out.print(arr[j]+" ");
		}
		
		sc.close();
	}

}
