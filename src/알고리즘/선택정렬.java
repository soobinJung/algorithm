package �˰���;

public class �������� {

	/**
	 * �־��� ������ �ּҰ��� ��ġ�� ��ȯ�ϴ� �Լ�
	 * 
	 * @param data  ������ �迭
	 * @param begin Ž�� �� ���� ù(����) �ε���
	 * @param end   Ž�� �� ���� ������(������) �ε���
	 * @return data[begin] ~ data[end] �� ���� ���� ������ �ε���
	 */
	public static int getMinIndexInRange(int[] data, int begin, int end) {

		int minIndex = begin;
		for (int i = begin; i <= end; i++) {
			System.out.printf("%d ", data[i]);
			if (data[i] < data[minIndex]) {
				minIndex = i;
			}
			
		}
		System.out.println();
		return minIndex;
	}

	public static void selectionSort(int[] data, int n) {
		for (int i = 0; i < n; i++) {
			// �־��� �������� ���� ���� ������ ��ġ�� ã�´�.
			int minIndex = getMinIndexInRange(data, i, n - 1);

			int temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
	}

	public static void main(String[] args) throws Exception {

		int n = 5;
		int[] data = new int[] { 3, 5, 1, 2, 4 };

		selectionSort(data, n);

		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(data[i]);
		}
	}
}
