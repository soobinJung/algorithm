package �˰���;

import java.io.*;
import java.lang.*;
import java.util.*;


public class �ձ��ϱ�3 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * ���Ƹ� ������� ž�� ���� ���θ� ����ϴ� �Լ�
     *
     * @param data �� ������� ������ data[0] ~ data[n-1]
     * @param n    ������� ��
     * @param p    ���̱ⱸ ž�� ���� ü�� ����
     * @param q    ���̱ⱸ �ִ� ����
     */
	public static void solve(int[] data, int n, int p, int q){
		
    	int S = 0; //ž�� ������ ����� ������ �� ��
		int C = 0; //ž�� ������ ����� ��
		
		for( int kg : data ) {
			if(kg < p) {
				S += kg;
				C++;
			}
		}

		System.out.printf("%d %d\n", C, S);
		System.out.printf (  (S <= q) ? "YES" : "NO");
		
	}


	public static void main(String[] args)
	{
		int n = 10;
		int p = 80;
		int q = 500;
		int[] data = new int[] {75, 50, 67, 84, 54, 67, 98, 85, 58, 90};
		
		
		solve(data, n, p, q);
	}

}

