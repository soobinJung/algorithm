package �˰���;

public class GŽ���ϱ�3 {

	/**
	 * ��հ��� ���� ���� ���� �������� ��ȣ�� ��ȯ�ϴ� �Լ� ���� ������� ���� ���� ��ȣ�� ��ȯ�Ѵ�.
	 *
	 * @param data
	 * @param n
	 * @return int ���� ��հ� ����� �������� ��ȣ (1������ ����)
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
