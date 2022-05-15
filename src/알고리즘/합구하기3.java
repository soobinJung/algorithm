package 알고리즘;

import java.io.*;
import java.lang.*;
import java.util.*;


public class 합구하기3 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
     * 동아리 멤버들의 탑승 가능 여부를 출력하는 함수
     *
     * @param data 각 멤버들의 몸무게 data[0] ~ data[n-1]
     * @param n    멤버들의 수
     * @param p    놀이기구 탑승 가능 체중 제한
     * @param q    놀이기구 최대 하중
     */
	public static void solve(int[] data, int n, int p, int q){
		
    	int S = 0; //탑승 가능한 사람의 몸무게 총 합
		int C = 0; //탑승 가능한 사람의 수
		
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

