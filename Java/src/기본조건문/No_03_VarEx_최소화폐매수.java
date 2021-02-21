package 기본조건문;

public class No_03_VarEx_최소화폐매수 {

	public static void main(String[] args) {
		
		//문1)800원에서 500원짜리 개수, 100원짜리 개수(02:12/75)
		
		int money = 800;
		int five_hund = 500;
		int one_hund = 100;
		
		int five_ea = money / five_hund;
		int one_ea = (money % five_hund) / 100;
		
		System.out.println("500원짜리 = " + five_ea + "개, 100원짜리 = " + one_ea + "개");

	}

}
