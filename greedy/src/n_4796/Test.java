package n_4796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<CampingDate> list = new ArrayList<CampingDate>();
		
		//int result = 0;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			CampingDate cd = new CampingDate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			if(cd.L == 0 && cd.P==0 && cd.V==0) {
				break;
			}else {
				list.add(cd);
			}
		}
		
		for(int i = 0 ; i < list.size(); i++) {
			int result = 0;
			if(list.get(i).V % list.get(i).P > list.get(i).L) {
				result = (list.get(i).V / list.get(i).P) * list.get(i).L + list.get(i).L;  
			} else {
				result = (list.get(i).V / list.get(i).P) * list.get(i).L + (list.get(i).V % list.get(i).P); 
			}
            System.out.println("Case " + (i + 1) + ": " + result);
		}
		
	}

}

class CampingDate {
	int L;
	int P;
	int V;
	/*public CampingDate() {
		super();
	}*/
	public CampingDate(int l, int p, int v) {
		//super();
		L = l;
		P = p;
		V = v;
	}
	
}

