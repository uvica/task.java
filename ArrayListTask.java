
public class ArrayListTask {
    public static void main(String[] args) {
        // 1. Write a Java program to calculate the average value of array element.
        // int[] numbers ={1,2,3,4,5};
        // double sum = 0;
        // for(int i=1;i<numbers.length;i++){
        //     sum += numbers[i];

        // }

        // 2. Write a Java program to test if an array contains a specific value.
        int[] numbers ={1,2,3,4,5};
        int searchValue = 3;
        boolean found = false;
        for(int i = 0; i<numbers.length; i++){
            if (numbers[i] == searchValue) {
                found = true;
                break;
            }

        }
        



        
    }
    
}
