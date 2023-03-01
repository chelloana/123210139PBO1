/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210139tugas;

public class ppn implements ppni{
    int ppnv;

    public ppn(int ppnv) {
        this.ppnv = ppnv;
    }
    
    Shop s = new Shop();

    @Override
    public double hitungppn() {
        return ppnv;
    }
    
    
    
}
