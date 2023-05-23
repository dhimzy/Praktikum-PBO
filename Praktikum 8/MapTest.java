/* 
* Nama File : MapTest.java 
* Pembuat	: Dhiya Mazaya
* NIM		: 24060121140151
* Tanggal 	: 23 Mei 2023
* Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
* Lab 	    : B1
*/

import java.util.*;

public class MapTest {
	public static void main(String[] args){
        	//kunci -> integer, nilai -> string 
        	Map<Integer,String> map = new HashMap<Integer,String>();
        	// menempatkan elemen kunci dan nilai
        	map.put(1, "satu");
        	map.put(2, "dua");
        	//mengambil elemen pertama
        	System.out.println(map.get(1));
        	//mengambil keseluruhan kunci sebagai objek collection set
        	Set<Integer> key = map.keySet();
		//iterasi untuk mengambil keseluruhan nilai dari kunci
		for (Integer k : key){
			String value = map.get(k);
			System.out.println(value);
		}
	}
}