package n_1339;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		//String[] exp = new String[num];
		char[] alphabet = new char[10];
		int[] weight = new int[10];
		Arrays.fill(alphabet, '0');
		Arrays.fill(weight, 0);
		int sum = 0;

		for(int i = 0; i < num; i++) {
			//exp[i] = bf.readLine();
			//char ch = bf.readLine().charAt(0);
			int w = 1;
			String str = bf.readLine();
			for(int j = str.length() - 1; j >= 0; j--) {
				char ch = str.charAt(j); //입력받은 알파벳 분석
				for(int k = 0; k < alphabet.length; k++) { //weight 앞부분 => 'A'부터 가중값 설정
					if(ch == alphabet[k]) {
						//w *= 10;
						weight[k] += w;
						break;
					} else if (alphabet[k] == '0') {
						alphabet[k] = ch;
						weight[k] = w;
						break;
					}
				}	
				w *= 10;

			}
			
		}
		

		Arrays.sort(weight);

		for(int i = 9; i >= 0; i--) {
			sum += weight[i] * i;
			//System.out.println(weight[i]);
			
		}
		System.out.println(sum);
	}

}
