package ±‚∫ª¡∂∞«πÆ;

import java.util.Random;

/*
 * ¥Á√∑∫π±«[1¥‹∞Ë](00:40.42)
 * 30%¿« ¥Á√∑»Æ∑¸
 */
public class No_14_RandomEx_¥Á√∑∫π±« {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int r = ran.nextInt(10);
		
		if (r < 3) {
			System.out.println("¥Á√∑");
		} else {
			System.out.println("≥´√∑");
		}

	}

}
