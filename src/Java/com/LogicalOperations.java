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

    public String sn (int zap){
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
        }else{
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

    public String isNumberEven(int parimpar){
        if (parimpar % 2 == 0) {
            return "True";
        }else{
            return "False";
        }
    }

    public String isEligibleToVote(int age){
        if(age > 18){
            return "True";
        }else if(age < 18){
            return "False";
        }else {
            return "ascacacsaca";
        }
    }



}

