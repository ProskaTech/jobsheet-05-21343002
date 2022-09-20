/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class BufferedReadder1 {
    public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    
    String a, b;
    float angka1, angka2, jumlah;
    System.out.println("Program Penjumlahan Dua Buah Bilangan");
     
    try {
        System.out.print("Masukkan angka pertama : ");
        a = dataIn.readLine();
        angka1 = Float.parseFloat(a); //konversi dari String ke float
        
        System.out.print("Masukan angka kedua : ");
        b = dataIn.readLine();
        angka2 = Float.parseFloat(b); //konversi dari String ke float
        
        jumlah = angka1 +angka2;
        System.out.println("Jumlah : " + jumlah);
    }
    
    catch (IOException e){
        System.out.println("gagal membaca keyboard");
    }
    }
}
