package com.informatika.data;

public class Mobil extends Kendaraan implements BahanBakar {
	
	public String jenisTransmisi;
	
	public Mobil(String merk, String model, int tahunProduksi) {
		super(merk, model, tahunProduksi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String jenisBahanBakar() {
		// TODO Auto-generated method stub
		return "Bensin";
	}

	@Override
	public void nyalakanMesin() {
		// TODO Auto-generated method stub
		System.out.println("Nyalakan mesin: Tekan tombol start");
	}
	
	public void fiturMobil() {
		System.out.println("Fitur mobil: Memiliki AC dan audio premium ");
	}

}
