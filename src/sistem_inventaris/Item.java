/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_inventaris;

/**
 *
 * @author HUSAIN
 */
import java.util.Date;

public class Item {
    private String kodeItem;
    private String namaItem;
    private String kategoriItem;
    private double hargaSatuan;
    private int jumlahStok;
    private Date tglMasuk;
    private String status;

    // Konstruktor untuk menginisialisasi objek Item
    public Item(String kodeItem, String namaItem, String kategoriItem, double hargaSatuan, int jumlahStok, Date tglMasuk, String status) {
        this.kodeItem = kodeItem;
        this.namaItem = namaItem;
        this.kategoriItem = kategoriItem;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = jumlahStok;
        this.tglMasuk = tglMasuk;
        this.status = status;
    }

    // Getter untuk masing-masing atribut
    public String getKodeItem() {
        return kodeItem;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public String getKategoriItem() {
        return kategoriItem;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public Date getTglMasuk() {
        return tglMasuk;
    }

    public String getStatus() {
        return status;
    }
}
