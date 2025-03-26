package MergeSort;

public class Merge_sort {

    public static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] lefta = new int[n1];
        int[] righta = new int[n2];
        for (int i = 0; i < n1; i++) {
            lefta[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            righta[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (lefta[i] < righta[j]) {
                a[k] = lefta[i];
                i++;
            } else {
                a[k] = righta[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = lefta[i];
            k++;
            i++;
        }
        while (j < n2) {
            a[k] = righta[j];
            j++;
            k++;
        }

    }

    public static void mergesort(int[] a, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(a, left, mid);
            mergesort(a, mid + 1, right);
            merge(a, left, mid, right);

        }

    }

    public static void main(String[] args) {
        int[] a = { 12, 11, 13, 5, 6, 7 };
        System.out.println("before the sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        mergesort(a, 0, a.length - 1);
        System.out.println("after the sort : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
