package Classlar;

public class Motorsiklet extends Arac{
	private double trafikCezaTutari;
	
	 public double getTrafikCezaTutari() {
		return trafikCezaTutari;
	}

	public void setTrafikCezaTutari(double trafikCezaTutari) {
		this.trafikCezaTutari = trafikCezaTutari;
	}

	 public Motorsiklet() {
		 
	 }
	 
	 public Motorsiklet(long id, String aracIsmi, String renk, double fiyat, int lastikSayisi, String marka, String modelYili,double trafikCezaTutari) {
		 setId(id);
		 setAracIsmi(aracIsmi);
		 setRenk(renk);
		 setFiyat(fiyat);
		 setLastikSayisi(lastikSayisi);
		 setMarka(marka);
		 setModelYili(modelYili);
		 this.trafikCezaTutari = trafikCezaTutari;
	 }
	 
	 @Override
	 public void AracBilgileri() {
		 super.AracBilgileri();
		 System.out.println("ID:           ",getId());
		 System.out.println("Araç ismi:    ",getAracIsmi());
		 System.out.println("Araç renk:    ",getRenk());
		 System.out.println("Fiyat         ",getFiyat());
		 System.out.println("Lastik sayısı " , getLastikSayisi());
		 System.out.println("Marka		   ", getMarka());
		 System.out.println("Model		   ",getModelYili());
	 }
	 
	 @Override
	 public void trafikCezaOde(double trafikCezaTutari) {
		 super.trafikCezaOde(trafikCezaTutari);
		 System.out.println(getAracIsmi() + "tipli aracin trafik cezası tutari: "+ getTrafikCezaTutari());
	 }
}
