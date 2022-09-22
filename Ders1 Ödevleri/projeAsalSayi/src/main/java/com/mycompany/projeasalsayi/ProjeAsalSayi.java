
package com.mycompany.projeasalsayi;

public class ProjeAsalSayi {

    public static void main(String[] args) {
        int number=1;
        boolean isPrime=true;
        if (number==1) {
            System.out.println("Sayi asal değil");
            return;
            
        }
        if (number<1) {
            System.out.println("Geçersiz Sayı");
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                isPrime=false;
            }
            
        }
        if (isPrime) {
            System.out.println("Sayı Asal");
        }
        else {
            System.out.println("Sayı Asal Değil");
        }
    }
}
