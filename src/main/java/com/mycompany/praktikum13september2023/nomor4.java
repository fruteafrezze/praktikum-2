/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum13september2023;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor4 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, hasil;
        
        x1= -3.0;
        x2= 5.0;
        y1= 8.0;
        y2= -2.0;
        hasil=(y1-y2)/(x1-x2);
        
        System.out.println("Diketahui (x1,y1) dan (x2,y2) secara berurutan ialah ("+x1+","+x2+") dan ("
                +x2+","+y2+")" );
        System.out.println("dan dicari gradien garis dari 2 titik tersebut dengan rumus (m)= (x1-x2)/(y1-y2)");
        System.out.println("Jadi, hasil dari gradien titik a (x1,y1) ke titik b (x2,y2) adalah "+hasil);
    }
    
}
