package 알고리즘;

public class G탐색하기2 {

	/**
     * 배열에서 소속이 "AJOU"인 첫 원소와 마지막 원소를 출력하는 함수
     * @param school 각 사람들의 소속학교 정보 배열
     * @param n      사람들의 수
     */
	public static int[] getIndexes(String[] school, int n)
	{
		int firstIndex = -1; //존재하지 않으면 -1
		int lastIndex = -1;  //존재하지 않으면 -1

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
