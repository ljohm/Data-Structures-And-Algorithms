package n_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i = 0; i < num; i++) {
			pq.add(Integer.parseInt(bf.readLine()));
		}
		
		for(int i = 0; i < num - 1; i++) {
			int tmp1 = pq.poll();
			int tmp2 = pq.poll();
			sum += tmp1 + tmp2;
			pq.add(tmp1 + tmp2);
		}
		System.out.println(sum);

	}

}
