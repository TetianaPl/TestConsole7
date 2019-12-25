package com.epam.java.homework1;
import java.util.Scanner;

public class WriteEpam {
    public static void main(String[] args) {

            System.out.println("**** ****     *     *     *");
            System.out.println("*    *  *    * *    * * * *");
            System.out.println("**   ****   *   *   *  *  *");
            System.out.println("*    *     *******  *     *");
            System.out.println("**** *    *       * *     *");
            System.out.println();

            Scanner read = new Scanner(System.in);
            System.out.print("Type symbol: ");
            String s = read.nextLine();
            System.out.println();

            System.out.println(s + "  " + s + " " + s + s + s + s + " " + s + "    " + s + "      " + s + s);
            System.out.println(s + "  " + s + " " + s + "    " + s + "    " + s + "     " + s + "  " + s);
            System.out.println(s + s + s + s + " " + s + s + s + "  " + s + "    " + s + "    " + s + "    " + s);
            System.out.println(s + "  " + s + " " + s + "    " + s + "  " + s + " " + s + "  " + s + "  " + s + "  " + s);
            System.out.println(s + "  " + s + " " + s + s + s + s + " " + s + s + s + s + " " + s + s + s + s + "   " + s + s);
    }
}

