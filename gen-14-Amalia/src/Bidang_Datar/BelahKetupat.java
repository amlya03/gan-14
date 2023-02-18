/**
 * 
 */
package Bidang_Datar;

/**
 * @author Amalia
 *
 */
public class BelahKetupat {
	
	//Inisialisasi Atribut Belah Ketupat
	private int diagonal1;
	private int diagonal2;
	private int sisi;
	private double Luas_Belah_Ketupat;
	private int Keliling_Belah_Ketupat;
	
	//Getter dan Setter Luas Belah Ketupat
	public double getLuas_Belah_Ketupat() {
		return Luas_Belah_Ketupat;
	}
	
	public void setLuas_Belah_Ketupat(int diagonal1, int diagonal2) throws Exception{
		if (diagonal1 > 0) {
			this.diagonal1 = diagonal1;
			}
		else{
			throw new Exception ("Nilai diagonal 1 tidak boleh negatif");
			}
		
		if (diagonal2 > 0) {
			this.diagonal2 = diagonal2;
			}
		else {
				throw new Exception ("Nilai diagonal 1 tidak boleh negatif");
			}
		
	//Rumus Luas Belah Ketupat = diagonal1 x diagonal2 x 0.5
	this.Luas_Belah_Ketupat = diagonal1 * diagonal2 * 0.5;
	}
	
	//Getter dan Setter Keliling Belah Ketupat
	public double getKeliling_Belah_Ketupat() {
		return Keliling_Belah_Ketupat;
	}
	
	public void setKeliling_Belah_Ketupat(int sisi) throws Exception{
		if (sisi > 0) {
			this.sisi = sisi;
			}
		else{
				throw new Exception ("Nilai sisi tidak boleh negatif");
			}
		
	//Rumus Keliling Belah Ketupat = sisi x 4
	this.Keliling_Belah_Ketupat = sisi * 4;
	}
	
}