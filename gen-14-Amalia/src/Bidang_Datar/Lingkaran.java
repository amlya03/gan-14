/**
 * 
 */
package Bidang_Datar;

/**
 * @author Amalia
 *
 */
public class Lingkaran {

	//Inisialisasi Atribut Lingkaran
	private int jari_jari;
	private double Luas_Lingkaran;
	private double Keliling_Lingkaran;
	
	//Getter dan Setter Luas Lingkaran
	public double getLuas_Lingkaran() {
		return Luas_Lingkaran;
	}

	public void setLuas_Lingkaran(int jari_jari) throws Exception {
		if (jari_jari > 0) {
			this.jari_jari = jari_jari;
		} else {
			throw new Exception("Nilai jari-jari tidak boleh negatif");
		}
		
	//Rumus Luas Lingkaran = 3.14 x jari_jari x jari_jari
	this.Luas_Lingkaran = 3.14 * jari_jari * jari_jari;
	}
	
	//Getter dan Setter Keliling Lingkaran
	public double getKeliling_Lingkaran() {
		return Keliling_Lingkaran;
	}

	public void setKeliling_Lingkaran(int sisi) throws Exception {
		if (jari_jari > 0) {
			this.jari_jari = jari_jari;
		} else {
			throw new Exception("Nilai jari-jari tidak boleh negatif");
		}
		
	//Rumus Keliling Lingkaran = 3.14 x (jari_jari x 2)
	this.Keliling_Lingkaran = 3.14 * (jari_jari * 2);
	}

}
