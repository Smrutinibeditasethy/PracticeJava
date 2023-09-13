package practice;

public class Question2 {
    public static void main(String[] args) {
        int i;
        int sum=0;
       for (i=2; i<30; i++){
            System.out.println(i);
            i++;
        }
        System.out.print("............................Alternative............................");

        for (i=0; i<30; i++){
            if (i%2==0){

                sum=sum+i;
                System.out.println(sum);
            }
        }

        System.out.println(sum);
    }
}
