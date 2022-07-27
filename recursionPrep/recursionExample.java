package recursionPrep;

public class recursionExample {
    public static void printRecursive(int i, int[] arr) {
        if (i == arr.length)
            return;
        // if (arr.length == )
        printRecursive(i + 1, arr);
        System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        printRecursive(0, arr);

    }
}
