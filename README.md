# 🚗 Vehicle Inheritance Demo (Java OOP)

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/OOP-Inheritance-blueviolet?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" />
</p>

---

## 📌 Proje Hakkında

Bu proje, **Java’da Nesne Yönelimli Programlama (OOP)** konusunu öğrenmek için geliştirilmiş basit bir uygulamadır.  
Özellikle **Inheritance (Kalıtım)** konusuna odaklanır.  

Projede temel olarak **`Arac` (üst sınıf)** tanımlanmış ve bu sınıftan türeyen  
**`Kamyon`** ve **`Motorsiklet`** sınıfları oluşturulmuştur.  

Amaç, **kalıtımın mantığını** anlamak ve gerçek bir senaryoda nasıl kullanılabileceğini göstermektir.  

---

## 🛠 Kullanılan Teknolojiler

- ☕ **Java 17+**
- 🧩 **OOP (Inheritance, Override, Encapsulation)**
- 💻 **Console tabanlı etkileşim**

---

## 📂 Proje Yapısı

```bash
📦 src
 ┣ 📂 Classlar
 ┃ ┣ 📜 Arac.java
 ┃ ┣ 📜 Kamyon.java
 ┃ ┗ 📜 Motorsiklet.java
 ┣ 📜 Main.java
🔑 Öne Çıkan Özellikler
✔️ Arac sınıfı → Ortak özellikler (id, isim, renk, fiyat, lastik sayısı, marka, model yılı)
✔️ Kamyon ve Motorsiklet → Arac sınıfından türetilmiştir
✔️ Override edilmiş metodlar: AracBilgileri() ve trafikCezaOde()
✔️ Konsol tabanlı menü ile kullanıcı etkileşimi


🎯 Öğrenme Çıktısı

✅ Inheritance (Kalıtım) mantığını pekiştirme

✅ super anahtar kelimesi ile üst sınıfa erişim

✅ Metotların override edilmesi

✅ Konsol tabanlı basit bir OOP senaryosu

💡 Not: Bu proje akademik/öğrenim amaçlıdır.
Gerçek hayattaki araç sistemleri için basitleştirilmiş bir örnek olarak düşünülmelidir.
