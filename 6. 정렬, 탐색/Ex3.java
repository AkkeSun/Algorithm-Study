import java.util.*;

public class Practice {
	
	/* 
	 [부품찾기]
	 arr1 에서 arr2값이 있는지 확인하고 
	 있다면 Yes, 없다면 No를 출력하라	
	 int [] arr1 = {8,3,7,9,2};
         int [] arr2 = {5,7,9};
	*/
	
	public static int binarySearch(int []arr1, int target, int start, int end) {
		int num = -1;
		while(start <= end) {
			int index = (start+end)/2;
			int mid = arr1[index];
			if(target == mid) num = mid;
			if(target > mid) start = index+1;
			else end = index-1;
		}
		return num;
	}
	
	public static void main(String[] args) {
        int [] arr1 = {8,3,7,9,2};
        int [] arr2 = {5,7,9};
        
        for (int i = 0; i < arr2.length; i++) {
			int num = binarySearch(arr1, arr2[i], 0, arr1.length-1);
			if(num == -1) System.out.println("No");
			else System.out.println("Yes");
		}
    }
}
