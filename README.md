# **Sistem Pendataan Satwa Dilindungi**
## Alif Anugrah Ramadhan | 2509116019

## **Deskripsi Program**
Sistem Pendataan Satwa Dilindungi merupakan program berbasis bahasa pemrograman Java yang digunakan untuk melakukan pendataan satwa yang dilindungi secara sederhana. Program ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) dan menyediakan fitur CRUD, yaitu menambah, menampilkan, mengubah, dan menghapus data satwa. Program juga dilengkapi dengan validasi input untuk memastikan data yang dimasukkan oleh pengguna sesuai dengan ketentuan yang telah dibuat.

## **Class yang ada di program ini**
1. ### **Minpro1PBOSatwaygDilindungi.java**
Merupakan class utama atau entry point yang digunakan untuk menjalankan program. Class ini menampilkan menu utama, menerima input dari pengguna, dan menentukan proses yang akan dijalankan.
### **Satwa.java**
Merupakan class yang digunakan untuk menyimpan data satwa, yaitu ID satwa, nama satwa, dan jenis satwa. Class ini memiliki constructor dan method untuk menampilkan informasi satwa.
### **SatwaCRUD.java**
Merupakan class yang menangani proses CRUD pada data satwa. Class ini menggunakan ArrayList untuk menyimpan data dan menyediakan fungsi untuk menambah, menampilkan, mengubah, serta menghapus data satwa.
### **SatwaCek.java**
Merupakan class yang digunakan untuk melakukan validasi input. Class ini melakukan pengecekan agar ID yang dimasukkan berupa angka serta memastikan nama dan jenis satwa tidak kosong.

## **Alur Program**
Alur program dimulai ketika program dijalankan melalui class Minpro1PBOSatwaygDilindungi.java. Program akan menampilkan menu utama yang terdiri dari lima pilihan, yaitu Tambah Satwa, Tampilkan Satwa, Update Satwa, Hapus Satwa, dan Keluar.

Pengguna memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia. Program kemudian menggunakan percabangan untuk menentukan proses yang akan dijalankan.

Pada menu Tambah Satwa, pengguna dapat memasukkan ID, nama, dan jenis satwa. Data yang telah dimasukkan akan disimpan ke dalam ArrayList.

Pada menu Tampilkan Satwa, program akan menampilkan seluruh data satwa yang tersimpan.

Pada menu Update Satwa, pengguna memasukkan ID satwa yang ingin diubah kemudian memasukkan data baru.

Pada menu Hapus Satwa, pengguna memasukkan ID satwa yang ingin dihapus. Program akan melakukan pengecekan terlebih dahulu apakah ID tersebut tersedia.

Program juga memiliki validasi input sehingga apabila pengguna memasukkan ID dalam bentuk selain angka, program akan menampilkan pesan kesalahan tanpa menghentikan program.

Program akan terus berjalan dan menampilkan menu utama sampai pengguna memilih menu Keluar.

## **Dokumentasi Alur Program**
### **1. Tampilan Menu Utama**

Pada saat program dijalankan, program menampilkan menu utama Sistem Pendataan Satwa Dilindungi. Menu utama terdiri dari lima pilihan, yaitu Tambah Satwa, Tampilkan Satwa, Update Satwa, Hapus Satwa, dan Keluar.
<img width="362" height="138" alt="image" src="https://github.com/user-attachments/assets/17048a31-76e0-45ec-bf1d-207282635a68" />
### **2. Tambah Data Satwa**
Pada tahap ini, pengguna memilih menu 1. Tambah Satwa. Program kemudian meminta pengguna untuk memasukkan ID satwa, nama satwa, dan jenis satwa.

Pada pengujian ini, data yang dimasukkan adalah:

* ID Satwa: 01
* Nama Satwa: Rusa bercula 38
* Jenis Satwa: pasukan amfibi

Setelah seluruh data dimasukkan, program menampilkan pesan "DATA SATWA BERHASIL DITAMBAHKAN BOSS". Hal tersebut menunjukkan bahwa data berhasil disimpan ke dalam ArrayList.
<img width="448" height="100" alt="image" src="https://github.com/user-attachments/assets/a26a4de1-065a-4703-9149-38d391203a36" />



