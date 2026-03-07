public class basic {
    // static void  insertion(int arr[],int i,int element,int n ,int j){
    //     if(j>=0 && arr[j]>element && arr[j]!=arr[j+1]){
    //         arr[j+1]=arr[j];
    //         insertion(arr,i,element,n,j-1);
    //     }
    //     else{
    //         arr[i]=arr[j+1];
    //         arr[j+1]=element;
    //         return;
    //     }
    // }
    // public static void main(String[] args) {
    //     // int[] x ={16,17,4,3,5,2};
    //     // int max=x[x.length-1];
    //     // for(int i=x.length-1)
    //     int arr[] = {16,17,4,3,5,2};
    //     for(int i=1;i<arr.length;i++){
    //         insertion(arr,i,arr[i],arr.length,i-1);
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }
    // }


   public static int slidingWindow(int arr[],int slidingsize){
        int n=arr.length;
        int k=0,slidingnextstep=slidingsize;
        while(k<n-slidingsize){
            int slidingIntialIndex=k;
            for(int i=0;i<n;i++){
                if(slidingIntialIndex<slidingnextstep && i>=slidingIntialIndex){
                    slidingIntialIndex++;
                    continue;
                }
                else{
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println("\n");
            k++;
            slidingnextstep++;
        }
    return 0;
   }
   public static void main(String[] args) {
        int[] x ={1,1,3,7,7,6,5,5};
        int q = slidingWindow(x, 3);
   }


}
