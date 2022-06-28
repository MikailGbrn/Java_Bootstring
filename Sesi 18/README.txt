==== Spring Booth Auth with JWT =====

Project ini memiliki beberapa package diantaranya:
- Package apijwt
- Package Config
- Package Controller
- Package Exceptions
- Package Model
- Package Repository
- Package Service

Package apijwt
---
Package ini digunakan untuk inisialisasi main class

Package Config
---
Di dalam package ini terdapat requestfilter yang berguna untuk melakukan filter antara
request dan response

terdapat juga authentication entrypoint untuk mengeluarkan output exception jika terjadi
kegagalan dalam authentication

terdapat class token dimana dilakukan generate token setelah dilakukan authorization oleh
user

terdapat class web security config untuk melakukan password encoder yang di input oleh user
dimana password encoder akan membaca string password dan menyesuaikannya dengan hashcode
yang telah digenerate oleh sistem

Package Controller
---
pada package controller terdapat class authcontroller dimana pada class ini akan berkomunikasi
dengan class di dalam config untuk melakukan generate token dan menyampaikannya kepada user

class blogcontroller melakukan input data, menampilkan data, dan basic CRUD yang di request
oleh user dengan method get put dan post

class userinfocontroller juga melakukan CRUD untuk menampilkan data user yang di request oleh
user dengan method get put dan post

Package Exceptions
---
pada package ini terdapat base error handler dan validation exception yang berguna untuk melakukan
pengecekkan jika terjadi kegagalan dalam melakukan running sistem dan mengembalikan error log
dari error yang terjadi

Package Model
---
pada package ini terdapat model entity untuk membuat table pada database beserta isi dari
table-table tersebut. terdapat dua entity di dalam package model yakni model blog dan model user

Package Repository
---
package repository berguna sebagai entry point dari user dan blog untuk melakukan transaksi data

Package Service
---
di dalam package service digunakan untuk melakukan koneksi antara sistem dengan database yang
telah dihubungkan melalui application properties

