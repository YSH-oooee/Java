package �迭�⺻;

import java.util.Random;

/*
 * OMRī�� (�ҿ�ð� 04:00.83)
 * 1.�迭 answer�� ���蹮���� ������
 * 2.�迭 hgd�� 1~5������ ���� ���� 5�� ����
 * 3.answer�� hgd�� ���� ���� ����ǥ�� ���
 * 4.�� ������, 20��
 */
public class No_04_ArrayEx_OMR {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		System.out.print("answer = { ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		} System.out.println("}");
		
		System.out.print("hgd    = { ");
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
		} System.out.println("}");
		
		int cnt = 0;
		
		System.out.print("����ǥ       = { ");
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == hgd[i]) {
				System.out.print("O ");
				cnt++;
			} else {
				System.out.print("X ");
			}
		} System.out.println("}");
		
		System.out.println("����          = " + (cnt * 20) + "��");

	}

}
