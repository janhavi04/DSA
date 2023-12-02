import java.util.ArrayList;
import java.util.Scanner;

class mergeSort{
    public static void mergesort(int[] arr, int low, int high){
            //basecase
            if(low>=high)
                return;

            int mid = (low+high)/2;

            //left half
            mergesort(arr, low, mid);
            //right half
            mergesort(arr, mid+1, high);

            merge(arr, low,mid,high);

    }

    public static void merge(int[] arr, int low, int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;


        while(left<=mid && right <=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        //copying left-out elements from left half

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        //copying left-out elements from right half
        while(right<=high){
            temp.add(arr[right]);
            right++;

        }

        //inserting from temp array to original array
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
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
        
        mergesort(arr,0, n -1);


        //After sorting:
        System.out.println("After sorting the array: ");
        for(int a:arr){
            System.out.print(a +" ");
        }
        

       
    }
}