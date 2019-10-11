package com.example.rumahkite;

import java.util.ArrayList;

public class HomeDummy {
    private static String[] homeType = {
        "Rumah Type 21 Karet" ,
        "Rumah Type 36 Kota Baru",
        "Rumah Type 45 Jeruju",
        "Rumah Type 54 Ahmad Yani",
        "Rumah Type 60 Sungai Raya Dalam",
        "Rumah Type 70 Perintis"
    };

    private static String[] homePrice = {
            "Rp. 300 Juta",
            "Rp. 400 Juta",
            "Rp. 500 Juta",
            "Rp. 800 Juta",
            "Rp. 900 Juta",
            "Rp. 1.2 Milliar"
    };

    private static String[] homeDesc = {
            "Lokasi di Jalan Karet no 77  Dengan akses jalan selebar 5 meter, kurang lebih 10 menit dari pasar teratai",
            "Lokasi di Jalan PGA no 77  Dengan akses jalan selebar 3 meter, jarak antar rumah sekitar 2 meter, kurang lebih 5 menit dari pasar kemuning",
            "Lokasi di Jalan Tebu no 77  Dengan akses jalan selebar 5 meter, pas di depan Sekolah Tunas Bakti ",
            "Lokasi di Jalan Ahmad Yani no 77  Dekat dengan KFC A Yani serta bisa juga lewat di jalan gajah mada",
            "Lokasi di Jalan Sejahtera no 77 Dengan akses jalan sebear 4 meter, kurang lebih 5 menit untuk menuju Jln Ahmad Yani",
            "Lokasi di Jalan Perintis Kota Baru Ujung no 77  Dengan akses jalan selebar 5 meter, kurang lebih 10 menit dari Jln Ampera",


    };

    private static int[] homeImages = {
            R.drawable.tipe21,
            R.drawable.tipe36,
            R.drawable.tipe45,
            R.drawable.tipe54,
            R.drawable.tipe60,
            R.drawable.type70
    };

    static ArrayList<Home> getListData() {
        ArrayList<Home> list = new ArrayList<>();
        for (int position = 0; position <homeType.length; position++) {
            Home home = new Home();
            home.setType_home(homeType[position]);
            home.setHarga(homePrice[position]);
            home.setDeskripsi(homeDesc[position]);
            home.setFoto(homeImages[position]);
            list.add(home);
        }
        return list;
    }
}
