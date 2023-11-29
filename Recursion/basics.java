class basics{
    //  static int count = 0;
    // static void  fun(){
    //     if(count == 3)
    //         return;
    //     System.out.println(count);
    //     count++;
    //     fun();

    // }
    // static void printNtimes(int n){
    //     // Write your code here.
    //     int count = 0;
    //     if(count >= n)
    //         return;
    //     System.out.print("Coding Ninja ");
    //     count++;
    //     printNtimes(n);
    // }
    public static void main(String[] args){
        //fun();

        //printNtimes(10);
       // System.out.print(printNos(5));
       System.out.println(sumFirstN(3));
      
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
     int[] arr = new int[x];

        return fun(arr,0,x);
       
        
    }
      private static int[] fun(int[] arr,int i, int x){

       

        if(i<1){

            return arr;

        }
         arr[i]=x;

        return fun(arr,i+1,x-1);

    }
    public static long sumFirstN(long n) {
        // Write your code here.

        int sum = 0;

        if(n<0)
            return 0;
     
        return n+ sumFirstN(n-1);
        
    }
}