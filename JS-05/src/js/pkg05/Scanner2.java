/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js.pkg05;

import java.util.Scanner;

/**
 *
 * Created by 21343002_Aini Rizkina
 */
public class Scanner2 {
    public static void main(String argh[]){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.print("Masukan Angka ke-1: ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukan Angka ke-2: ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Angka ke-1: " + angka1);
        System.out.println("Angka ke-2: " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }
}
