package ooparray;

public class OopArray {
    public static void main(String[] args) {
        int [] numbers = {15,10,99,125,3,1,322,1024,97,2};
        for (int i=0; i<10; i++){
            System.out.println(numbers[i] + " ");
        }
        int sum=0;
        for (int i=1; i<10; i++){
            sum+= numbers[i];
        }
        System.out.println();
        System.out.println("Sum is: " + sum);
        int max = numbers[0];
        int min = numbers[0];
        for (int i=0; i<10; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            if ( numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        float avg = sum/10f;
        System.out.println("The avg is: " + avg);

    }
}
