package �˰���;

public class J�ձ��ϱ�3 {

	/**
	 * 1���� M������ �ڿ����� ���� ����ϴ� �Լ�
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
	 * N�� ���� ������ ����ϴ� �Լ�
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
