package �⺻���ǹ�;

import java.util.Random;

/*
 * ��÷����[1�ܰ�](00:40.42)
 * 30%�� ��÷Ȯ��
 */
public class No_14_RandomEx_��÷���� {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int r = ran.nextInt(10);
		
		if (r < 3) {
			System.out.println("��÷");
		} else {
			System.out.println("��÷");
		}

	}

}
