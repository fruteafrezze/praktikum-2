/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum13september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor6 {
    public static void main(String[] args) {
           
        double r1, r2, r3 ;
        double seri, paralel;
        
        r1= 4.0;
        r2= 32.0;
        r3= 40.0;
        
        seri=r1+r2+r3;
        paralel= 1/((1/r1)+(1/r2)+(1/r3));
                
        System.out.println("Diketahui bahwa dalam rangkaian listrik, terdapat resistor yang disusun");
        System.out.println("secara seri dan paralel. Jika masing-masing resistor memiliki besaran sebagai berikut");
        System.out.println("R1= "+r1);
        System.out.println("R2= "+r2);
        System.out.println("R3= "+r3);
        System.out.println("Hasil dari hambatan total jika rangkaian disusun secara seri adalah "+seri);
        System.out.println("Hasil dari hambatan total jika rangkaian disusun secara paralel adalah "+paralel);
        
    }
    
}
