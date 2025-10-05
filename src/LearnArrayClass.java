import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

        /*
            Array class is generally used to manipulate the arrays(not array list)
         */

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = Arrays.binarySearch(numbers, 4);
//        /*
//        It will give index of the given number in the array
//         */
//
//        System.out.println("The index of element 4 in the array is: " + index);

        int[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 13, 66};

        Arrays.sort(numbers);
        /*
            It sorts the given array
         */

        Arrays.fill(numbers, 10);
        /*
            It will insert the given value to every element of the array
         */

        for(int ele : numbers){
            System.out.print(ele + " ");
        }
    }
}
