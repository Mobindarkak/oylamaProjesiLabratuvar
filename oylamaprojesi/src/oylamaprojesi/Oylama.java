package oylamaprojesi;

import java.util.LinkedList;

public class Oylama {

	private LinkedList<String> sorular = new LinkedList<>();
	private int puan[][]=new int [5][10];
	private int puanOrtalama[]=new int [5];
	private int kisiSayisi[]=new int [5];
	private int hesap[]=new int [5];
	public void soruEkle() {
		
		sorular.add("soru1");
		sorular.add("soru2");
		sorular.add("soru3");
		sorular.add("soru4");
		sorular.add("soru5");

	}
	public void sorular(int index) {
		System.out.println(sorular.get(index));
	}
	public void puanEkle(int index,int index2) {
		puan [index][index2]+=1;
	}
	public void puanYazdir() {
		for(int i=0;i<5;i++) {
			for (int j=0;j<10;j++)
			{
				puanOrtalama[i]=+ puan[i][j]*(j+1);
				kisiSayisi[i] += puan[i][j];
				
				for(int i=0;i<5;i++) {
					System.out.println(sorular.get(i)+"");
					
					for (int j=0;j<10;j++) {
						System.out.println(""+puan[i][j]);
					}
					System.out.println();
				}
			}
			
		}
	}
	public void ortalamaYazdir()
	{
		
	}
}
