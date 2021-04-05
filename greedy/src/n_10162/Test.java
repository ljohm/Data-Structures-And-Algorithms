package n_10162;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a = T / 300;
		int b = (T % 300) / 60;
		int c = ((T % 300) % 60) / 10;
		if(a * 300 + b * 60 + c * 10 != T) {
			System.out.println("-1");
			System.exit(0);
		}
		System.out.println(a + " " + b + " " + c);

	}

}
