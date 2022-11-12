import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        double discount = 0;
        double cost = 0;
        double payment = 0;
       
        Scanner dat = new Scanner(System.in);
        System.out.print("Distance by km?= ");
        int km = dat.nextInt();
        while (km <= 0) {
            System.out.print("Incorrect entry!");
            System.out.print("Distance by km?= ");
            km = dat.nextInt();
        }

        System.out.print("Age?= ");
        int age = dat.nextInt();
        while (age <= 0) {
            System.out.print("Incorrect entry!");
            System.out.print("Age?= ");
            age = dat.nextInt();
        }


        System.out.print("Your trip --->> OneWay (1), RoundTrip (2) ?= ");
        int trip = dat.nextInt();
        while (trip != 1 && trip != 2) {
            System.out.print("Incorrect entry!");
            System.out.print("Your trip --->> OneWay (1), RoundTrip (2) ?= ");
            trip = dat.nextInt();
        }

        if (trip == 1) {
            cost = 0.10 * km;
            if (age < 12) {
                discount = cost * 0.50;
                payment = cost - discount;
            } else if (age >= 12 && age < 24) {
                discount = cost * 0.10;
                payment = cost - discount;
            } else if (age >= 65) {
                discount = cost * 0.30;
                payment = cost - discount;
            } else {
               discount = cost * 0;
               payment = cost - discount;
            } 
        } else if (trip == 2){
             cost = (0.10 * km*2)*0.80;
            if (age < 12) {
                 discount = cost * 0.50;
                 payment = cost - discount;
            } else if (age >= 12 && age < 24) {
                 discount = cost * 0.10;
                 payment = cost - discount;
            } else if (age >= 65) {
                 discount = cost * 0.30;
                 payment = cost - discount;
            } else {
                 discount = cost * 0;
                 payment = cost - discount;
            }
        }
        System.out.println("cost = " + cost);
        System.out.println("discount = " + discount);
        System.out.println("payment = " + payment);

    }
}
