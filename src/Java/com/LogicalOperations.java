package Java.com;

public class LogicalOperations {

    public int getHigherNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String checkTest(String text1, String text2) {
        if (text1.equals(text2)) {
            return "Learning text comparation";
        } else {
            return "Got to try some more";
        }
    }

    public String textNumber(String text3, int a) {
        if (text3.equals("FastTrackIt") && a <= 3) {
            return text3 + a;
        } else if (!text3.equals("FastTrackIt") && a >= 4) {
            return a + text3;
        } else {
            return "Asta este";
        }
    }

    public String sn(int zap) {
        if (zap > 8 || zap == 6) {
            return "The amount of snow this winter was(cm):" + zap;
        } else {
            return "The forecast snow is(cm):" + zap;
        }
    }

    public String ex7(int b) {
        if (b > 3 && b != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (b == 4) {
            return "The number is equal to 4";
        } else if (b < 3) {
            return "The number is lower than 3";
        } else {
            return "aaa";
        }
    }

    public String swcase(int caseNumber) {
        switch (caseNumber) {
            case 1:
                return "ex1";

            case 5:
                return "ex2";

            case 10:
                return "ex3";

            default:
                return "Nici un raspuns";
        }
    }

    public String isNumberEven(int parimpar) {
        if (parimpar % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }

    public String isEligibleToVote(int age) {
        if (age > 18) {
            return "True";
        } else if (age < 18) {
            return "False";
        } else {
            return "ascacacsaca";
        }
    }

    public int maiMare(int c, int d, int e) {
        if (c > d && c > e) {
            return c;
        } else if (d > c && d > e) {
            return d;
        } else {
            return e;
        }

    }
//      tema For


    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printUpToHundred(int number2, int number3) {
        for (int i = number2; i > number3; i--) {
            System.out.println(i);
        }
    }

    public void fromTo(int number4, int number5){
        for (int i = number4; i <= number5; i++){
            System.out.println(i);
        }
    }

    public void maiMareCrescator(int number6, int number7){
        if(number6 < number7){
            for ( int i = number6; i <= number7; i++){
                System.out.println(i);
            }
        }else{
            for ( int j = number6; j > number7; j--){
                System.out.println(j);
            }
        }
    }

    public void par(int number8){
        for( int i = number8; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void impar(int number9){
        for (int i = number9; i < 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public void suma(int sum){
        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void media(int sum){
        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }

        float average = sum / 100F;
        System.out.println(sum);
        System.out.println(average);
    }

    public void asterisc(int number10){
        for (int i = number10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

// tema While

    public void panaLaOsuta(int a) {
        while (a < 100) {
            a++;
            System.out.println(a);
        }
    }

    public void panaLaMinusOSuta(int b) {
        while( b > -100){
            b--;
            System.out.println(b);
        }
    }

    public void deLaPanaLa(int c, int d){
        while( c < d){
            c++;
            System.out.println(c);
        }
    }

    public void deLaCelMaiMic(int e, int f){
        if(e < 25){
            while( e < f){
                e++;
                System.out.println(e);
            }
        }else{
            while(f < e){
                f++;
                System.out.println(f);
            }
        }
    }

    public void parOsuta(int g){
        while( g <= 100){
            if( g % 2 == 0)
                System.out.println(g);
            g++;
        }
    }

    public void imparOSuta(int h){
        while(h <= 100){
            if( h % 2 != 0)
                System.out.println(h);
            h++;
        }
    }

    public void intCount(int i, int sum){
        while( i <= 8899){
            sum = sum + i;
            i++;
        }
        float intCountAverage = sum / 8789F;
        System.out.println(sum);
        System.out.println(intCountAverage);

    }

    public int sumaMediaSapte(int j, int k , int sum){
        while( j <= k){
            j++;
            if( j % 7 == 0 ){
                sum = sum +j;
            }
        }
        return sum / 14;
    }

    public void fibonacci(int sum, int x1, int x2){
        while(sum < 18){
            int x3 = x2 + x1;
            System.out.println(x3);
            x1 = x2;
            x2 = x3;
            sum++;

        }
    }

    public void cozaLozaWoza(int l){
        while (l <= 110) {
            if (l % 11 == 0) {
                System.out.println(l);
            } else if (l % 3 == 0 && l % 5 == 0 && l % 7 == 0) {
                System.out.print("CozaLozaWoza");
            } else if (l % 5 == 0 && l % 7 == 0) {
                System.out.print("WozaLoza");
            } else if (l % 3 == 0 && l % 7 == 0) {
                System.out.print("CozaWoza");
            } else if (l % 3 == 0 && l % 5 == 0) {
                System.out.print("CozaLoza");
            }  else if (l % 7 == 0) {
                System.out.print("woza");
            } else if (l % 5 == 0) {
                System.out.print("Loza");
            } else if (l % 3 == 0) {
                System.out.print("Coza");
            }else{
                System.out.print(l);
            }
            l++;
        }
    }


}

