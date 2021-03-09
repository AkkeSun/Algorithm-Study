public class Test {

	/*
	 [선택정렬] -> 앞에서부터 순서대로 비교해가며 정렬
	 */
	public static void main(String[] args) {
		int [] num = {1,5,2,7,8,  3,9,10,4,6};
		int tmp;
		
		for (int i = 0; i < num.length -1 ; i++) {
			for (int j =i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		
		for (int a : num) {
			System.out.println(a);
		}
		
	}//main	
}//class
