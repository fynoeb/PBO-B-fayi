package com.informatika.data;

public class Bus extends Kendaraan implements TransportasiUmum {

	String kelasBus;
	
	public Bus(String merk, String model, int tahunProduksi) {
		super(merk, model, tahunProduksi);
		// TODO Auto-generated constructor stub
	}
	
	public void nyalakanMesin() {
		System.out.println("Nyalakan mesin: putar kunci untuk menyalakan ");
	}
	
	public String jenisBahanBakar(){
		return "Solar";
	}
	
	public int kapasitasPenumpang() {
		return 45;
	}
	
	public void fiturBus() {
		System.out.println("Fitur bus: dilengkapi kursi nyaman dan fasilitas hiburan");
	}
	
	public class JadwalPerjalanan{
		String rute;
		String waktuBerangkat;
		
		public JadwalPerjalanan (String rute, String waktuBerangkat) {
			this.rute = rute;
			this.waktuBerangkat = waktuBerangkat;
		}
		
		public void tampilkanJadwal() {
			System.out.println("Jadwal Perjalanan: Rute " + rute + ", Waktu Berangkat " + waktuBerangkat);
		}
	}


}
