/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210139tugas;

public class Shop {
   String nama;
   double custom = 30000;
   private double harga;
   
   private double hitungtotal(double custom, double harga){
       return custom + harga;
   }
   
   void setharga(double harga) {
       this.harga = harga;
   }
   
   double totalharga(){
       return hitungtotal (harga, custom);
   }
   
   void jenis(){
        System.out.println(nama);
   }

}
