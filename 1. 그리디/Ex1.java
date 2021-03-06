package 그리디;

import java.util.Arrays;
import java.util.Collections;

        /*
	가장 좋은 것만 선택한다.
	정렬 알고리즘과 자주 짝을 이루어 풀이한다. 
	 */

public class Ex1 {
	/*
	 
	[큰 수의 법칙]
	 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 규칙 
	 단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없다. 
	 주어진 배열 : {1,5,7,2,9}
  	 입력 : 8 3   출력 : 68
	 
	 */
	
	public static void main(String[] args) {
		Integer [] arr = {1,5,7,2,9};
		int M = 8;
		int K = 3; 
		int result = 0;
		Arrays.sort(arr, Collections.reverseOrder());
		
		while(true) {
			for (int i = 0; i < K; i++) {
				result += arr[0];
				M --;
				if(M ==0) break;
			}
			result += arr[1];
			M--;
			if (M==0) break;
		}
		System.out.println(result);
	}
}
