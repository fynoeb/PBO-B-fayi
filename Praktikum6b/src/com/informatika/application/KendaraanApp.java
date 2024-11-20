package com.informatika.application;

import com.informatika.data.*;

public class KendaraanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobil avanza = new Mobil("Toyota", "Avanza", 2021);
		avanza.tampilkanInfo();
		avanza.nyalakanMesin();
		System.out.println("Jenis bahan bakar : "+ avanza.jenisBahanBakar());
		avanza.infoKonsumsi();
		avanza.fiturMobil();
		
		Bus busPariwisata = new Bus("Marcedes-Benz", "Bus Pariwisata", 2019);
		busPariwisata.tampilkanInfo();
		busPariwisata.nyalakanMesin();
		System.out.println("Jenis bahan bakar : "+ busPariwisata.jenisBahanBakar());
		busPariwisata.infoKonsumsi();
		System.out.println("Kapasitas Penumpang: "+ busPariwisata.kapasitasPenumpang());
		busPariwisata.fiturBus();
		
		Bus.JadwalPerjalanan jadwalBus = busPariwisata.new JadwalPerjalanan("Jakarta-Bandung", "08:00");
		jadwalBus.tampilkanJadwal();

	}

}
