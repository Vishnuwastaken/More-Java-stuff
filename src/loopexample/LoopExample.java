package loopexample;


public class LoopExample {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i<numbers.length){
            System.out.println(numbers[i] + " ");
            i++;
        }
        System.out.println();
        int j=0;
        do {
            System.out.println(numbers[j] + " ");
            j++;
        } while (j<numbers.length);
        System.out.println();
    }
}

