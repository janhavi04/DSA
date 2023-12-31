import java.util.Scanner;

/**
 * bubbleSort
 */
public class bubbleSort {

    public static void recBubble_Sort(int[] arr, int n){
          
                if(n==1)
                return ;
                for(int j = 0 ; j<=n-2 ; j++){
                    if(arr[j]>arr[j+1])
                        {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                       
                }
               
            }
            recBubble_Sort(arr, n-1);
        }  
        
    public static void bubble_Sort(int[] arr, int n){
            for(int i = n-1 ; i>=0;i--){
                int didSwap =0;
                for(int j = 0 ; j<=i-1 ; j++){
                    if(arr[j]>arr[j+1])
                        {
                        int temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                        didSwap =1;
                }
               
            }
             if(didSwap ==0){ //if the array is already sorted it will break out of the loop 
                              //This occurs in best case scenario
                    break;
                }
                System.out.println("RUNS");
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
        int [] arr = {1,24,78,96,2,5};
        int n= arr.length;
        System.out.println("Original array: ");
        for(int a:arr){
            System.out.print(a +" ");
        }
        System.out.println();

        //bubble_Sort(arr, n);
        recBubble_Sort(arr, n);


         //After sorting:
        System.out.println("After sorting the array: ");
        for(int a:arr){
            System.out.print(a +" ");
        }

       
    }
}
    
