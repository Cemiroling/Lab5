package com.company;

import java.util.Scanner;

import static com.company.Amount.CombinationAmount;
import static com.company.Index.ShowIndex;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Printable printer = s->{System.out.println(s);};

        int number;
        do {
            printer.print("Enter a number:");
            while (!in.hasNextInt()) {
                printer.print("That not a number!");
                in.next();
            }
            number = in.nextInt();

            int index;
            long combinations;

            if ((index = ShowIndex(number)) == -1)
                printer.print("Number don't found in array");
            else printer.print("Index in array:" + index + '\n');

            if ((combinations = CombinationAmount(number)) == -1)
                printer.print("Number don't have combinations");
            else printer.print("Amount of combination:" + combinations + '\n');
        }while (true);
    }

    interface Printable{
        void print(String s);
    }
}