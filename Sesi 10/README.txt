Pada relational database, data disimpan dalam sebuah skema yang ditampilkan seperti tabel (terdiri dari baris dan kolom).

Setiap data pada relational database diidentifikasi menggunakan key atau primary key. Untuk memanipulasi data pada relational database digunakan sebuah bahasa yang disebut dengan Structured Query Language (SQL), oleh karena itu Relational Database juga disebut dengan SQL database.

Contoh Relational Database:
●MySQL
●MariaDB
●PostgreSQL
●SQL Server
●Oracle

Pada SQL database seperti MySQL, sebuah data harus disimpan dalam bentuk tabel.Data tersusun rapi dan mudah dibaca. Sedangkan pada NoSQL database, data dapat disimpan dalam bentuk document, key-value, wide column atau graph. Data yang ditambahkan pada NoSQL database umumnya adalah data yang tidak terstruktur / beraturan.

Berbagai macam relasi dalam database:
●one to one
●one to many
●many to many

--- DDL ---

Data Definition Language(DDL)merupakan sintaks-sintaks yang berfungsi untuk melakukan manipulasi struktur dari basis data. Secara umum, DDL digunakan untuk membuat tabel dan view. Secara khusus dalam DBMS tertentu, DDL digunakan untuk membuat trigger, membuat stored procedure, juga membuat database, index, rule, schema, dan lainlain tergantung DBMS.

Beberapa sintaks yang sering dijumpai dalam DDL:
CREATE DATABASE: membuat basis data.
CREATE TABLE : membuat tabel.
ALTER TABLE : merubah struktur suatu tabel.
DROP TABLE : menghapus suatu tabel.
CREATE INDEX : membuat suatu index dalam tabel.
DROP INDEX : menghapus suatu index dalam tabel

Data Manipulation Language (DML)merupakan sintaks-sintaks yang berfungsi untuk melakukan manipulasi data ataupun objek-objek yang ada di dalam tabel.

Berikut merupakan penjelasan singkat dari sintaks-sintaks DML:
SELECT, mengakses data dari suatu tabel dalam basis data.
UPDATE, melakukan update data dalam suatu tabel pada basis data.
DELETE, menghapus data dari suatu tabel dalam basis data.
INSERT, menambahkan data ke dalam suatu tabel dalam basis data
