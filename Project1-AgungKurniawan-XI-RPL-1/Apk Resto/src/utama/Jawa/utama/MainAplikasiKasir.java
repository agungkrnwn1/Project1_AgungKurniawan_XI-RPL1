/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.agung.aplikasicar.classes.DaftarMenu;
import com.agung.aplikasicar.classes.Bmw;
import com.agunh.aplikasicar.classes.Pesanan;
import com.agung.aplikasicar.classes.Transaksi;
import java.util.InputMismatchException;

import java.util.Scanner;


/**
 *
 * @author agung
 */


public class MainAplikasiKasir {   
    public DaftarMenu daftarMenu;
    
    // Tambahkan 
    public static double PAJAK_PPN = 0.15;
    public static double BIAYA_SERVICE = 0.10;
   
    // End Of Tambahkan
    public static void main(String[] args) {
        // init
        Scanner input = new Scanner(System.in);
        //Tambahkan
        String no_transaksi, nama_pembeli, tanggal, no car = "";
        String transaksi = "", pesan = "", keterangan = "", pesan_ditempat;
        int jumlah_pesanan, no_menu;
        // End Of Tambahkan
        
        MainAplikasiCar app = new MainAplikasiKasir();
        app.generateDaftarMenu();
        
        // Mulai transaksi
        System.out.println("=========== TRANSAKSI ===========");
        do {
        
        // Ambil data transaksi
        System.out.print("No Transaksi :  ");
        no_transaksi = input.next();
        System.out.print("Pemesan : ");
        nama_pemesan = input.next();
        System.out.print("Tanggal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.print("Beli ditempat? [Y/N]");
        Beli_ditempat = input.next();
        
        if (beli_ditempat.equalsIgnoreCase("Y")) {
            System.out.print("Nomor Mobil : ");
            no_mobil = input.next();
        }
        
        // buat transaksi baru
        Transaksi trans = new Transaksi (no_transaksi, nama_pemesan, tanggal,);
        System.out.println("============ PESANAN =============");
        int no_Bmw;
        do {
            //ambil menu berdasarkan nomor urut yang dipilih
            Menu menu_yang_dipilih = app.daftarMenu.pilihMenu();
            
            jumlah_pesanan = (int) app.cekInputNumber("Jumlah : ");
            
            //buat pesanan
            Pesanan pesanan = new Pesanan(menu_yang_dipilih, jumlah_pesanan);
            trans.tambahPesanan(pesanan);
            
            //khusus untuk menu bmw, pesanan mobil langsung diinput juga
            if (menu_yang_dipilih.getKategori().equals("Car")) {
                    int jumlah_mobil = jumlah_pesanan;
                    do {
                        Menu mobil_yang_dipilih = app.daftarMenu.pilihmobil();

                        System.out.print("Spek : [100 - 250] : ");
                        String level = input.next();

                        int jumlah_mobil = 0;
                        do {
                            jumlah_mobil = (int) app.cekInputNumber("Jumlah : ");

                            if (jumlah_kuah > jumlah_ramen) {
                                System.out.println("[Err] Jumlah mobil melebihi jumlah pesanan yang sudah dipesan");
                            } else {
                                break;
                            }
                        } while (jumlah_mobil);

                        Pesanan pesan_mobil = new Pesanan(mobil_yang_dipilih);
            
                        trans.tambahPesanan(pesan_kuah);

                        jumlah_mobil -= jumlah_mobil;
                    } while (jumlah_mobil > 0);
                } else {
                    System.out.print("Keterangan [- jika kosong] : ");
                    keterangan = input.next();
                }

                if (keterangan.equals("-")) {
                    pesanan.setKeterangan(keterangan);
                }
            
           
        trans.setPajak(PAJAK_PPN);
        double ppn = trans.hitungPajak();
        System.out.println("Pajak 10% : \t\t" + ppn);

        double biaya_service = 0;
        if (makan_ditempat.equalsIgnoreCase("Y")) {
            trans.setBiayaService(BIAYA_SERVICE);
            biaya_service = trans.hitungBiayaService();
            System.out.println("Biaya Service 5% : \t" + biaya_service);
        }

        System.out.println("Total : \t\t" + trans.hitungTotalBayar(ppn, biaya_service));

        double kembalian = 0;
        do {
            double uang_bayar = app.cekInputNumber("Uang Bayar: \t\t");

            kembalian = trans.hitungKembalian(uang_bayar);
            if (kembalian < 0) {
                System.out.println("[Err] Uang anda kurang");
            } else {
                System.out.println("Kembalian : \t\t" + kembalian);
                break;
            }
        } while (kembalian < 0);
        
        System.out.println("Lakukan Transaksi Lagi? [Y/N]");
            transaksi_lagi = input.next();
        }while (transaksi_lagi.equalsIgnoreCase("Y"));


        System.out.println("============ TERIMA KASIH ============");
        
            
    }
    
