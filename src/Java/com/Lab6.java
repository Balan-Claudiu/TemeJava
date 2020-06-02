package Java.com;

import javax.imageio.plugins.tiff.TIFFField;
import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {

        LogicalOperations op = new LogicalOperations();

        List<Integer> myList = new ArrayList();
            myList.add(1);
            myList.add(2);
            myList.add(3);
            myList.add(4);
            myList.add(5);
            myList.add(5,15);

     //       op.printList(myList);

     //       op.addToList(myList, 30);
     //       System.out.println(myList);

     //          op.listaDeLa(myList, 1) ;

     //      op.invers(myList);

            List<String> Lista2 = new ArrayList<>();
            Lista2.add("Audi");
            Lista2.add("Bmw");
            Lista2.add("Volvo");
            Lista2.add("Seat");
            Lista2.add("Dacia");

      //     int a = 3;
      //     String b = "Mercedes";
      //     op.adaugLaLista2(Lista2, a, b);
      //     System.out.println(Lista2);

      //  op.mutaElementul(Lista2, "Skoda");
      //  System.out.println(Lista2);

      //  op.pozitiaSiValoarea(Lista2);


        System.out.println(op.celMaiMareNumar(myList));

    }
}
