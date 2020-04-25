package com.company;

public class Lab2 {

    public static void main(String[] args) {
    printMyName();

    int adunare = sum(8,2);
        System.out.println(adunare);

    int scadere = substraction(10,3);
        System.out.println(scadere);

    int inmultire = multiplication(9,5);
        System.out.println(inmultire);

    int impartire = division(55,11);
        System.out.println(impartire);

    int media = average(10, 15, 20 ,3);
        System.out.println(media);

    }
    public static void printMyName(){
        System.out.println("Hello \n Claudiu");
    }

    public static int sum( int x,  int y){
        int sum = x+y;
        return sum;
}
    public static int substraction(int x, int y){
        int substraction = x-y;
        return substraction;
    }
    public static int multiplication(int x, int y){
        int multiplication = x*y;
        return multiplication;

    }
    public static int division(int x, int y){
        int division = x / y;
        return division;
    }

    public static int average(int x, int y , int z, int a){
        int average = (x+y+z)/a;
        return average;
    }

    }



