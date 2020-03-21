package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de la tastatura: ");
        String a = scanner.nextLine();
        System.out.println("Introduceti un caracter de la tastatura: ");
        char litera = scanner.next().charAt(0);
        int n=0;
        for(int i=0;i<a.length();i++)
        {if(a.charAt(i)==litera) n++;}
        System.out.println("Caracterul "+litera+" apare de "+n+" ori");
    }
}
