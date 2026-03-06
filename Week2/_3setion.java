import java.util.*;
class _3setion{
    //Insertion Array
    // public static void main (String[] args) {
    //     int x[]={20,30,40,50,90};
    //     for(int i=1;i<x.length;i++){
    //         int j;
    //         int key=x[i];
    
    //         for(j=i-1;(j>=0 && x[j]>key);i--){
    //             x[j+1]=x[j];
    //         }
    //         x[i]=x[j+1];
    //         x[j+1]=key;
    //     }
    //     for(int i=0;i<x.length;i++){
    //         System.out.print(x[i] + " ");
    //     }
    // }

    //Identify Duplicates(Done:))

    // public static void main(String[] args) {
    //     int x[] = {1,1,1,1,1,2,2,3,4,5,5,5};//1,2,3,4
    //     int j=0;
    //     for(int i=1;i<x.length;i++){
    //         if(x[j]==x[i]){
    //             continue;
    //         }
    //         else{
    //             x[j+1]=x[i];
    //             j++;
    //         }
    //     }
    //     for(int i=0;i<j+1;i++){
    //         System.out.print(x[i]+" ");
    //     }
    //  }

    //Input:6
            // 16 17 4 3 5 2

    //Quetion-3:)[Done :)]
    // Input:5,4,9,1,7,2
    // public static void main(String[] args) {
    //     // int[] x ={16,17,4,3,5,2};
    //     // int max=x[x.length-1];
    //     // for(int i=x.length-1)
    //     int arr[] = {16,7,4,3,5,2};
    //     ArrayList<Integer> li = new ArrayList<>();
    //     int max = arr[arr.length-1];
    //     li.add(max);
    //     for(int i=arr.length-1;i>=0;i--){
    //         if(max<arr[i]){
    //             max=arr[i];
    //             li.add(max);
    //         }
    //     }
    //     for(int i=li.size()-1;i>=0;i--){
    //         System.out.print(li.get(i) + " ");
    //     }
    // }



        /*
         * 4/Write a java programe to find all indices i such that the
         *  sum of elements to the left of i is equal to the sum of elements to the right
         * int arr[] ={2,4,6,3,2,0,3,12};
         * output:4[Done:)]
         */
        // public static void main(String[] args) {
        //     int arr[] = {4,4,0,0,0,0,2,2};
        //     int lsum=0,rsum=-1,sum=0;
        //     for(int i=0;i<arr.length;i++){
        //         sum+=arr[i];
        //     }
        //     for(int i=1;i<arr.length;i++){
        //         if(lsum==rsum){
        //             System.out.println(i-1);
        //             break;
        //         }
        //         else{
        //             lsum = lsum+arr[i-1];
        //             rsum = sum-lsum-arr[i];
        //         }
        //     }
        // }


}