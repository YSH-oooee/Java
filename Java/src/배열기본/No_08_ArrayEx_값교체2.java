package �迭�⺻;

import java.util.Scanner;

/*
 * �� ��ü�ϱ�[2�ܰ�] (�ҿ�ð� 07:35.93)
 */
public class No_08_ArrayEx_����ü2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");
		
		//��1)�ε��� 2���� �Է¹޾�, �� ��ü�ϱ�
		
		System.out.print("�ε���1 �Է� : ");
		int idx1 = scan.nextInt();
		
		System.out.print("�ε���2 �Է� : ");
		int idx2 = scan.nextInt();
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
		System.out.print("arr = [ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println("]");
		
		//��2)�� 2���� �Է¹޾�, �� ��ü�ϱ�
		
		System.out.print("������1 �Է� : ");
		int data1 = scan.nextInt();
		
		System.out.print("������2 �Է� : ");
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
		
		//��3)�й� 2���� �Է¹޾�, ���� ��ü�ϱ�
		
		System.out.print("�й�1 �Է� : ");
		int hak1 = scan.nextInt();
		
		System.out.print("�й�2 �Է� : ");
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
