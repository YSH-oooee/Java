package �⺻���ǹ�;

import java.util.Scanner;

/*
 * �α���[2�ܰ�](01:54.25)
 * 1.ID�� PW�� �Է¹޾� ȸ������ ����
 * 2.�α��� ����
 * 3.ȸ������ ��, ����� �����Ϳ� �α��� ��, �Է¹��� �����͸� ���Ѵ�
 */
public class No_07_IfEx_�α���2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.print("[ȸ������]ID �Է� : ");
		dbId = scan.nextInt();
		
		System.out.print("[ȸ������]PW �Է� : ");
		dbPw = scan.nextInt();
		
		System.out.print("[�α���]ID �Է� : ");
		int id = scan.nextInt();
		
		System.out.print("[�α���]PW �Է� : ");
		int pw = scan.nextInt();
		
		if (dbId == id && dbPw == pw) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}

	}

}
