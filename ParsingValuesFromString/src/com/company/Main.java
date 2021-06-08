package com.company;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "420";
        System.out.println("number as string = " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " +number);
        numberAsString += 1;
        number += 1;
        System.out.println("number as string = " + numberAsString);
        System.out.println("number = " +number);

        String numberAsString2 = "420.69";
        double doubleNumber = Double.parseDouble(numberAsString2);
        System.out.println("Double number = " + doubleNumber);
    }
}
