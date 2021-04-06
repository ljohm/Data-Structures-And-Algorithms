package n_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int[][] spec = new int[num][2];
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			spec[i][0] = Integer.parseInt(st.nextToken());
			spec[i][1] = Integer.parseInt(st.nextToken());
		}
		

		for(int i = 0; i < num; i++) {
			int rank = 1;
			for(int j = 0; j < num; j++) {
				if(i == j) continue;
				if(spec[i][0] < spec[j][0] && spec[i][1] < spec[j][1]) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
		
	}

}
