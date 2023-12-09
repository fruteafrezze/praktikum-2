/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum13september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor3 {
    public static void main(String[] args) {
        double phi, keliling, luas;
        int jariJari;
        
        phi=3.14;
        jariJari= 25;
        keliling= 2*phi*jariJari;
        luas=phi*jariJari*jariJari;
        
        System.out.println("Diketahui bahwa jari jari lingkaran sebesar "+jariJari+" dan phi sebesar "+phi);
        System.out.println("Nilai keliling dan luas lingkaran tersebut adalah sebagai berikut:");
        System.out.println("keliling lingkaran = "+keliling);
        System.out.println("luas lingkaran = "+luas);
    }
}
