package Java.com;

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

    int restulImpartirii = rest (8,3);
        System.out.println(restulImpartirii);

     int fahrenheit = celsius(80);
        System.out.println(fahrenheit);

     float cm = inch(10);
        System.out.println(cm);

    int metripesecunda = ms(100000 , 1,60,60);
        System.out.println(metripesecunda);

    int kmpeora = kmora(75, 1);
        System.out.println(kmpeora);

    int milepeora = mpeora(10);
        System.out.println(milepeora);
    }
    public static void printMyName(){
        System.out.println("Hello \n Claudiu");
    }

    public static int sum( int first,  int second){
        int sum = first+second;
        return sum;
}
    public static int substraction(int first, int second){
        int substraction = first - second;
        return substraction;
    }
    public static int multiplication(int first, int second){
        int multiplication = first*second;
        return multiplication;

    }
    public static int division(int first, int second){
        int division = first / second;
        return division;
    }

    public static int average(int x, int y , int z, int a){
        int average = (x+y+z)/a;
        return average;
    }

    public static int rest(int x, int y){
        int rest= x % y;
        return rest;
    }
    public static int celsius(int f){
        int celsius = (f-32)*5/9;
        return celsius;
    }
    public static float inch(float x){
        float inch = 2.54f * x;
        return inch;
    }

    public static int ms(int a, int b, int c, int d){
        int ms= a / (b*c*d);
        return ms;


    }
    public static int kmora(int a, int b){
        int kmora = a / b;
        return kmora;
    }
    public static int mpeora(int a){
        int mpeora = a * 1609;
        return mpeora;
    }

    }



