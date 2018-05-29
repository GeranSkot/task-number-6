package com.Aleksey;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Сделаем проверку на создание треугольника");
        System.out.println("Пожалуйста, введите сторону a: ");
        Scanner A = new Scanner(System.in);
	    int a = A.nextInt();
        System.out.println("Пожалуйста, введите сторону b: ");
	    Scanner B = new Scanner(System.in);
	    int b = B.nextInt();
        System.out.println("Пожалуйста, введите сторону c: ");
	    Scanner C = new Scanner(System.in);
	    int c = C.nextInt();
    if ((a < b+c) && (b < a+c) && (c < a+b )) {
        System.out.println("Треугольник существует");
    }else{
        System.out.println("Треугольник не существует");}*/
        triangle();
    }

    public static void triangle(){
        System.out.println("lets check this out for right triangle");
        System.out.print("enter pls side a: ");
        Scanner A = new Scanner(System.in);
        float a = A.nextFloat();
        System.out.print("enter pls side b: ");
        Scanner B = new Scanner(System.in);
        float b = B.nextFloat();
        System.out.print("one more, enter pls side c: ");
        Scanner C = new Scanner(System.in);
        float c = C.nextFloat();
        //float d = c*c;
        if ((c*c) == (a*a) + (b*b) || (a*a) == (c*c)+ (b*b) || (b*b) == (a*a) + (c*c) ) {
            System.out.println("right triangle is exist, roooight");
        }else{
            System.out.println("mission failed, we gonna make next time");}
    }
}
