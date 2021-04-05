package n_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int totalCity = Integer.parseInt(bf.readLine());
		int[] distance = new int[totalCity - 1];
		int[] price = new int[totalCity];
		int minPrice = 0;
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < totalCity - 1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < totalCity; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		minPrice = price[0];
		int totalPrice = 0;
		//minPrice += price[0] * distance[0];
		for(int i = 0; i < totalCity - 1; i++) {
			if(price[i] < minPrice) {
				minPrice = price[i];
			}
			totalPrice += minPrice * distance[i];
		}
		System.out.println(totalPrice);

	}

}
