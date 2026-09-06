package com.mycompany.minpro.pbo.satwaygdilindungi;

public class Satwa {

    public int idSatwa;
    public String nama;
    public String jenis;

    public Satwa(int idSatwa, String nama, String jenis) {
        this.idSatwa = idSatwa;
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("ID Satwa: " + idSatwa);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}