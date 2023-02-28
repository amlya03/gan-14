package Soal_Latihan;

import java.util.*;

public class Soal_7 {
	public static void main(String[] args) {
		String[] namaBarang = new String[4];
		int[] hargaBarang = new int[4];
		
		namaBarang[0] = "Buavita";
		hargaBarang[0] = 7000;
		
		namaBarang[1] = "Oreo";
		hargaBarang[1] = 6000;

		namaBarang[2] = "Tanggo";
		hargaBarang[2] = 5000;
		
		namaBarang[3] = "Aqua";
		hargaBarang[3] = 3000;
		
		System.out.println("-----Daftar Barang-----");
		for (int i=0; i<namaBarang.length; i++) {
			System.out.println(namaBarang[i]+ "	= "+ hargaBarang[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n"+"Masukkan jumlah uang yang dimiliki: ");
		int uang = scanner.nextInt();
		scanner.close();
		
		List<String> belanja = new ArrayList<>();
		while(uang > 0) {
			if(uang >= hargaBarang[0]) {
				uang -= 7000;
				belanja.add("Buavita");
			}
			else if(uang >= hargaBarang[1]) {
				uang -= 6000;
				belanja.add("Oreo");
			}
			else if(uang >= hargaBarang[2]) {
				uang -= 5000;
				belanja.add("Tanggo");
			}
			else if(uang >= hargaBarang[3]){
				uang -= 3000;
				belanja.add("Aqua");
			}

		}
		
		System.out.println("\n"+"Barang Termahal yang dapat Anda Beli : "+belanja.get(0)+ "\n");
		
		while(belanja.size()>1) {
			System.out.println("Kami juga Merekomendasikan untuk membeli : "+ belanja);
			return;
		}
	}
}
