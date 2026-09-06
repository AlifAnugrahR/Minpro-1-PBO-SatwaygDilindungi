package com.mycompany.minpro.pbo.satwaygdilindungi;

public class SatwaCek {

    public boolean cekID(String id) {
        try {
            Integer.parseInt(id);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean cekNama(String nama) {
        if (nama.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean cekJenis(String jenis) {
        if (jenis.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}