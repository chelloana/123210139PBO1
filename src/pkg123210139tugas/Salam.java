/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg123210139tugas;

public abstract class Salam {
    
    String sapa;
    String bayar;

    public void setSapa(String sapa) {
        this.sapa = sapa;
    }

    public void setBayar(String bayar) {
        this.bayar = bayar;
    }
    
    abstract String getSapa();
    abstract String getBayar();
    
}
