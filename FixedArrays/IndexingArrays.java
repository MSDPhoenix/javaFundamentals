public class IndexingArrays {
    public static void main(String[] args){
        int[] numbers = {2, 4, 12, 7, 23, 44, 5, 9, 7, 11, 10, 3};

        // Use the numbers array to print the following sums: 9, 56, 24, 100

        System.out.println(numbers[0] + numbers[3]);
        System.out.println(numbers[2] + numbers[5]);
        System.out.println(numbers[4] + numbers[numbers.length-1] - numbers[0]);
        System.out.println(numbers[5] + numbers[5] + numbers[2]);
    }
}
