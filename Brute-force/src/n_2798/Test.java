package n_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] cards = new int[n];
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < cards.length; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(cards, n, m);
	}
	
	static int search(int[] cards, int n, int m) {
		int result = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j; k < n; k++) {
					int temp = cards[i] + cards[j] + cards[k];
					if(m == temp) {
						return temp;
					}
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
			
		}
		return result;
	}

}
