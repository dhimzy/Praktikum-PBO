/* 
* Nama File 	: ExceptionOnArray.java
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 29 Maret 2023
* Deskripsi 	: Program penggunaan eksepsi menggunakan class library Java
* Lab 	    	: B1
*/

public class ExceptionsOnArray{
    public static void main(String[] args){
        //instansiasi object array integer
        Integer[]arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}