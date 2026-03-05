import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give the length of the array to be sorted: ");
        int length = sc.nextInt();
        int [] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("give the member " + i+1 + " of the array: ");
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, length - 1);
        System.out.println("the sorted array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int lowIndex, int highIndex){

        if (lowIndex >=highIndex)
            return;
        int pivot = arr[highIndex];
        int leftPointer = 0;
        int rightPointer = highIndex - 1;
        while(leftPointer < rightPointer    ){
            if (arr[leftPointer] > pivot){
                if (arr[rightPointer] <= pivot){
                    int temp = arr[leftPointer];
                    arr[leftPointer] = arr[rightPointer];
                    arr[rightPointer] = temp;
                    leftPointer++;
                    rightPointer--;
                }
                else
                    rightPointer--;
            }
            else
                leftPointer++;
        }
        arr[highIndex] = arr[leftPointer];
        arr[leftPointer] = pivot;
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }
}