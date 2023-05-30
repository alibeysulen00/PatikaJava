<h1>Not Ortalaması Hesaplayan Program</h1>

<p>Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...</p>


<p><strong>If ve else kullanılmadan bir koşul yazmanın javada bir yolu daha var
. Bu yol Ternary Operator (Üçlü İşlem) dir.
Genel yapısı şu şekildedir.</strong></p>
<p><strong>---->  (koşul) ? ifade1: ifade2</strong></p>
<p><strong>koşul değerlendirilir. Eğer koşul true olarak değerlendirilirse, ifade1 değeri döndürülür.
Eğer koşul false olarak değerlendirilirse, ifade2 değeri döndürülür.
Yani, ortalama > 60 koşulu değerlendirilir. Eğer bu koşul doğruysa (true), Sınıfı Geçtiniz ifadesi atanır. Eğer koşul yanlışsa (false), Sınıfta Kaldınız ifadesi atanır. Sonuç olarak, ortalamaKontrol değişkeni ya Sınıfı Geçtiniz ya da Sınıfta Kaldınız değerini alır, koşula bağlı olarak.</strong></p>