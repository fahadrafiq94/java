import java.util.Scanner;

class SelectionSort {
    void selectionsort(int arr[], int n) {
        // Selection start with index zero and intialize cuurent index with start value
        // and repeat
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;// searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the length od the array:");
        int n = inp.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the" + i + "index Value: ");
            a[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Unsorted Array=" + a[i]);
        }
        SelectionSort obj = new SelectionSort();
        obj.selectionsort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.println("Sorted Array=" + a[i]);
        }

    }
}
