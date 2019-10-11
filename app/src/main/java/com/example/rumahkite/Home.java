package com.example.rumahkite;

public class Home {
    private String type_home;
    private String harga;
    private String deskripsi;
    private int foto;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }



    public String getType_home() {
        return type_home;
    }

    public void setType_home(String type_home) {
        this.type_home = type_home;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
