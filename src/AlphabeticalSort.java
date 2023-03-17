import java.util.ArrayList;

public class AlphabeticalSort {
    public static void main(String[] args) {
        String[] arr = {"hamza", "sherif", "clara", "massil", "leo"};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
