public class Test {

	/*
	 [선택정렬] -> 앞에서부터 순서대로 비교해가며 정렬
	 [퀵정렬] -> pivot을 중심으로 왼쪽 오른쪽 나눠 탐색하고 자리를 바꾸는 것 
	 */
	
    public static void quickSort(Integer[] array, int left, int right) {
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;   j = right;
            pivot = array[(left+right)/2];
            
            while (i < j) {
            	while (i < j && array[i] < pivot) i++;
              while (array[j] > pivot) j--;

              tmp = array[i];
              array[i] = array[j];
              array[j] = tmp;
            }
            //정렬 과정
            quickSort(array, left, i - 1);
            quickSort(array, i + 1, right);
        }
    }
	
	
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
		
		
		 quickSort(num, 0, num.length - 1);
        	System.out.println(Arrays.toString(num));
		

		
	}//main	
}//class
