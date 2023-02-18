/**
 * 
 */
package Bidang_Datar;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Amalia
 *
 */
public class Luas_Keliling_Bidang_Datar {

	public static void main(String[] args) {
		
	System.out.println("--Menghitung Luas dan Keliling Bidang Datar--");

	/**
	 * Luas dan Keliling Segitiga
	 *
	 */
			System.out.println("--Menghitung Luas dan Keliling Segitiga-- \n");
			
			//Tinggi Segitiga
			Scanner tinggi_segitiga = new Scanner(System.in);
			System.out.println("Masukkan Nilai Tinggi Segitiga");
			int Tinggi_Segitiga = tinggi_segitiga.nextInt();
			
			//Alas Segitiga
			Scanner alas_segitiga = new Scanner(System.in);
			System.out.println("Masukkan Nilai Alas Segitiga");
			int Alas_Segitiga = alas_segitiga.nextInt();
			
			//Sisi Segitiga
			Scanner sisi_segitiga = new Scanner(System.in);
			System.out.println("Masukkan Nilai Sisi Segitiga");
			int Sisi_Segitiga = sisi_segitiga.nextInt();

			//Hasil Perhitungan Luas dan Keliling Segitiga
			Segitiga segitiga = new Segitiga();
			try {
				segitiga.setLuas_Segitiga(Alas_Segitiga,Tinggi_Segitiga);
				
			} catch (Exception e) {
			}
			System.out.println("\n"+"Luas Segitiga = "+segitiga.getLuas_Segitiga()+" cm^2 \n");
		
			try {
				segitiga.setKeliling_Segitiga(Sisi_Segitiga);
				
			} catch (Exception e) {
			}
			System.out.println("Keliling Segitiga = "+segitiga.getKeliling_Segitiga()+" cm \n");	
    

	/**
	 * Luas dan Keliling Persegi
	 *
	 */
        	System.out.println("---Menghitung Luas dan Keliling Persegi-- \n");

    		//Sisi Persegi
    		Scanner sisi_persegi = new Scanner(System.in);
    		System.out.println("Masukkan Nilai Sisi Persegi");
    		int Sisi_Persegi = sisi_persegi.nextInt();

    		//Hasil Perhitungan Luas dan Keliling Persegi
    		Persegi persegi = new Persegi();
    		try {
    			persegi.setLuas_Persegi(Sisi_Persegi);
    			
    		} catch (Exception e) {
    		}
    		System.out.println("Luas Persegi = "+persegi.getLuas_Persegi()+" cm^2 \n");
     
    		try {
    			persegi.setKeliling_Persegi(Sisi_Persegi);
    			
    		} catch (Exception e) {
    		}
    		System.out.println("Keliling Persegi = "+persegi.getKeliling_Persegi()+" cm \n");
    		
    		
	/**
	 * Luas dan Keliling Lingkaran
	 *
	 */
			System.out.println("--Menghitung Luas dan Keliling Lingkaran-- \n");
			
			//Jari-jari Lingkaran
			Scanner jari_jari = new Scanner(System.in);
			System.out.println("Masukkan Nilai Jari-jari Lingkaran");
			int Jari_Jari = jari_jari.nextInt();
			
			//Hasil Perhitungan Luas dan Keliling Lingkaran
			Lingkaran lingkaran = new Lingkaran();
			try {
				lingkaran.setLuas_Lingkaran(Jari_Jari);
				
			} catch (Exception e) {
			}
			System.out.println("Luas Lingkaran = "+lingkaran.getLuas_Lingkaran()+" cm^2 \n");

			try {
				lingkaran.setKeliling_Lingkaran(Jari_Jari);
				
			} catch (Exception e) {
			}
			System.out.println("Keliling Lingkaran = "+lingkaran.getKeliling_Lingkaran()+" cm \n");
    
    
	/**
	 * Luas dan Keliling Belah Ketupat
	 *
	 */
    		System.out.println("--Menghitung Luas dan Keliling Belah Ketupat-- \n");

    		//Diagonal 1 Belah Ketupat
    		Scanner diagonal_1 = new Scanner(System.in);
    		System.out.println("Masukkan Nilai Diagonal 1 Belah Ketupat");
    		int Diagonal_1 = diagonal_1.nextInt();
    		
    		//Diagonal 2 Belah Ketupat
    		Scanner diagonal_2 = new Scanner(System.in);
    		System.out.println("Masukkan Nilai Diagonal 2 Belah Ketupat");
    		int Diagonal_2 = diagonal_2.nextInt();
    		
    		//Sisi Belah Ketupat
    		Scanner sisi_belah_ketupat = new Scanner(System.in);
    		System.out.println("Masukkan Nilai Sisi Belah Ketupat");
    		int Sisi_Belah_Ketupat = sisi_belah_ketupat.nextInt();
    		
    		//Hasil Perhitungan Luas dan Keliling Belah Ketupat
    		BelahKetupat belahketupat = new BelahKetupat();
    		try {
    			belahketupat.setLuas_Belah_Ketupat(Diagonal_1,Diagonal_2);
    			
    		} catch (Exception e) {
    		}
    		System.out.println("Luas Belah Ketupat = "+belahketupat.getLuas_Belah_Ketupat()+" cm^2 \n");

    		try {
    			belahketupat.setKeliling_Belah_Ketupat(Sisi_Belah_Ketupat);
    			
    		} catch (Exception e) {
    		}
    		System.out.println("Keliling Belah Ketupat = "+belahketupat.getKeliling_Belah_Ketupat()+" cm \n");
    		
    		
    /**
	 * List Luas Bidang Datar
	 *
	 */
        	System.out.println("--List Luas Bidang Datar--");
        	
    		double[] ListLuas = new double[4];
    		ListLuas[0] = segitiga.getLuas_Segitiga();
    		ListLuas[1] = persegi.getLuas_Persegi();
    		ListLuas[2] = lingkaran.getLuas_Lingkaran();
    		ListLuas[3] = belahketupat.getLuas_Belah_Ketupat();
    		
    		System.out.println(Arrays.toString(ListLuas)+ " cm^2");
    		
//    /**
//	 * List Keliling Bidang Datar
//	 *
//	 */
//        	System.out.println("--List Keliling Bidang Datar--");
    		
//    		double[] ListKeliling = new double[4];
//    		ListKeliling[0] = segitiga.getKeliling_Segitiga();
//    		ListKeliling[1] = persegi.getKeliling_Persegi();
//    		ListKeliling[2] = lingkaran.getKeliling_Lingkaran();
//    		ListKeliling[3] = belahketupat.getKeliling_Belah_Ketupat();
//    		
//    		System.out.println(Arrays.toString(ListKeliling)+ " cm");
// 
	}
}