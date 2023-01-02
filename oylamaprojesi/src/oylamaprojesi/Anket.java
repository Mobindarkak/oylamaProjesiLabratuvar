package oylamaprojesi;

import java.util.Scanner;

public class Anket {

	public static void main(String[] args) {
		
		int puan[][];
		int temp;
		
		int swtichCase=0;
		Oylama anket = new Oylama();
		anket.soruEkle();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		
		System.out.println("Ankete katilmak icin 1 basiniz:");
		int switchCase = sc2.nextInt();
		
		switch (switchCase) {
		case 1:
			 
			for(int i=0;i<5;i++) {
				temp = sc.nextInt();
				if(temp>10) {
					System.out.println("1 ile 10 arasinda bir sayi giriniz...");
					temp = sc.nextInt();
				}
				anket.puanEkle(i,temp-1);
			}
			anket.ortalamaYazdir();
			anket.hepsiniYazdir();
			
			break;
			caSe2:
				break;
		}
	}

}
