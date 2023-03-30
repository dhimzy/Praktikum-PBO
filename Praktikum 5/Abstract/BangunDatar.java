/* 
* Nama File : BangunDatar.java 
* Penulis 	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 25 Maret 2023
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}