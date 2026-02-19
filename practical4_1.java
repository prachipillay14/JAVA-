package PRACTICAL4;

public class practical4_1 {
     public static void main(String[] args) {
        int a[] = {5, 3, 1, 4, 2};
        int n = a.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
 for (int x : a)
            System.out.print(x + " ");
    }

}
