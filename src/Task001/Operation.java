/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task001;

/**
 *
 * @author FES
 */
public class Operation {

    /**
     * method untuk menghitung faktorial dari num, dengan rumus:<p>n! = 1 x 2 x 3 x ... x n<p>Sebagai contoh:<p>5! =  
     * @param num nilai yang akan dihitung oleh method dengan nilai Double
     * @return hasil perhitungan faktorial dengan tipedata Double
     */
    public double faktorial(double num){
        if (num<0) {
            System.out.println("bilangan tidak benar");
            return 0;
        }
        if(num==0||num==1)return 1;
        return perkalian(num, faktorial(num-1));
    }
    
    /**'
     * method untuk menghitung permutasi dari num1 dan num2
     * @param num1 bilangan pertama
     * @param num2 bilangan kedua
     * @return hasil perhitungan permutasi dengan tipedata Double
     */
    public double permutasi(double num1, double num2){
        if (num1<num2||(num1<0&&num2<0)) {
            System.out.println("bilangan tidak benar");
            return 0;
        }
        return faktorial(num1)/faktorial(num1-num2);
    }
    
    /**
     * method untuk menghitung kombinasi dari num1 dan num2
     * @param num1 bilangan pertama
     * @param num2 bilangan kedua
     * @return hasil perhitungan kombinasi dengan tipedata Double
     */
    public double kombinasi(double num1, double num2){
        if (num1<num2||(num1<0&&num2<0)) {
            System.out.println("bilangan tidak benar");
            return 0;
        }
        return permutasi(num1,num2)/faktorial(num2);
    }
    
    /**
     * method untuk menghitung perkalian antara num1 dikali num2
     * @param num1 bilangan yang akan dikalikan
     * @param num2 bilangan pengali
     * @return hasil perhitungan perkalian dengan tipedata Double
     */
    public double perkalian(double num1, double num2) {
        double result=0;
        for (int i = 0; i < Math.abs(num2); i++) result+=num1;
        if (num2<0) return -result;
        return result;	
    }
    
    /**
     * method untuk menghitung pemangkatan antara num1 dipangkatkan dengan num2
     * @param num1 bilangan yang akan dipangkatkan
     * @param num2 bilangan pemangkat
     * @return hasil perhitungan pemangkatan dengan tipedata Double
     */
    public double pemangkatan(double num1,double num2){
        if (num2<0){
            return 1/(pemangkatan(num1,Math.abs(num2)));
        }
        if(num2==0)return 1;
        else return perkalian(num1, pemangkatan(num1,num2-1));
    }
}
