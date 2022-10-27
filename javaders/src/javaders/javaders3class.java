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
				"5. Küresel ısınmaya karşı en savunmasız hayvan hangisidir?"
				};
		String[] Cevaplar = {"A","B","C","C","C"};
		
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
		
		
		
		System.out.println(Sorular[3]+"\n A-1500 B-100.000 C-150.000 D-500.000");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[3].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		System.out.println(Sorular[4]+"\n A-Kar Leoparı B-Kutup Ayisi C-Deniz Gergedanı D-Tukan");
		cevap = s.nextLine();
		cevap.toUpperCase();
		
		if(Cevaplar[4].equals(cevap)) {
			System.out.println("Doğru cevap");
			dogrucevap++;
		}
		else {
			System.out.println("Yanlis cevap");
		}
		
		
		
		
		
		
		
		switch(dogrucevap){
			case 5:System.out.println("Mükemmel");
				break;
			case 4:System.out.println("Cok iyi");
				break;
			default:System.out.println("Kuresel isinma hakinda bilgikerinizi tazelemeniz gerek.");
			break;	
		
		}
		
		
		
		}
	}


