/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum13september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor5 {
    public static void main(String[] args) {
        /*
        Diket: rumus fisika percepatan 
        St= Vo*t+0.5*a*t*t
        */
        int v0, t, a;
        double hasil;
        
        v0=10;
        a=20;
        t=2;
        hasil= ((v0*t)+(0.5*a*t*t));
        
        System.out.println("Diketahui jika kecepatan awal= "+v0+", percepatan= "+a+", dan waktu= "+t+",");
        System.out.println("dan dicari jarak tempuh dengan rumus St = V0 t + ½ a t^2 ");
        System.out.println("Maka, hasilnya adalah "+hasil);
        
        
    }
    
}
