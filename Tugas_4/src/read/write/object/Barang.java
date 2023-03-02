package read.write.object;

import java.io.Serializable;

public class Barang implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nama;
	private int harga;
	private int stok;

	public Barang() {
		super();
	}
	public Barang(String nama, int harga, int persediaan) {
		super();
		this.nama = nama;
		this.harga = harga;
		this.stok = persediaan;
	}
	
	public void setHarga(int harga) throws Exception {
		if (harga>0) {
			this.harga = harga;			
		} else {
			throw new Exception("Harga tidak boleh negatif");
		}
	}
	
	@Override
	public String toString() {
		return this.nama + "	 "+ StringUtil.toRupiah(this.harga) + " stok:"+this.stok;
	}

}
