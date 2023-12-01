
import java.util.Scanner;

/**
 * selectionSort
 */
public class selectionSort {
    public static void selection_Sort(int[] arr , int n ){
         //Sorting
        for(int i =0;i<n;i++){
            int min = i;
            for(int j = i+1 ; j<n;j++){
               if(arr[j]<arr[min])
                min = j;

                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        

        //After sorting:
        System.out.println("After sorting the array: ");
        for(int a:arr){
            System.out.print(a +" ");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        int n;
        System.out.println("Size of an array:");
        n = sc.nextInt();
        int[] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        } */
        int [] arr = {1,5,24,78,96,2};
        int n= arr.length;
        System.out.println("Original array: ");
        for(int a:arr){
            System.out.print(a +" ");
        }
        System.out.println();
        selection_Sort(arr, n);

       
    }
}