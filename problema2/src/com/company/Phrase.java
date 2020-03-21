package com.company;

import java.util.Scanner;

public class Phrase {
    public void Separate(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o fraza de la tastatura: ");
    String a = scanner.nextLine();
        for(int i=0; i<a.length();i++)
            if(a.charAt(i)!=' ')
            System.out.print(a.charAt(i));
        else
                System.out.println();
}}
