package �⺻���ǹ�;

import java.util.Random;

/*
 * 369����[1�ܰ�](03:46.97)
 * 1.1~50 ������ ���� ���� ����
 * 2.���� ���ڿ� 3, 6, 9�� ������
 *  1)2���̸�, ¦¦
 *  2)1���̸�, ¦
 *  3)0���̸�, �ش� ���� ���
 * ��) 33 : ¦¦, 16 : ¦, 7 : 7
 */
public class No_21_IfEx_369����1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		int cnt = 0;
		
		int r1 = rNum / 10;
		int r2 = rNum % 10;
		
		if (r1 == 3 || r1 == 6 || r1 == 9) {
			cnt++;
		}
		if (r2 == 3 || r2 == 6 || r2 == 9) {
			cnt++;
		}
		
		System.out.println("���� ���� : " + rNum);
		if (cnt == 0) {
			System.out.println(rNum);
		} else if (cnt == 1) {
			System.out.println("¦");
		} else if (cnt == 2) {
			System.out.println("¦¦");
		}

	}

}
