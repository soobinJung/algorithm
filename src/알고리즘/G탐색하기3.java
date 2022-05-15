package 알고리즘;

public class G탐색하기3 {

	/**
	 * 평균과의 차가 가장 작은 데이터의 번호를 반환하는 함수 여러 가지라면 가장 빠른 번호를 반환한다.
	 *
	 * @param data
	 * @param n
	 * @return int 가장 평균과 가까운 데이터의 번호 (1번부터 시작)
	 */
	public static int findIndex(int[] data, int n) {
		int S = 0;
		int X = 0;

		for (int i = 0; i < n; i++) {
			S += data[i];
		}

		for (int i = 0; i < n; i++) {

			System.out.println("data[i] : " + data[i]);
			System.out.println("data[X] : " + data[X]);

			int di = Math.abs(S - n * data[i]);
			int dx = Math.abs(S - n * data[X]);

			System.out.println("DI : " + dx);
			System.out.println("DX : " + di);

			System.out.println("-----------------------------------");
			
			if (di < dx) {
				X = i;
			}
		}

		return X + 1;
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		int[] data = new int[] { 4, 10, 2, 59, 8 };
		 
		int answer = findIndex(data, n);
		int index = answer - 1;
		System.out.printf("%d %d\n", answer, data[index]);
	}
}
