Operasi dasar pada MongoDB mirip dengan operasi dasar pada SQL database pada umumnya.

Perintah yang digunakan untuk membuat database:
use DATABASE_NAME

Untuk melihat database yang sudah ada kita gunakan perintah:
show dbs


Perintah atau method yang digunakan untuk membuat collection:
db.createCollection(name, options)

Create berarti menambahkan data(selanjutnya kita sebut document) ke dalam collection.MongoDB menyediakan dua metode untuk menambahkan document, yaitu:
- db.collection.insertOne(), untuk menambahkan document tunggal/single
- db.collection.insertMany(), untuk menambahkan banyak document

Perintah atau method untuk melakukan read adalah:
db.collection.find();

Untuk memperbaharui sebuah document kita gunakan method berikut:
- db.collection.updateOne(filter, update) , ubah satu document
- db.collection.updateMany(filter, update), ubah banyak document sekaligus sesuai filter
- db.collection.replaceOne(filter, update), ganti satu document dengan document yang baru sesuai filter


Ada 2 method yang dapat digunakan untuk menghapus document. Yaitu:
- db.collection.deleteOne(filter), hapus satu document
-  db.collection.deleteMany(filter), hapus banyak document sekaligus sesuai filter

createCollection : untuk membuat tabel
validator : untuk membuat validasi pada json
$jsonSchema : untuk masuk ke dalam fungsi json
bsonType : tipe data
required : data apa saja yang pada saat di tambahkan datanya itu harus diisi
properties : peraturan – peraturan yang akan dibuat untuk validasi data tersebut
items : untuk data bertipe array
