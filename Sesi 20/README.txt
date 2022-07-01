==== JUnit testing ====

JUnit Testing berfungsi untuk melakukan test pada method tanpa melakukan run pada aplikasi
atau program.

untuk menjalankan JUnit testing ada beberapa langkah yang harus dilakukan:

Membuat Class Test di Dalam Package Test
----
- ProductServiceTest
	membuat class ProductServiceTest dengan beberapa method di dalamnya untuk dijalankan saat
	melakukan testing. method tersebut ditandai dengan annotation @Test agar sistem
	dapat membaca bahwa method tersebut akan dijalankan sebagai method testing



==== Basic AUTH ====

Basic Auth berfungsi untuk melakukan LOGIN pada program tanpa harus menggunakan token,
jadi sebagai user cukup melakukan dengan memasukkan credentials yang sudah terdaftar.

Melanjutkan dari project Produk API, basic auth juga memiliki fungsi yang sama sebagai API
program. namun, hal yang membedakannya ialah terdapat security config yang berfungsi untuk
mengolah data credentials agar dapat melakukan login tanpa menggunakan token