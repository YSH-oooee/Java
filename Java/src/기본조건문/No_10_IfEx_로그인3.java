package �⺻���ǹ�;

import java.util.Scanner;

/*
 * �α���[3�ܰ�](01:48.67)
 * 1.ID�� �Է¹޾�, DBID�� ��ġ�� ��쿡�� PW�� �Է��� �� �ִ�
 * 2.ID�� Ʋ�� ���, ID�� Ȯ���϶�� �޼��� ���
 * 3.PW�� Ʋ�� ���, PW�� Ȯ���϶�� �޼��� ���
 * 4.ID�� PW�� ��� ��ġ�� ���, �α��� ���� �޼��� ���
 */
public class No_10_IfEx_�α���3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("ID �Է� : ");
		int id = scan.nextInt();
		
		if (dbId == id) {
			System.out.print("PW �Է� : ");
			int pw = scan.nextInt();
			
			if (dbPw == pw) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ȯ���ϼ���");
			}
		} else {
			System.out.println("ID�� Ȯ���ϼ���");
		}

	}

}
