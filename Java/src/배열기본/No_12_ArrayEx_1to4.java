package 배열기본;

import java.util.Random;
import java.util.Scanner;

/*
 * 1 to 50[1단계] : 1 to 4 (소요시간 05:36.12)
 * 1.arr배열에 1~4사이의 숫자를 중복없이 저장
 * 2.사용자는 1부터 순서대로 해당 위치 값을 입력
 * 3.정답을 맞추면 해당 값은 9로 변경, 모든 값이 9가 되면 게임 종료
 */
public class No_12_ArrayEx_1to4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(4);
			
			if (check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
			} else {
				i--;
			}
		}
		
		int num = 1;
		while (num < 5) {
			
			System.out.print("arr = [ ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			} System.out.println("]");
			
			System.out.print(num + "의 위치 입력 : ");
			int idx = scan.nextInt();
			
			if (arr[idx] == num) {
				arr[idx] = 9;
				num++;
			}
			
		}

	}

}
