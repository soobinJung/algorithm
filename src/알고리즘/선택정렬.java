package 알고리즘;

public class 선택정렬 {

	/**
	 * 주어진 범위의 최소값의 위치를 반환하는 함수
	 * 
	 * @param data  데이터 배열
	 * @param begin 탐색 할 가장 첫(왼쪽) 인덱스
	 * @param end   탐색 할 가장 마지막(오른쪽) 인덱스
	 * @return data[begin] ~ data[end] 중 가장 작은 원소의 인덱스
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
			// 주어진 범위에서 가장 작은 원소의 위치를 찾는다.
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
