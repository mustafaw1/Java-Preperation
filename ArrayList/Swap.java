public class Swap {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index1 = 8;
        int index2 = 9;
        swapIndex(arr, index1, index2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    public static void swapIndex(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
