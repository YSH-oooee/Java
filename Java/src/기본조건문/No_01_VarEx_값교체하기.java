package 기본조건문;

public class No_01_VarEx_값교체하기 {

	public static void main(String[] args) {
		
		//x와 y의 값 교체하기(00:37.65)
		int x = 10;
		int y = 20;
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + ", y = " + y);
		

	}

}
