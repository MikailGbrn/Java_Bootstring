=== SESI 9 ===

Parsing data menggunakan XML

XML Parsing adalah parsing yang dirancang untuk membaca XML dan menciptakan cara bagi program untuk menggunakan XML.

XML adalah eXtensible Markup Language.

--- Cara Kerja XML ---
1. SAX (Simple API XML)

- Membuat file Runner dengan nama MyRunner.java untuk menciptakan method parser dari XML file
- Membuat file handler dengan nama MyHandler.java untuk menentukan data yang akan diterima dan akan dikirimkan
- Terakhir membuat file main untuk mengeksekusi read XML dengan nama JavaReadXmlSaxEx.java
- dalam file tersebut, dilakukan pemanggilan method runner sehingga data dari XML akan terpanggil
- kemudian untuk menampilkan datanya, dilakukan command di CMD dengan menuliskan perintah "mvn exec:java -Dexec.mainClass="com.ParsingXmlSax.module.Mail""

2. DOM (Document Object Model)

- Membuat file XML dengan data yang ada di dalamnya
- Membuat file parse XML untuk melakukan parsing XML agar dapat ditampilkan
- menjalankan file parse XML tersebut untuk menampilkan data yang ada di XML

3. ALEXA

- Alexa adalah file XML yang dapat diperoleh dari pihak ketiga, 
- sehingga yang dilakukan pada bagian ini adalah melakukan parsing XML dari data XML yang sudah tersedia tersebut
