package com.Aleksey;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        triangle();
    }

    public static void triangle(){
        System.out.println("lets check this out for right triangle");
        System.out.print("enter pls side a: ");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        System.out.print("enter pls side b: ");
        float b = scan.nextFloat();
        System.out.print("one more, enter pls side c: ");
        float c = scan.nextFloat();
        if ((c*c) == (a*a) + (b*b) || (a*a) == (c*c)+ (b*b) || (b*b) == (a*a) + (c*c) ) {
            System.out.println("right triangle is exist ");
        }else{
            System.out.println("mission failed, we gonna make next time");}
    }
}
