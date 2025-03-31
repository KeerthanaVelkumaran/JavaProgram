package programPractice;

public class FibanocciSeries {

    public void fibannocciNumbers() {
        int num = 12;
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<num;i++){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }

    }
}

///Single responsibility principle
///handle all the BVA - Boundary value analysis
///return type as list, or Hashmap, boolean or anything as Suitable
///input from main method and output also to be printed in main method
