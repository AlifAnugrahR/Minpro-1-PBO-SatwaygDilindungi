package com.mycompany.minpro.pbo.satwaygdilindungi;

import java.util.ArrayList;

public class SatwaCRUD {

    public ArrayList<Satwa> daftarSatwa = new ArrayList<>();

    public void tambahSatwa(int id, String nama, String jenis) {
        Satwa satwaBaru = new Satwa(id, nama, jenis);
        daftarSatwa.add(satwaBaru);

        System.out.println(">>> DATA SATWA BERHASIL DITAMBAHKAN BOSS <<<");
    }

    public void tampilkanSatwa() {
        System.out.println("\n>>> DAFTAR SATWA <<<");

        if (daftarSatwa.isEmpty()) {
            System.out.println(">>> BELUM ADA DATA SATWA BOSS <<<");
            return;
        }

        for (int i = 0; i < daftarSatwa.size(); i++) {
            Satwa s = daftarSatwa.get(i);

            s.tampilkanInfo();
            System.out.println("--------------------");
        }
    }

    public void updateSatwa(int idTarget, String namaBaru, String jenisBaru) {
        for (Satwa s : daftarSatwa) {

            if (s.idSatwa == idTarget) {
                s.nama = namaBaru;
                s.jenis = jenisBaru;

                System.out.println(">>> DATA SATWA BERHASIL DIUBAH BOSS <<<");
                return;
            }
        }

        System.out.println(">>> ID SATWA TIDAK DITEMUKAN BOSS <<<");
    }

    public void hapusSatwa(int idTarget) {
        for (Satwa s : daftarSatwa) {

            if (s.idSatwa == idTarget) {
                daftarSatwa.remove(s);

                System.out.println(">>> DATA SATWA BERHASIL DIHAPUS BOSS <<<");
                return;
            }
        }

        System.out.println(">>> ID SATWA TIDAK DITEMUKAN BOSS <<<");
    }
}