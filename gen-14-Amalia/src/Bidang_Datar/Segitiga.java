/**
 * 
 */
package Bidang_Datar;

/**
 * @author Amalia
 *
 */
public class Segitiga {
	
	//Inisialisasi Atribut Segitiga
	private int tinggi;
	private int alas;
	private int sisi;
	private double Luas_Segitiga;
	private int Keliling_Segitiga;

	//Getter dan Setter Luas Segitiga
	public double getLuas_Segitiga() {
		return Luas_Segitiga;
	}

	public void setLuas_Segitiga(int tinggi, int alas) throws Exception {
		if (tinggi > 0) {
			this.tinggi = tinggi;
		} else {
			throw new Exception("Nilai tinggi tidak boleh negatif");
		}

		if (alas > 0) {
			this.alas = alas;
		} else {
			throw new Exception("Nilai alas tidak boleh negatif");
		}
		
	//Rumus Luas Segitiga = tinggi x alas x 0.5
		this.Luas_Segitiga = tinggi * alas * 0.5;
	}

	//Getter dan Setter Keliling Segitiga
	public double getKeliling_Segitiga() {
		return Keliling_Segitiga;
	}

	public void setKeliling_Segitiga(int sisi) throws Exception {
		if (sisi > 0) {
			this.sisi = sisi;
		} else {
			throw new Exception("Nilai sisi tidak boleh negatif");
		}
		
	//Rumus Keliling Segitiga = sisi x 3
	this.Keliling_Segitiga = sisi * 3;
	}
	
}
