package �迭�⺻;

import java.util.Random;
import java.util.Scanner;

/*
 * �л��������� : �л� ����, �˻�, ����ó��, 1�� (�ҿ�ð� 11:43.50)
 */
public class No_03_ArrayEx_�л��������� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[5];
		
		//��1)arr�迭�� 1~100�� ������ ������ �������� 5�� ����
		
		System.out.print("arr = { ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		} System.out.println("}");
		
		//��2)�������� ������ ����� ���
		
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		
		double avg = tot / (double)arr.length;
		System.out.println("���� = " + tot + "�� / ����� = " + avg + "��");
		
		//��3)������ 60�� �̻��̸� �հ�, �հݻ� �� ���
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 59) {
				cnt++;
			}
		}
		
		System.out.println("�հݻ� �� = " + cnt + "��");
		
		//��4)�ε����� �Է¹޾� ���� ���
		
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		
		System.out.println(idx + "���� ���� = " + arr[idx] + "��");
		
		//��5)������ �Է¹޾� �ε��� ���
		
		System.out.print("���� �Է� : ");
		int score = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == score) {
				System.out.println(score + "���� �л� ��ȣ= " + i + "��");
			}
		}
		
		//===========================================================
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {87, 11, 45, 98, 23};
		
		System.out.print("�й� = { ");
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		} System.out.println("}");
		
		System.out.print("���� = { ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		} System.out.println("}");
		
		//��6)�й��� �Է¹޾� ���� ���(��, ���� �й� �Է� �� ����ó��)
		
		System.out.print("�й� �Է� : ");
		int hak = scan.nextInt();
		
		idx = 0;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hak) {
				idx = i;
			}
		}
		
		if (idx == 0) {
			System.out.println("�ش� �й��� ���� �й��Դϴ�");
		} else {
			System.out.println(hak + "�� �л��� ���� = " + scores[idx] + "��");
		}
		
		//��7)1�� �л��� �й��� ���� ���(1004�� 98��)
		
		int maxScore = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
		}
		
		System.out.println("1�� = " + hakbuns[maxIdx] + "�� " + maxScore + "��");

	}

}
