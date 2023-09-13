package practice;

public class Sixthquestion {
    public static void main(String[] args) {
        int[] array= {5,3,5,2,5,99,71,77,99,101,9,45,50};
        int sum=0;

        for (int i=0; i< array.length; i++){
            if (array[i]<77){
                sum=sum+array[i];
            }
        }
        System.out.println("The total sum is = " +sum);
        System.out.println(6+6);
    }
}
