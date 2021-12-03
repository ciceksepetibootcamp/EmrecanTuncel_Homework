# EmrecanTuncel_CicekSepeti_HWweekOne

Merhaba, 
- https://www.ciceksepeti.com/ web sitesi için hazırlanmış web otomasyon projesidir. Selenium ve JUnit kullanılmıştır.
- Page Object Model uygulanmıştır.
- 2 adet Test Class'ı içerisinde toplam 4 adet Test Case mevcuttur.



* TestCaseOne
  - addToBasket (1. Case)  >> Bu testte sepette ürün olduğunda sepet logosu üzerinde oluşan sayı kontrol edilir.
    * Açılan Pop-Up'lar kapatılır, SearcBox'a istenilen bir ürün yazdırılıp Enter'a basılır.
    * Sonuç sayfasında listelenen ürünlerden 2. sıradakine tıklanır.
    * Ürün detay sayfasında sepete ekle butonuna basılır.
    * Ürün sepete eklendiğinde sepet logosu üzerindeki sayı kontrol edilir.
    
    
  - compareSelectedProduct (2. Case)  >> Bu testte sepete ekle butonuna basılan ürün ile sepete eklenmiş olan ürün aynı mı? kontrol edilir.
    * Açılan Pop-Up'lar kapatılır, SearcBox'a istenilen bir ürün yazdırılıp Enter'a basılır.
    * Sonuç sayfasında listelenen ürünlerden 2. sıradakine tıklanır.
    * Ürün detay sayfasında sepete ekle butonuna basılır.
    * Sepetteki ürün ile sepete eklenmek istenilen ürün aynı mı kontrol edilir.
    
    
* TestCaseTwo
  - forgatMyPassword (1. Case)  >> Bu testte şifremi unuttum butonuna basıldıktan ve mail adresi gönderildikten sonra onay mesajı alınıyor mu kontrol edilir.
    * Açılan Pop-Up'lar kapatılır, SearcBox'a istenilen bir ürün yazdırılıp Enter'a basılır.
    * Üyelik butonuna basılır ve login sayfasına ilerlenir.
    * Şifremi unuttum butonuna basılır ve açılan box'a bir mail adresi girilir ve Gönder butonuna basılır.
    * Şifrenin belirtilen mail adresine iletildiğine dair onay mesajı alınıyor mu kontrol edilir.
    
  - newPageLoaded (2. Case)  >> Bu testte yeteri kadar scroll yapıldığında 2. sayfanın yüklendiği adres çubuğundaki URL'den kontrol edilir.
    * Açılan Pop-Up'lar kapatılır, SearcBox'a istenilen bir ürün yazdırılıp Enter'a basılır.
    * Açılan Pop-Up'lar kapatılır, SearcBox'a istenilen bir ürün yazdırılıp Enter'a basılır.
    * Yeteri kadar scroll yaıldığında 2. sayfa yükleniyor ve URL de gözüküyor mu kontrol edilir
    
    Her case'den önce otomasyon, @Before metodu ile https://ciceksepeti.com adresine yönlendirilir.
