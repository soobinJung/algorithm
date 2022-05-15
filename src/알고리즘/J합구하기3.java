package 알고리즘;

public class J합구하기3 {

	/**
	 * 1부터 M까지의 자연수의 합을 계산하는 함수
	 * @param M
	 * @return
	 */
	public static int getRangeSumFromOne(int M) {
		
		int sum = 0;
		
		for( int i = 1; i <= M; i++ ) {
			sum += i;
		}
		
		return sum;
	}

	/**
	 * N에 대한 정답을 계산하는 함수
	 * @param N
	 * @return
	 */
	public static int getAnswer(int N)
	{
		
		int sum = 0;
		
		for( int i = 1; i <= N; i++ ) {
			sum += getRangeSumFromOne(i);
		}
		
		return sum;
	}


	public static void main(String[] args) throws Exception {
		int n = 100;
		long answer = getAnswer(n);
		System.out.println(answer);
	}
	
}
