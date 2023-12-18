/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author Mutiara
 */
public abstract class Penilaian {
        String NIM, kode_mk;
    int nilaiTugas, nilaiPrak;
    

    private double nilaiAkhirPrak(){
        return ((nilaiTugas*0.6)+(nilaiPrak*0.4));           
    }
    
    double tampilNA(){
        return nilaiAkhirPrak();
    }

    abstract double nilaiAkhir();
         
}


    
    /*String NIM, kode_mk;
    int nilaiTugas, nilaiPrak;
    //double nilaiAkhir;

    private double nilaiAkhirPrak(){
        return ((nilaiTugas*0.6)+(nilaiPrak*0.4));           
    }
    
    double tampilNA(){
        return nilaiAkhirPrak();
    }
   /* double nilaiAkhir(){
        return 0;
        
    } 
    abstract double nilaiAkhir(); */
         
