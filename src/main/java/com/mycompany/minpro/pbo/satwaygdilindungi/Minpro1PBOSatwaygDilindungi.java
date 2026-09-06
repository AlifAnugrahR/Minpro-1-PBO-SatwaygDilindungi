package com.mycompany.minpro.pbo.satwaygdilindungi;

import java.util.Scanner;

public class Minpro1PBOSatwaygDilindungi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SatwaCRUD crud = new SatwaCRUD();
        SatwaCek cek = new SatwaCek();

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n>>> SISTEM PENDATAAN SATWA DILINDUNGI <<<");
            System.out.println("1. Tambah Satwa");
            System.out.println("2. Tampilkan Satwa");
            System.out.println("3. Update Satwa");
            System.out.println("4. Hapus Satwa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pilihanInput = scanner.nextLine();

            if (!cek.cekID(pilihanInput)) {
                System.out.println(">>> PILIHAN HARUS BERUPA ANGKA BOSS <<<");
                continue;
            }

            int pilihan = Integer.parseInt(pilihanInput);

            switch (pilihan) {

                case 1 -> {
                    System.out.println("\n>>> TAMBAH DATA SATWA <<<");

                    System.out.print("ID Satwa: ");
                    String idInput = scanner.nextLine();

                    if (!cek.cekID(idInput)) {
                        System.out.println(">>> ID HARUS BERUPA ANGKA BOSS <<<");
                        break;
                    }

                    int id = Integer.parseInt(idInput);

                    System.out.print("Nama Satwa: ");
                    String nama = scanner.nextLine();

                    System.out.print("Jenis Satwa: ");
                    String jenis = scanner.nextLine();

                    if (cek.cekNama(nama) && cek.cekJenis(jenis)) {
                        crud.tambahSatwa(id, nama, jenis);
                    } else {
                        System.out.println(">>> NAMA DAN JENIS SATWA TIDAK BOLEH KOSONG BOSS <<<");
                    }
                }

                case 2 -> {
                    crud.tampilkanSatwa();
                }

                case 3 -> {
                    System.out.println("\n>>> UPDATE DATA SATWA <<<");

                    System.out.print("Masukkan ID Satwa yang ingin diubah: ");
                    String idInput = scanner.nextLine();

                    if (!cek.cekID(idInput)) {
                        System.out.println(">>> ID HARUS BERUPA ANGKA BOSS <<<");
                        break;
                    }

                    int idTarget = Integer.parseInt(idInput);

                    System.out.print("Nama Satwa Baru: ");
                    String namaBaru = scanner.nextLine();

                    System.out.print("Jenis Satwa Baru: ");
                    String jenisBaru = scanner.nextLine();

                    if (cek.cekNama(namaBaru) && cek.cekJenis(jenisBaru)) {
                        crud.updateSatwa(idTarget, namaBaru, jenisBaru);
                    } else {
                        System.out.println(">>> NAMA DAN JENIS SATWA TIDAK BOLEH KOSONG BOSS <<<");
                    }
                }

                case 4 -> {
                    System.out.println("\n>>> HAPUS DATA SATWA <<<");

                    System.out.print("Masukkan ID Satwa yang ingin dihapus: ");
                    String idInput = scanner.nextLine();

                    if (!cek.cekID(idInput)) {
                        System.out.println(">>> ID HARUS BERUPA ANGKA BOSS <<<");
                        break;
                    }

                    int idTarget = Integer.parseInt(idInput);

                    crud.hapusSatwa(idTarget);
                }

                case 5 -> {
                    berjalan = false;
                    System.out.println(">>> PROGRAM SELESAI BOSS <<<");
                }

                default -> {
                    System.out.println(">>> PILIHAN TIDAK VALID BOSS <<<");
                }
            }
        }

        scanner.close();
    }
}