<h1>Dik Üçgende Hipotenüs Bulan Program</h1>

<p> Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.</p>

<h2> Ödev</h2>
<p>Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.</p>
<h2>Formül </h2>
<i>Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢</i>
<p>𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)</p>

<p><strong>Bu kodda üçgenin kenarlarını scanner yardımıyla klavyeden okuduktan sonra alan formulü için gerekli olan u değerini hesapladım.
ardından alanın ondalıklı bir sayı çıkma ihtimaline karşı double bir veri türü kullanarak alan hesabı yaptım.
Ardından negatif bir sayı çıkmasın diye mutlak değere aldım ( Math.abs(alan)) 
son olarak Math.sqrt işlevini kullanarak karekök hesaplaması yaparak alan^2 yi alana dönüştürerek ekrana yazdırdım</strong></p>