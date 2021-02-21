package 배열기본;

import java.util.Random;

/*
 * 중복숫자금지[1단계] (소요시간 02:16.38)
 * 1.0~4사이의 숫자를 arr배열에 저장
 * 2.단, 중복되는 숫자는 없어야 함
 * 힌트 : 랜덤 숫자를 check배열의 인덱스로 활용
 */
public class No_07_ArrayEx_중복숫자금지1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(5);
			if (check[r] == 0) {
				arr[i] = r;
				check[r] = 1;
			} else {
				i--;
			}
		}
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");

	}

}
