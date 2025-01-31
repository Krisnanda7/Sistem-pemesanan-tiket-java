
package uas_pbo;

import java.util.Scanner;
public class Pemesan extends Frame_Penjualan_Tiket {
    private String setNoKursi;
    private String jenisTiket;
    private int hargaSatuan;
    private int jumlahBeli;
    private String judulFilm;
    private String jamTayang;
    private int totalHarga;

    public String getSetNoKursi() {
        return setNoKursi;
    }

    public void setSetNoKursi(String setNoKursi) {
        this.setNoKursi = setNoKursi;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    public void calculatetotalHarga() {
        this.totalHarga = this.jumlahBeli * this.hargaSatuan;
    }
    
    public void tampilkanInfo() {
        System.out.println("Film: " + judulFilm);
        System.out.println("Jam Tayang: " + jamTayang);
        System.out.println("Jenis Tiket: " + jenisTiket);
        System.out.println("Jumlah Tiket: " + jumlahBeli);
        System.out.println("Harga Satuan: " + hargaSatuan);
        System.out.println("Total Harga: " + totalHarga);
    }

}