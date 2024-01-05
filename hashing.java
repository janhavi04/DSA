import java.util.*;

class hashing{
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //number hashing
        /*
        int[] arr = {1,3,2,1,3,52,25,14,14,15,14};
        int n = arr.length;
        System.out.println(n);

        //precompute
        int[] hash = new int[1000000];
        for(int i = 0; i<n;i++){
            hash[arr[i]] += 1;
        }

        int q;
        System.out.println("Enter query:");
        q = sc.nextInt();
        while(q-- !=0){
            int num;
            
            num = sc.nextInt();

            //fetching
            System.out.println(hash[num]);
         */

        //character hashing
        /*String s;
        System.out.println("Enter a string:");
        s = sc.nextLine();

        //precompute
        int[] hash = new int[26];
        for(int i =0; i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }

        int q;
        System.out.println("Enter query:");
        q = sc.nextInt();
        while(q-- !=0){
            char c;
            c=sc.next().charAt(0);
            
            //fetch
            System.out.println(hash[c-'a']);

           
        }
        */



         //HashMap Example
            //country(key), population(Value)
           /* HashMap<String,Integer> map = new HashMap<>();

            //Insertion
            map.put("India",120);
            map.put("China" , 150);
            map.put("US", 30);

            System.out.println(map);
             
            map.put("US", 50); //will update the value
            System.out.println(map);

            //Search
            if(map.containsKey("China")) //Search for the key
                System.out.println("Present");
            else
            System.out.println("Not Present");

            System.out.println(map.get("China")); // Prints the value of the key if present
            System.out.println(map.get("Nepal"));

        
            //Iteration
            // for(Map.Entry<String,Integer> e:map.entrySet()){
            //     System.out.print(e.getKey());
            //     System.out.print(e.getValue());
            //     System.out.println();
            // }
            // System.out.println();
            
            // Set<String> keys = map.keySet();
            // for(String key: keys){
            //     System.out.println(key+" " + map.get(key));
            // }
            */

            //Hashing large number 10^9 and more using HashMap
/*
            int n ;
            System.out.println("Enter the size of an array: ");
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i<n;i++){
                arr[i] = sc.nextInt();
            }

            //precompute

            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(int i = 0;i<n;i++){
                int key = arr[i];
                int freq = 0;
                if(mpp.containsKey(key)) freq = mpp.get(key);
                freq++;
                mpp.put(key,freq);

            }
            //Iterate over the map
            for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
                System.out.println(it.getKey() + "->" + it.getValue());
            }

            int q;
            System.out.println("Enter a query:");
            q = sc.nextInt();
            
            while(q-- !=0){
                int num = sc.nextInt();

                //fetch
                if(mpp.containsKey(num))
                    System.out.println(num +" appears " + mpp.get(num) +" times.");
                else
                System.out.println(0);
            }
            */

    }
}