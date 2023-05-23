/* 
* Nama File : BangunDatarGenericTest.java 
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 23 Mei 2023
* Deskripsi : Main class untuk generic bangun datar
* Lab 	    : B1
*/

public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran 1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(1);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());
    }
}