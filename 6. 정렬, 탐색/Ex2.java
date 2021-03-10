import java.util.*;

public class Practice {
	
	// 이진탐색 : 정렬이 선행되어야 한다. 시작점 끝점 중간점을 두고 중간점과 비교해가며 데이터를 찾는다.	
    public static int binarySearch(int[] arr, int target, int start, int end) {
	int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) result=mid;
            // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
            // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid + 1; 
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target = 2;
        

        // 이진 탐색 수행 결과 출력 
        int result = binarySearch(arr, target, 0, arr.length- 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }
    }

}
