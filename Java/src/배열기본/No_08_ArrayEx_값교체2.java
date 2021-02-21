package 배열기본;

import java.util.Scanner;

/*
 * 값 교체하기[2단계] (소요시간 07:35.93)
 */
public class No_08_ArrayEx_값교체2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");
		
		//문1)인덱스 2개를 입력받아, 값 교체하기
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");
		
		//문2)값 2개를 입력받아, 값 교체하기
		
		System.out.print("데이터1 입력 : ");
		int data1 = scan.nextInt();
		
		System.out.print("데이터2 입력 : ");
		int data2 = scan.nextInt();
		
		idx1 = 0; idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data1) {
				idx1 = i;
			}
			if (arr[i] == data2) {
				idx2 = i;
			}
		}
		
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");
		
		//==================================================
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		System.out.print("hakbuns = [ ");
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		} System.out.println("]");
		
		System.out.print("scores = [ ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} System.out.println("]");
		
		//문3)학번 2개를 입력받아, 성적 교체하기
		
		System.out.print("학번1 입력 : ");
		int hak1 = scan.nextInt();
		
		System.out.print("학번2 입력 : ");
		int hak2 = scan.nextInt();
		
		idx1 = 0; idx2 = 0;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hak1) {
				idx1 = i;
			}
			if (hakbuns[i] == hak2) {
				idx2 = i;
			}
		}
		
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		System.out.print("scores = [ ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} System.out.println("]");

	}

}
