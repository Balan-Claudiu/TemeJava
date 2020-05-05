package Java.com;

public class Lab3 {

    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

        int x = 2;
        int y = 4;
        int higher = op.getHigherNumber(x, y);
        System.out.println(higher);


        String text1 = "FastTrackIt";
        String text2 = "FastTrackIt";
        System.out.println(op.checkTest(text1, text2));

        String text3 = "FastTrackIt";
        int a = 2;
        System.out.println(op.textNumber(text3, a));

        int zap = 9;
        System.out.println(op.sn(zap));

        int b = 7;
        System.out.println(op.ex7(b));

        int caseNumber = 10;
        System.out.println(op.swcase(caseNumber));

        int parimpar = 542;
        System.out.println(op.isNumberEven(parimpar));

        int age = 15;
        System.out.println(op.isEligibleToVote(age));

        int c = 10;
        int d = 20;
        int e = 30;
        System.out.println(op.maiMare(c, d, e));

    }
}





