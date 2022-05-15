package �˰���;

public class GŽ���ϱ�2 {

	/**
     * �迭���� �Ҽ��� "AJOU"�� ù ���ҿ� ������ ���Ҹ� ����ϴ� �Լ�
     * @param school �� ������� �Ҽ��б� ���� �迭
     * @param n      ������� ��
     */
	public static int[] getIndexes(String[] school, int n)
	{
		int firstIndex = -1; //�������� ������ -1
		int lastIndex = -1;  //�������� ������ -1

		for( int i = 0; i < n; i++) {
			if( school[i].equals("AJOU")) {
				if(firstIndex == -1) {
					firstIndex = i;
				}else {
					lastIndex = i;
				}
			}
		}

		return new int[]{firstIndex, lastIndex};
	}

	public static void main(String[] args)
	{
		int n = 10;
		String[] schools = new String[] {  "HELL"
											, "CHOSUN"
											, "SKK"
											, "KOREA"
										 	, "AJOU"
											, "YONSEI"
											, "SEOUL"
											, "AJOU"
											, "AJOU"
											, "WOOSONG"
										};
		
		int[] indexes = getIndexes(schools, n);
		System.out.printf("%d %d\n", indexes[0], indexes[1] );
	}
}
