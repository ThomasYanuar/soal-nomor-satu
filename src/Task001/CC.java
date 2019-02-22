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
public class CC {
    // method

    public String Biner(int n) {
        String result = "";
        while (n >= 1) {
            if (n % 2 == 0) {
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            n /= 2;
        }
        return result;
    }

    public String Oktal(int n) {
        String temp = "";
        while (n >= 1) {
            temp = String.valueOf(n % 8) + temp;
            n /= 8;
        }
        return temp;
    }

    
    /**
     * coba coba
     * @param n: bilangan desimal bla bla bla
     * @return abal abal
     */
    public String Hexa(int n) {
        String temp = "";
        String[] daftarHexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        while (n >= 1) {
            temp = daftarHexa[n % 16] + temp;//  dicek dulu, dari hasil mod 16 hasilnya brp, 
            n /= 16;
        }
        return temp;
    }

    public int HexToDec(String n) {
        String[] daftarHexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String[] value = n.split(""); // memecah setiap digit ke array
        int result = 0, count = value.length - 1;//length dimulai dari 1, jadinya dikasih - 1, biar mulainya dari 0-4
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < daftarHexa.length; j++) {
                if (value[i].equals(daftarHexa[j])) // dicek dulu dari array itu apakah ada di daftarHexa nggak
                {
                    result += perkalian(j, pemangkatan(16, count));
                }

            }
            count--;
        }
        return result;
    }

    public int BinToDec(String n) {
        String[] value = n.split("");
        int result = 0, count = value.length - 1;//length dimulai dari 1, jadinya dikasih - 1, biar mulainya dari 0-4
        for (int i = 0; i < value.length; i++) {
            result += perkalian(Integer.parseInt(value[i]), pemangkatan(2, count));// fungsi untuk mengubah string ke integer
            count--;
        }

        return result;
    }

    public int OktalToDec(String n) {
        String[] Oktal = {"0", "1", "2", "3", "4", "5", "6", "7"};
        String[] value = n.split(""); // memecah setiap digit ke array
        char[] value2 = n.toCharArray(); // memecah setiap digit ke array
        int result = 0, count = value.length - 1;//length dimulai dari 1, jadinya dikasih - 1, biar mulainya dari 0-4
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < Oktal.length; j++) {
                if (value[i].equals(Oktal[j])) // dicek dulu dari array itu apakah ada di daftarHexa nggak
                {
                    result += perkalian(j, pemangkatan(8, count));
                }

            }
            count--;
        }
        return result;
    }

    public double perkalian(double i1, double i2) {
        double result = 0;
        for (int i = 0; i < Math.abs(i2); i++) {
            result += i1;
        }
        if (i2 < 0) {
            return -result;
        }
        return result;
    }

    public double pemangkatan(double i1, double i2) {
        if (i2 < 0) {
            return 1 / (pemangkatan(i1, Math.abs(i2)));
        }
        if (i2 == 0) {
            return 1;
        } else {
            return perkalian(i1, pemangkatan(i1, i2 - 1));
        }
    }

}
//main

// Mengimpor Scanner ke program
//import java.util.Scanner;
//
//public class DecimalBiner {
//
//    void getNilai(){
//      
//    }
//    void konversi(){
//        
//    }
//    
//    
//    
//}

