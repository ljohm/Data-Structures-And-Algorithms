package n_1946;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Test {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine()); // 총 비교건 수
        int[] applicants = new int[testCase]; // 여기에 각 지원자 수 입력
        int[][] result;
        int[] passed = new int[testCase];
        //int passed = 0;
        
        for(int i = 0; i < testCase; i++) { // testCase[1] > applicants[2] > result[1, 1]
            applicants[i] = Integer.parseInt(bf.readLine());
            result = new int[applicants[i]][2];// 각 지원자 결과 입력
            for(int j = 0; j < applicants[i]; j++) {
            	String s = bf.readLine();
            	StringTokenizer st = new StringTokenizer(s);
            	result[j][0] = Integer.parseInt(st.nextToken()); 
            	result[j][1] = Integer.parseInt(st.nextToken());
                
            }        
            
            Arrays.sort(result, Comparator.comparingInt(o1 -> o1[0]));

            int point = result[0][1];
            for(int k = 0; k < applicants[i]; k++) {
            	//System.out.println(result[k][0] + " " + result[k][1]);
            	if(result[k][1] <= point) {
            		point = result[k][1];
            		passed[i]++;
            		
            	}
            }
       }
        
        for(int i = 0; i < testCase; i++) {
        	System.out.println(passed[i]);
        }
            
            bf.close();
	}
}

