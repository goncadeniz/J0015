package com.goncagul;

import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        int fizik, kimya , bio,mat,turkce;
        double ort;
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  fizik notunuzu girin");
         fizik=sc.nextInt();
        System.out.println("Lütfen kimya   notunuzu girin");
         kimya=sc.nextInt();
        System.out.println("Lütfen bio   notunuzu girin");
         bio=sc.nextInt();
        System.out.println("Lütfen  mat   notunuzu girin");
         mat=sc.nextInt();
        System.out.println("Lütfen   türkçe  notunuzu girin");
         turkce=sc.nextInt();

         ort=(fizik+kimya+bio+mat+turkce)/5;
         if (ort>=60) System.out.println("Geçti");
               System.out.println("Kaldı");

    }
}
