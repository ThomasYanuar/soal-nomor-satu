/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task002;

/**
 *
 * @author FES
 */
public class Orang {
    static String nama;
    int usia;
    static String status="Status: Tidak ada";

    public Orang(){}
    
    public Orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    
    public void panggilNama(){
        
        System.out.println(nama);
        
    }
    public static void status(){
        System.out.println(status);
    }
    
    void tanggal()
    {
        System.out.println("tanggal sekarang: "+new java.util.Date());
    }

    public void cobaPanggilAngka()
    {
        System.out.println(MainMain.panggilAngka());
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    
    
}
