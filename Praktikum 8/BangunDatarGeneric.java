/* 
* Nama File : BangunDatarGeneric.java 
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 23 Mei 2023
* Deskripsi : Kelas konstruksi generic untuk BangunDatar
* Lab 	    : B1
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Mengganti karakter 'T' dengan karakter yang lain seperti T1, T2, T1234 adalah suatu metode untuk memberikan nama 
//yang lebih deskripstif kepada parameter generik. Parameter generik ini digunakan untuk memberikan fleksibilitas 
//dalam penggunaan data dan digunakan sebagai pembeda ketika digunakan lebih dari satu parameter generik dalam kelas tersebut.