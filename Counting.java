//Ivan Revilla
package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    //User Input
    System.out.println("Type in any sentence");
    Scanner s = new Scanner(System.in);

    String input = s.nextLine();

    //Counts string length
    int stringlength = input.length();
    System.out.println("String length: " + stringlength);

    //String Length without the white spaces
    input = input.replaceAll("\\s", "");
    int stringlength2 = input.replace(" ", "").length();
    System.out.println("String Length w/o white spaces: "+ stringlength2);



    //Code
    int line = 1;

    for (int i =0; i < stringlength2;) // keeps track of where in the sentence it is reading
    {
        for ( int j = 1; j <= line; j++)  //keeps track of where in the line it is at
        {
            if (i >= input.length())
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(input.charAt(i));
            }
            i++; //inrements the position in the sentence in relation to the line it is at
        }
        System.out.println();
        line++;
    }


    //Prints the string
    //for (int j = 0; j < stringlength2; j++)
    {
        //char index = input.charAt(j);
       // System.out.println(index);
    }

    }
}
