import java.util.Scanner;

class insertionSort{
    public static void insertion_Sort(int[] arr,int n){
            for(int i =0 ; i<=n-1; i++){
                int j = i;
                while(j>0 && arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;  
                }
            }
    System.out.println("After sorting the array: ");
            for(int a:arr){
                System.out.print(a +" ");
            }
    };
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
        insertion_Sort(arr, n);

       
    }
}