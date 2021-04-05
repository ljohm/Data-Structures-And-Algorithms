package n_1080;

import java.util.Scanner;

public class Test {
	static int N;			// ��
	static int M;			// ��
	static int[][] Arr1;	// ��� A
	static int[][] Arr2;	// ��� B
	static int count = 0;	// ������ Ƚ��

	// 3*3 �κ� ����� ��� ���� ������(0->1, 1->0)
	public static boolean reverseArr(int row, int col){

		// ���޹��� �ε��� i, j�� ��ȯ�� ������ �����
		if(row+3 > N || col+3 > M)
			return false;

		for(int i=row; i<row+3; i++) {
			for(int j=col; j<col+3; j++) {
				if(Arr1[i][j] == 0) 
					Arr1[i][j] = 1;
				else
					Arr1[i][j] = 0;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		Arr1 = new int[N][M];
		Arr2 = new int[N][M];

		for(int i=0; i<N; i++) {
			String str = scan.next();
			for(int j=0; j<M; j++) 
				Arr1[i][j] = str.charAt(j) - '0';
		}
		for(int i=0; i<N; i++) {
			String str = scan.next();
			for(int j=0; j<M; j++) 
				Arr2[i][j] = str.charAt(j) - '0';
		}

		// (0,0)���� ���Ҹ� ������ ���ذ��� �ٸ���� reverseArr �޼��带 ���� ���� ������.
		// 3*3 ũ���� ����� �����̹Ƿ�, ������ ��� ������ �����������, -1 ���
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(Arr1[i][j] != Arr2[i][j]) {
					if(reverseArr(i, j)) {
						count ++;
					} else {
						System.out.println("-1");
						return;
					}
				}
			}
		}

		System.out.println(count);
		scan.close();
	}

}


