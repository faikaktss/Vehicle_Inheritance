import java.util.Scanner;

import Classlar.Kamyon;
import Classlar.Motorsiklet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Araç uygulamasına hoşgeldiniz");
		System.out.println("Lütfen bir seçim yapınız: ");
		String giris = "1-Kamyon\n" + "2-Motorsiklet\n";
		
		System.out.println(giris);
		
		int secim = scanner.nextInt();
		if(secim ==1 ) {
			int trafikCezaTutari = 750;
			Kamyon kamyon = new Kamyon(1L,"Kamyon","Siyah",40000,4,"marka1","model1",trafikCezaTutari)
				System.out.println("1- Kamyonun bilgilerini göster\n" + "2- Trafik cezası öde");
			int kamyonSecim = scanner.nextInt();
			if(kamyonSecim == 1) {
				kamyon.AracBilgileri();
			}else if(kamyonSecim == 2) {
				kamyon.trafikCezaOde(trafikCezaTutari);
			}else {
				System.out.println("Yanlış bir seçim yaptınız");
			}
			
		}else if(secim == 2) {
			int trafikCezaTutari = 500;
			Motorsiklet motorsiklet = new Motorsiklet(1L,"Motor","Mavi",30000,2,"marka2","model2",trafikCezaTutari)
					System.out.println("1-Motorsikletin bilgilerini göster\n" + "2- Trafik cezası öde");
			int MotorSecim = scanner.nextInt();
			if(MotorSecim == 1) {
				motorsiklet.AracBilgileri();
			}else if(MotorSecim == 2) {
				motorsiklet.trafikCezaOde(trafikCezaTutari);
			}else {
				System.out.println("Yanlış bir seçim yaptınız");
			}
		}else {
			System.out.println("Lütfen belirtilen bir alanda değer giriniz");
		}
		
	}
}
