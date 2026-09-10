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

### **3. Menampilkan Data Satwa**

Setelah data berhasil ditambahkan, pengguna memilih menu 2. Tampilkan Satwa. Program kemudian menampilkan data satwa yang telah tersimpan.

Data yang ditampilkan adalah:

ID Satwa: 01
Nama: Rusa Bercula 38
Jenis: pasukan amfibi

Hal ini menunjukkan bahwa data yang sebelumnya dimasukkan berhasil tersimpan dan dapat ditampilkan kembali.

<img width="362" height="91" alt="image" src="https://github.com/user-attachments/assets/4ee5e3b3-cfa2-4c2b-9672-1c4b6795716d" />

### **4. Update Data satwa**

Pada tahap ini, pengguna memilih menu 3. Update Satwa. Program meminta ID satwa yang ingin diubah.

ID satwa yang dipilih adalah 01. Kemudian data tersebut diperbarui menjadi:

Nama Satwa: Rusa hitam
Jenis Satwa: pasukan aliep

Setelah proses berhasil dilakukan, program menampilkan pesan "DATA SATWA BERHASIL DIUBAH BOSS".

<img width="417" height="96" alt="image" src="https://github.com/user-attachments/assets/1a569dbf-b44a-4f78-b110-76ce62e02a2a" />

### **5. Pengujian Validasi Input**

Pada tahap ini, pengguna memilih menu 4. Hapus Satwa dan memasukkan ID 4.

Karena ID tersebut tidak terdapat dalam data satwa yang tersimpan, program menampilkan pesan "ID SATWA TIDAK DITEMUKAN BOSS".

Pengujian ini menunjukkan bahwa program dapat menangani kondisi ketika pengguna memasukkan ID yang tidak tersedia.

<img width="396" height="76" alt="image" src="https://github.com/user-attachments/assets/ebea9977-add6-4dc4-948e-7b01c41278fc" />

### **6. Pengujian Validasi Input**

Program dilengkapi dengan validasi input menggunakan class SatwaCek. Validasi ini digunakan untuk memastikan ID yang dimasukkan oleh pengguna berupa angka.

Pada pengujian ini, pengguna memilih menu 4. Hapus Satwa, kemudian memasukkan "we" sebagai ID.

Karena input tersebut bukan berupa angka, program menampilkan pesan "ID HARUS BERUPA ANGKA BOSS". Program tetap berjalan dan kembali menampilkan menu utama.

Hal ini menunjukkan bahwa validasi input berhasil mencegah kesalahan input yang dapat menyebabkan program berhenti secara tiba-tiba.

<img width="417" height="66" alt="image" src="https://github.com/user-attachments/assets/6d55284a-1c06-4e7b-a061-03da17043981" />

### **7. Hapus Data Satwa**

Pada tahap ini, pengguna memilih menu 4. Hapus Satwa. Pengguna kemudian memasukkan ID satwa yang ingin dihapus, yaitu 01.

Program melakukan pengecekan terhadap ID tersebut. Jika ID ditemukan, data satwa akan dihapus dari ArrayList dan program menampilkan pesan bahwa data satwa berhasil dihapus.

<img width="377" height="70" alt="image" src="https://github.com/user-attachments/assets/79588cf1-ad5c-42da-ab04-80f0ba5936c8" />

### **8. Keluar dari Program

Setelah proses pendataan selesai, pengguna memilih menu 5. Keluar. Program kemudian menampilkan pesan "PROGRAM SELESAI BOSS" dan menghentikan program.

<img width="562" height="132" alt="image" src="https://github.com/user-attachments/assets/79a2d7bd-5cf5-4908-b384-95f3be0d29eb" />

## **Penutup**

Program Sistem Pendataan Satwa Dilindungi telah berhasil dibuat dan dijalankan menggunakan bahasa pemrograman Java. Program ini dapat melakukan proses pengelolaan data satwa melalui fitur CRUD, yaitu menambah, menampilkan, mengubah, dan menghapus data.

Selain itu, program juga menerapkan konsep dasar Pemrograman Berorientasi Objek seperti class, object, constructor, method, ArrayList, percabangan, perulangan, dan validasi input. Berdasarkan hasil pengujian, setiap fitur dapat berjalan sesuai dengan fungsi yang telah dirancang dan program dapat menangani kesalahan input dari pengguna.

Dengan adanya program ini, proses pendataan satwa dilindungi dapat dilakukan secara sederhana dan terstruktur.
