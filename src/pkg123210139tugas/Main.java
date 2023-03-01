/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg123210139tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int jumlah = 0;
        
        String namaPelanggan = null;
        
        Scanner scn = new Scanner(System.in);
        
        Salam s = new SalamSapa();
            
        s.getBayar();
        System.out.print("Nama Pelanggan : ");
        namaPelanggan = scn.nextLine(); 
        
        try{
            System.out.print("Jumlah : ");
            jumlah = scn.nextInt();
        }catch(Exception e){
            System.out.println("Errornya " + e.getMessage());
        }finally{
            System.out.println("-----Nota-----");
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("Jumlah Barang : " + jumlah);
            
            Shop k = new Topi();
            ppn p = new ppn(1500);
        
            System.out.print("Nama Produk : ");
            k.jenis();

            System.out.println("Harga sebelum pajak : " + k.totalharga());
            System.out.println("Harga setelah pajak : " + (k.totalharga()*jumlah + p.hitungppn()));
        
            s.getSapa();
            System.out.println(namaPelanggan);
        }
        
    }
    
}
