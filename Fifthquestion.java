package practice;

public class Fifthquestion {

    public static void main(String[] args) {
        int sum=0;
        int i;
        for (i=0; i<100; i++){
            if (i%2==1){
                sum=sum+i;
                System.out.println(sum);
            }
        }System.out.println("The total sum is= " +sum);
    }
}
