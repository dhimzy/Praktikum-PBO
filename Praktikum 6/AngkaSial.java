/* 
* Nama File 	: AngkaSial.java
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 29 Maret 2023
* Deskripsi 	: Program penggunaan exception buatan sendiri
              	Pengenalan klausa 'throw' dan 'throws'
* Lab 	    	: B1
*/


public class AngkaSial{

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Pertanyaan modul: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Penjelasan : baris ke-12 dan 21 tidak dapat dieksekusi karena terdapat kebutuhan untuk membuat class exception AngkaSial terlebih dahulu, 
// yang nantinya akan menjadi turunan dari class exception. Oleh karena itu, langkah awal yang perlu dilakukan adalah 
// membuat class AngkaSial exception sebelum dapat menjalankan baris tersebut.