class missingElements{
    // public static int function(int [] arr , int n){
    //     for(int i = 1 ; i <=n;i++){
    //             int flag = 0;
    //         for(int j = 0 ; j<n-1;j++){
    //             if(arr[j] == i){
    //                 flag =1;
    //                 break;
    //             }
    //         }
    //         if(flag == 0){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    public static int func2(int[] arr, int n){
        int xor1 = 0 , xor2 = 0;

        for(int i =1 ; i<=n ; i++){
            
        }

        for(int i =0 ; i<n ; i++){
         xor2 = xor2^arr[i];
         xor1 = xor1^(i+1);
         }
         xor1 = xor1^n;
    
        return (xor1^xor2);

    }
    public static void main(String[] args){
        int arr [] = {0,1};
        int n = arr.length;
        
        int ans = func2(arr, n);
        System.out.println("Missing Element: " + ans);
    }
}