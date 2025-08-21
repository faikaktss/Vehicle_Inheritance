🚗 Vehicle Inheritance Demo (Java OOP)






📌 Proje Hakkında

Bu proje, Java’da Nesne Yönelimli Programlama (OOP) konusunu öğrenmek için geliştirilmiş basit bir uygulamadır.
Özellikle Inheritance (Kalıtım) konusuna odaklanır.

Projede temel olarak Arac (üst sınıf) tanımlanmış ve bu sınıftan türeyen Kamyon ve Motorsiklet sınıfları oluşturulmuştur.
Amaç, kalıtımın mantığını anlamak ve gerçek bir senaryoda nasıl kullanılabileceğini göstermektir.

🛠 Kullanılan Teknolojiler

Java 17+

OOP (Inheritance, Override, Encapsulation)

Console tabanlı etkileşim

📂 Proje Yapısı
📦 src
 ┣ 📂 Classlar
 ┃ ┣ 📜 Arac.java
 ┃ ┣ 📜 Kamyon.java
 ┃ ┗ 📜 Motorsiklet.java
 ┣ 📜 Main.java

🔑 Öne Çıkan Özellikler

Arac sınıfı:

Tüm araçlar için ortak özellikleri içerir (id, isim, renk, fiyat, lastik sayısı, marka, model yılı).

Kamyon ve Motorsiklet sınıfları:

Arac sınıfından kalıtım alır.

Kendilerine özgü trafik ceza tutarı eklenmiştir.

Override metodları:

AracBilgileri() ve trafikCezaOde() metotları alt sınıflarda özelleştirilmiştir.

Kullanıcı etkileşimi:

Konsol üzerinden seçim yaparak araç bilgilerini görüntüleyebilir veya trafik cezasını ödeyebilirsiniz.

▶️ Kullanım

Projeyi klonla:

git clone https://github.com/kullanici-adi/vehicle-inheritance-demo.git
cd vehicle-inheritance-demo




🎯 Öğrenme Çıktısı

✅ Inheritance (Kalıtım) mantığını pekiştirme
✅ super anahtar kelimesi ile üst sınıfa erişim
✅ Metotların override edilmesi
✅ Konsol tabanlı basit bir OOP senaryosu

💡 Not: Bu proje akademik/öğrenim amaçlıdır. Gerçek hayattaki araç sistemleri için basitleştirilmiş bir örnek olarak düşünülmelidir.
