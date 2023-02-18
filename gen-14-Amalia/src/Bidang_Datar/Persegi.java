/**
 * 
 */
package Bidang_Datar;

/**
 * @author Amalia
 *
 */
public class Persegi {

	//Inisialisasi Atribut Persegi
	private int sisi;
	private double Luas_Persegi;
	private int Keliling_Persegi;
	
	//Getter dan Setter Luas Persegi
	public double getLuas_Persegi() {
		return Luas_Persegi;
	}

	public void setLuas_Persegi(int sisi) throws Exception {
		if (sisi > 0) {
			this.sisi = sisi;
		} else {
			throw new Exception("Nilai sisi tidak boleh negatif");
		}
		
	//Rumus Luas Persegi = sisi x sisi
	this.Luas_Persegi = sisi * sisi;
	}
	
	//Getter dan Setter Keliling Persegi
	public double getKeliling_Persegi() {
		return Keliling_Persegi;
	}

	public void setKeliling_Persegi(int sisi) throws Exception {
		if (sisi > 0) {
			this.sisi = sisi;
		} else {
			throw new Exception("Nilai sisi tidak boleh negatif");
		}
		
	//Rumus Keliling Persegi = sisi x 4
	this.Keliling_Persegi = sisi * 4;
	}
	
}
