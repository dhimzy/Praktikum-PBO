/* 
* Nama File 	: AngkaSialException.java
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 29 Maret 2023
* Deskripsi 	: Eksepsi buatan sendiri, menolak masukan angka 13!
* Lab 	    	: B1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}