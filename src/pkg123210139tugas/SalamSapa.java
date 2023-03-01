/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210139tugas;

import java.util.Scanner;

public class SalamSapa extends Salam {

    Scanner scn = new Scanner(System.in);
    
    @Override
    String getSapa() {
        System.out.print("Terimakasih, Selamat Datang Kembali ");
        return null;
    }

    @Override
    String getBayar() {
        System.out.print("Jenis Pembayaran : ");
        bayar = scn.nextLine();
        //System.out.print("Terimakasih, Selamat Datang Kembali ");
        return null;
    }
    
}
