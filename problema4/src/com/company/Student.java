package com.company;
import java.util.Scanner;

public class Student {
    String c;
    int nr=0;

    public void CompareStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele elevului: ");
        c = scanner.nextLine();

    }
    public void FindName() {
        int found=1;
        System.out.println("Incercati sa ghiciti numele introdus anterior: ");
        if (found != 0)
        {      Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            nr++;
            found = c.compareTo(name);
            if (found == 0) {
                System.out.println("Gasit a " + nr + " oara.");

            }
            else
            { System.out.println("Mai incearca!");
                FindName();}

        }
    }}
