/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */


package org.example;

import java.util.Scanner;

public class App
{
    public static double ceilMoney(double raw){
        return Math.ceil(raw*100)/100.0;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double amt, tax, taxamt;
        String state, county;
        System.out.print( "What is the order amount? " );
        amt = input.nextDouble();
        input.nextLine();
        System.out.print( "What state do you live in? " );
        state = input.nextLine();

        if(state.equalsIgnoreCase("wisconsin")){
            tax= 0.05;

            System.out.print( "What county do you live in? " );
            county = input.nextLine();

            if(county.equalsIgnoreCase("eau claire")) {
                tax+= 0.005;
            }
            else if (county.equalsIgnoreCase("Dunn")){
                tax+= 0.004;
            }
        }
        else if (state.equalsIgnoreCase("illinois")){
            tax= 0.08;
        }
        else {
            tax=0;
        }
        taxamt= ceilMoney(amt*tax);
        amt +=taxamt;
        System.out.print((tax>0 ? ("The tax is $"+taxamt+".\n"):"") + String.format("The total is $%.2f.",amt));

    }

}
