ŞİFRELEME ALGORİTMASI TASARIMI
Algoritmamızı tasarlamadan önce halihazırda bulunan şifreleme algoritmalarının güçlü ve zayıf yanlarına ilişkin literatür taraması yapalım. 
Şifreleme, gizli bilgilerin üçüncü şahıslar tarafından okunmasını veya değiştirilmesini önlemek için kullanılan bir yöntemdir. Şifreleme algoritmaları, bir mesajı şifrelemek ve şifresini çözmek için kullanılan matematiksel formüllerdir
Şifreleme algoritmaları, simetrik ve asimetrik olmak üzere iki ana kategoriye ayrılır. Simetrik şifreleme algoritmalarında, şifreleme ve şifre çözme için aynı anahtar kullanılır. Asimetrik şifreleme algoritmalarında ise, şifreleme ve şifre çözme için farklı anahtarlar kullanılır.

1. Simetrik Şifreleme Algoritmaları:
Advanced Encryption Standard (AES):
- Avantajlar:
- Güvenilirlik: AES, güçlü bir matematiksel temele dayanır ve uzun süreli güvenliği sağlamak için tasarlanmıştır.
- Performans: AES, hızlı ve etkili bir şekilde çalışabilen bir algoritmadır.
- Zayıflıklar:
- Kuantum Bilgisayarları: Kuantum bilgisayarları, AES'in kuantum direnci konusunda endişe yaratabilir.
Triple DES (3DES):
- Avantajlar:
- Geçmişe Dayalı Uyum: 3DES, eski DES algoritmasının güvenliğiyle birlikte gelir.
- Zayıflıklar:
- Performans: 3DES, AES'e göre daha düşük performans sunabilir.



2. Asimetrik Şifreleme Algoritmaları:
Rivest-Shamir-Adleman (RSA):
- Avantajlar:
- Yaygın Kullanım: RSA, geniş ölçüde kullanılan bir açık anahtarlı şifreleme algoritmasıdır.
- Anahtar Değişimi: Anahtar değişimi için kullanılabilir.
- Zayıflıklar:
- Hesaplama Gücü: Büyük anahtar uzunlukları kullanılarak güçlendirilse de, gelecekteki kuantum bilgisayarları için potansiyel bir tehdit olabilir.
 Elliptic Curve Cryptography (ECC):
- Avantajlar:
- Güçlü Güvenlik: ECC, kısa anahtar uzunluklarıyla güçlü güvenlik sağlar.
- Daha Hızlı: Diğer asimetrik algoritmalar ile karşılaştırıldığında daha hızlıdır.
- Zayıflıklar:
- Standartlaşma: ECC'nin bazı uygulama alanlarında standartlaşması tamamlanmamış olabilir.

3. Hash Fonksiyonları:
SHA-256 (Secure Hash Algorithm 256-bit):
- Avantajlar:
- Güvenilirlik: SHA-256, çeşitli güvenlik uygulamalarında güvenilir bir şekilde kullanılır.
- Hesaplama Hızı: Hızlı ve verimli bir hash fonksiyonudur.
- Zayıflıklar:
- Kuantum Bilgisayarları: Kuantum bilgisayarları, SHA-256'nın hash fonksiyonlarını çözme potansiyeline sahiptir.

Temel Prensiplerin Belirlenmesi

-Tasarlanacak olan şifreleme algoritmasında simetrik şifreleme kullanılcaktır.

-Algoritmanın özelliklerin şu şekilde olması planlanmaktadır.

Blok Boyutu:
Kod, blok bazında çalışır. Şifreleme ve şifre çözme işlemleri, metin bloklarını ele alarak gerçekleştirilir. Şifrelenecek olan metin kullanıcıdan alınacaktır.
Anahtar Boyutu:
Anahtarın uzunluğu, şifreleme sırasında kullanılan karakter dizisi olan key'e bağlıdır. Bu karakter dizisinin indeksleri üzerinden bir toplama işlemi gerçekleştirilerek sum değeri hesaplanır. Anahtar kelime kullanıcıdan alınacaktır.

Döngü Sayısı:
Anahtarın uzunluğu kadar bir döngü oluşturularak, her karakterin fullArray içindeki indeksi ile belirli işlemler yapılarak şifreleme gerçekleştirilir.

Şifreleme Mimarisi:
Şifreleme, her karakterin indeks değeri ve belirli hesaplamalar kullanılarak gerçekleştirilir. Harfin indeks değerine göre, rastgele seçilen bir anahtar değeri ile yapılan işlemlerle şifreleme yapılmaktadır.



![image](https://github.com/salihremziguler/TextEncryptionDecryption/assets/77549849/3ed5c1b2-aeed-4125-9d4a-641ddfb8c59c)

![image](https://github.com/salihremziguler/TextEncryptionDecryption/assets/77549849/035e0b89-3ea5-4e46-a312-608489468a3c)

![image](https://github.com/salihremziguler/TextEncryptionDecryption/assets/77549849/2858ecf2-0722-4c67-a5ca-c152366d5320)

![image](https://github.com/salihremziguler/TextEncryptionDecryption/assets/77549849/798bc447-dd62-4cfc-824d-823fb2adec83)











