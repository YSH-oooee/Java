package �⺻�ݺ���;

import java.util.Random;

/*
 * �����л� (�ҿ�ð� 04 : 36.23)
 * 1.10ȸ �ݺ�
 * 2.1~100 ������ ���� ���ڸ� ����(����)
 * 3.������ 60�� �̻��̸� �հݻ�
 * --------------------------------
 * -������(10��)�� ������ ����� ���
 * -�հ��� ���� ���
 * -1�� �л��� ��ȣ�� ���� ���
 */
public class No_12_WhileEx_�����л� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int maxScore = 0;
		int maxNum = 0;
		
		int tot = 0;
		int cnt = 0;
		
		int i = 0;
		while (i < 10) {
			
			int score = ran.nextInt(100) + 1;
			
			System.out.print(score + " ");
			
			tot += score;
			
			if (maxScore < score) {
				maxScore = score;
				maxNum = i + 1;
			}
			
			if (score >= 60) {
				cnt++;
			}
			
			i++;
			
		}
		
		double avg = tot / 10.0;
		
		System.out.println();
		System.out.println("���� : " + tot + "��");
		System.out.println("��� : " + avg + "��");
		System.out.println("�հ��� : " + cnt + "��");
		System.out.println("1�� : " + maxNum + "��, ���� : " + maxScore + "��");

	}

}
