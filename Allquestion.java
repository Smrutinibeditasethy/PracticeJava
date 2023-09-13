package practice;

public class Allquestion {
    public static void main(String[] args) {
        int i=5;
       int[] oddnumarray= new int[6];
       oddnumarray[0]= 1;
       oddnumarray[1]= 3;
       oddnumarray[2]= 5;
       oddnumarray[3]= 7;
       oddnumarray[4]= 9;
       oddnumarray[5]= 11;

      /* for (i=0; i<6;i++){
           System.out.println(oddnumarray[i]);
       }
       for (i=5; i>=0; i--){
           System.out.println(oddnumarray[i]);
       }*/

       /*do {
           System.out.println(oddnumarray[i]);
           i++;
       }
       while (i<6);*/

       while (i>=0){
           System.out.println(oddnumarray[i]);
           i--;
       }



    }
}
