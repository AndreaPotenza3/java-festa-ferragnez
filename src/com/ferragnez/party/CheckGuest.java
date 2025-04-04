package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual e' il tuo nome?");

        String name = sc.nextLine().toLowerCase().trim();

        sc.close();
        
        // for (int i = 0; i < guests.length; i++) {
            
        //     String listName = guests[i].toLowerCase().trim();

        //     if(name.equals(listName)) {
        //         System.out.println("Il tuo nome e' nella lista");

        //         break;

        //     } else {
        //         System.out.println("Il tuo nome non e' nella lista");
        //     }

        // }

        boolean isNameFound = false;
        int i = 0;

        while(!isNameFound && i < guests.length) {

            String listName = guests[i].toLowerCase().trim();

            if(name.equals(listName)) {
                isNameFound = true;
            }else {
                i++;
            }
        }

        if(isNameFound){
            System.out.println("Il tuo nome e' nella lista");
        } else {
            System.out.println("Il tuo nome non e' nella lista");
        }
    }


}
