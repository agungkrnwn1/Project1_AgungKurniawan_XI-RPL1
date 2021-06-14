/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.aplikasicar racing.classes;

/**
 *
 * @author Agung
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DaftarMenu {
    private final ArrayList<Menu> daftarMenu;
    
    public DaftarMenu() { 
        daftarMenu = new ArrayList<>();
    }
    
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }
    
    public void getMenuByKategori(String kategori) { 
        System.out.println("=========" + kategori + "============");
        
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)){
                System.out.println((i + 1) + ". " + m.getNamaMenu() + "/t" + m.getHarga());
            }
                    
        }
    }
    
    public void tampilDaftarMenu() {
        System.out.println("========= CARRACING ===========");
        getMenuByKategori("Bmw");
        

    public Menu pilihMenu() {
         try{
            Scanner input = new Scanner(System.in);

            System.out.print("Nomor Car yang akan di beli :")

            else{
                //jika yang dipilih adalah mobil Bmw =, maka tidak bisa, user harus memilih lagi
                System.out.println("[Err] Pesan dulu mobil bmw ");
                return pilihMenu();
            }
        }catch (IndexOutOfBoundsException err){
            System.out.println("[Err] Pesan Tidak Tersedia");
            return pilihMenu();
        }catch (InputMismatchException err){
            System.out.println("[Err] Mohon masukkan nomor menu");
            return pilihMenu();
        }
    }

    
