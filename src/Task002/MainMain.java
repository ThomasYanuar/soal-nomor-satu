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
public class MainMain {
    public static void main(String[] args) {
        Orang o = new Orang();
        Orang o1 = new Orang("Alfa", 1);
//        o.panggilNama();
        Orang o2 = new Orang("Beta", 2);
        System.out.println(Orang.nama);
        System.out.println(o2.nama);
//        o.panggilNama();
//        o.status();
//        o.tanggal();
//        Orang.status();
        panggilAngka();
    }
    public static double panggilAngka(){
        return Math.random();
    }
    public void panggilTinggi(){System.out.println("panggil tinggi: tinggi");}
}
