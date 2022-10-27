package javaders;

import java.util.Scanner;

public class javaders3class {

	public static void main(String[] args) {
		
		int dogrucevap = 0;
		String cevap;
		Scanner s = new Scanner(System.in);
		String[] Sorular = {
				"1. Hangi ülke en çok sera gazı yaymaktadır?",
				"2. Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?",
				"3. Hangi tür ampul en az enerjiyi tüketir?",
				"4. İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?",
				};
		String[] Cevaplar = {"A","B","C","C"};
		
		System.out.println(Sorular[0]+"\n A-Cin B-Hindistan C-Amerika D-Japonya");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[0].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		
		System.out.println(Sorular[1]+"\n A-Jiputer B-Venus C-Mars D-Merkur");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[1].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		System.out.println(Sorular[2]+"\n A-Akkor Ampul B-Halojen ampul C-Kompakt Floresan Ampul");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[2].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		
		
		System.out.println(Sorular[2]+"\n A-Akkor Ampul B-Halojen ampul C-Kompakt Floresan Ampul");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[2].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		
		
		}
	}


