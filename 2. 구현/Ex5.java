package work1;

import java.util.Scanner;

/* 문자인지 소수인지 정수인지 판단하기 */

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();


		//문자 판단
		int cnt = 0; //점의 갯수를 판단하기 위한 변수 
		for(int i=0;i<input.length();i++){
			//한 글자씩 잘라서 ch에 넣고 판단하기
			char ch = input.charAt(i);
			if(ch == '.') cnt++; //점이 나오면 cnt를 1씩 늘린다 
			
			//ch가 0~9사이의 값이 아니거나 점인데 갯수가 한 개 이상이라면  문자로 판단한다
			if(!(('0'<= ch && ch <= '9')||(('.' == ch)&&(cnt ==1)))){
				System.out.println("math error");
				System.exit(0);
			}
		}
		
	
		//정수 소수 판단	
		String result = "정수입니다";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			//점이 존재하고 점의 위치가 맨 뒤가 아니라면 정수이다
			if(ch == '.') {
				if(i==input.length()-1) {
					result = "정수입니다";
					break;
				}
				//점이 없다면 소수이다
				result = "소수입니다.";
				break;
			}
		}
		System.out.println(result);
	}
}
