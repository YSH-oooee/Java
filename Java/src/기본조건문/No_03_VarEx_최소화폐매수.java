package �⺻���ǹ�;

public class No_03_VarEx_�ּ�ȭ��ż� {

	public static void main(String[] args) {
		
		//��1)800������ 500��¥�� ����, 100��¥�� ����(02:12/75)
		
		int money = 800;
		int five_hund = 500;
		int one_hund = 100;
		
		int five_ea = money / five_hund;
		int one_ea = (money % five_hund) / 100;
		
		System.out.println("500��¥�� = " + five_ea + "��, 100��¥�� = " + one_ea + "��");

	}

}
