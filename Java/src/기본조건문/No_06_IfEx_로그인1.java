package �⺻���ǹ�;

import java.util.Scanner;

/*
 * �α���[1�ܰ�](01:31.69)
 * 1.ID�� PW�� �Է¹޴´�
 * 2.�Է¹��� �����Ϳ� DB�����͸� ���� �α��� ó���� ����
 */
public class No_06_IfEx_�α���1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID �Է� : ");
		int id = scan.nextInt();
		
		System.out.print("PW �Է� : ");
		int pw = scan.nextInt();
		
		if (dbId == id && dbPw == pw) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}

}
