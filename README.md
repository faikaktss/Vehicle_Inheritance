🚗 Araç Uygulaması (Inheritance Projesi)






📖 Proje Hakkında

Bu proje, Java OOP (Nesne Yönelimli Programlama) konseptlerinden inheritance (kalıtım) konusunu basit düzeyde anlatmak için hazırlanmıştır.

Amaç, farklı araç türleri (Kamyon 🚛, Motorsiklet 🏍️) oluşturup bunların ortak özelliklerini Arac sınıfında toplamak ve alt sınıflarda özelleştirmektir.

Bu sayede:

Kod tekrarını azaltma

Ortak özellikleri bir üst sınıfta toplama

Alt sınıflarda (Kamyon, Motorsiklet) ek özellikler tanımlama
mantığını öğrenmiş olacaksınız.

🏗️ Proje Yapısı
src/
 ├── Classlar/
 │   ├── Arac.java          # Üst sınıf (Parent class)
 │   ├── Kamyon.java        # Alt sınıf (Truck - extends Arac)
 │   └── Motorsiklet.java   # Alt sınıf (Motorcycle - extends Arac)
 └── Main.java              # Çalıştırılabilir main dosyası

📌 Kullanılan Sınıflar
🔹 Arac (Base Class / Superclass)

id, aracIsmi, renk, fiyat, lastikSayisi, marka, modelYili gibi ortak özellikleri içerir.

AracBilgileri() ve trafikCezaOde() metotlarını tanımlar.

🔹 Kamyon (Subclass 🚛)

trafikCezaTutari özelliği vardır.

AracBilgileri() metodunu override ederek kendi bilgilerini gösterir.

trafikCezaOde() metodunu özelleştirir.

🔹 Motorsiklet (Subclass 🏍️)

trafikCezaTutari özelliği vardır.

AracBilgileri() metodunu override eder.

trafikCezaOde() metodunu özelleştirir.

💻 Nasıl Çalıştırılır?

Projeyi klonla:

git clone https://github.com/kullaniciadi/arac-inheritance-projesi.git
cd arac-inheritance-projesi


Derle ve çalıştır:

javac -d bin src/Classlar/*.java src/Main.java
java -cp bin Main


Uygulama çalıştığında:

Araç uygulamasına hoşgeldiniz
Lütfen bir seçim yapınız:
1- Kamyon
2- Motorsiklet


Seçim yaparak bilgileri görebilir veya trafik cezası ödeyebilirsiniz.

🎯 Öğrenme Çıktıları

✅ Inheritance (Kalıtım) mantığını öğrenmek
✅ Kod tekrarını azaltmak için üst sınıf kullanmak
✅ super anahtar kelimesinin kullanımını görmek
✅ Override ile metotları özelleştirmek
