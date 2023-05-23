/* 
* Nama File : Lingkaran.java 
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 23 Mei 2023
* Deskripsi : Implementasi Lingkaran sebagai BangunDatar
* Lab 	    : B1
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}