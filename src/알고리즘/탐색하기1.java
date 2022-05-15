package �˰���;

public class Ž���ϱ�1 {

	/**
     * �迭���� Ư�� ������ ��ġ�� ã�� �Լ�
     * @param data �ߺ� ���� ���� �迭 data[0] ~ data[n-1]
     * @param n    �迭�� ũ�� n
     * @param m    �迭���� ã���� �ϴ� ����
     * @return     ���Ұ� �����Ѵٸ� �ε�����, �������� ������ -1�� ��ȯ�Ѵ�.
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
