/* 
* Nama File : Programmer.java 
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 3 Mei 2023
* Deskripsi : Class programmer
* Lab 	    : B1
*/

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}