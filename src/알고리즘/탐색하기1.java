package 알고리즘;

public class 탐색하기1 {

	/**
     * 배열에서 특정 원소의 위치를 찾는 함수
     * @param data 중복 없는 정수 배열 data[0] ~ data[n-1]
     * @param n    배열의 크기 n
     * @param m    배열에서 찾고자 하는 원소
     * @return     원소가 존재한다면 인덱스를, 존재하지 않으면 -1을 반환한다.
     */
	public static int findIndex(int[] data, int n, int m)
	{
		for( int i = 0; i <= data.length; i++) {
			if( data[i] == m) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int n = 5;
		int m = 5;
		int[] data = new int[] {1, 3, 5, 8, 9};

		int answer = findIndex(data, n, m);

		System.out.println(answer);
	}
}
