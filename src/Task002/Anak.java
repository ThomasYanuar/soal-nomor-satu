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
public class Anak extends Orang{
    public static void main(String[] args) {
        Orang o =new Orang();
        o.cobaPanggilAngka();
        Orang.status();
        o.tanggal();
    }
    void panggilSaya()
    {
        System.out.println("panggil saya: saya");
    }
    
    protected void sayaAnak(){
        System.out.println("saya anak");
    }
}
