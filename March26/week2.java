public class week2 {

    /*
    {DATE:10-02-2026(P1)}
    Treasure Map Search

    An explorer discovers an ancient treasure map arranged in a grid format.
    Each cell of the grid contains a unique treasure code.

    The map follows two important rules:

    1. Each row is sorted in increasing order.
    2. The first number of every row is greater than the last number of the previous row.

    Because of these properties, the entire map behaves like a single sorted sequence.

    Given a treasure code T, determine whether the code exists in the map.

    Print true if the code is found, otherwise print false.

    Input Format:
    -------------

    First line contains two integers R and C representing the number of rows and columns.

    Next R lines contain C space-separated integers representing the treasure map.

    Last line contains an integer T representing the target treasure code.

    Output Format:
    --------------

    Print true if the target exists in the map.
    Otherwise print false.

    Sample Input-1:
    ---------------

    3 4
    1 3 5 7
    10 11 16 20
    23 30 34 60
    3

    Sample Output-1:
    ----------------

    true

    Explanation:
    ------------

    The value 3 exists in the first row of the map.

    Sample Input-2:
    ---------------

    3 4
    1 3 5 7
    10 11 16 20
    23 30 34 60
    13

    Sample Output-2:
    ----------------

    false


    00 01 02 03
    10 11 12 13
    20 21 22 23
    30 31 32 33
    
*/

    // public static boolean tresure(int[][] arr,int r,int c,int t){
    //     int li = 0;
    //     int ri =  r*c-1;
    //     while(li<=ri){
    //         int mid = (li+ri)/2;
    //         int midi = mid /c;
    //         int midj = mid%c;
    //         if(arr[midi][midj]==t){
    //             return true;
    //         }
    //         else if(arr[midi][midj]>t){
    //             ri=mid-1;
    //         }
    //         else if(arr[midi][midj]<t){
    //             li=mid+1;
    //         }

    //     }
    //     return false;
    // }
    // public static void main(String[] args) {
    //     int[][] arr= new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    //     int r = 3,c=4,t=9;
    //     boolean b = tresure(arr,r,c,t);
    //     System.out.println(b);
    // }

    /*
    {DATE:10-02-2026(P2)}
    A passenger must travel through several cities using express trains.
    The distances between consecutive cities are given.
    All trains travel at the same constant speed.
    However, trains depart only at integer hours.  
    If a passenger arrives at a station before the next integer hour, they must 
    wait until the next integer hour to board the next train.

    Only the last train does not require waiting.

    Given the distances between cities and the total allowed travel time,
    determine the minimum integer speed required to complete the journey within 
    the allowed time.

    If it is impossible to reach on time, print -1.

    Input Format:
    -------------

    First line contains an integer N representing the number of train segments.

    Second line contains N space-separated integers representing the distances.

    Third line contains a decimal number H representing the maximum allowed
    travel time.

    Output Format:
    --------------

    Print a single integer representing the minimum required speed.
    If it is impossible, print -1.

    Sample Input-1:
    ---------------

    3
    1 3 2
    6

    Sample Output-1:
    ----------------

    1

    Explanation:
    ------------

    Speed = 1

    Travel times:
    1/1 = 1 hour
    3/1 = 3 hours
    2/1 = 2 hours

    Total = 6 hours which is within the allowed time.

    Sample Input-2:
    ---------------

    3
    1 3 2
    2.7

    Sample Output-2:
    ----------------

    3
    */

    // public static int  train(int n,int[] arr,double  atime){
    //     int l = 1;
    //     int r = 1000000000;
    //     while(l<r){
    //         int mid = l+(r-l)/2;
    //         double sum = 0;
    //         for(int i=0;i<arr.length;i++){
    //             double j = (double)arr[i]/mid;
    //             if(i!=arr.length-1){
    //                 j = Math.ceil(j);
    //                 sum+=j;
    //             }
    //             else{
    //                 sum+=j;
    //             }
    //         }
    //         if(sum<=atime){
    //             r = mid;
    //         }
    //         else{
    //             l = mid+1;
    //         }
    //     }
    //     return l;
    // }
    // public static void main(String[] args) {
    //     int  n = 3;
    //     // System.out.println(n);
    //     int[] arr = new int[]{1,3,2};//distance between the cities 
    //     double atime = 2.7;
    //     int etime = train(n,arr,atime);
    //     System.out.println(etime);
    // }

    /*
    {DATE:10-02-2026(P3)}
    Largest Possible Square

    You are given an integer X representing the number of unit tiles available.

    You want to arrange these tiles to form a perfect square floor.
    Each side of the square must contain the same number of tiles.

    However, you cannot use more tiles than available.

    Find the maximum possible side length of the square that can be formed.

    Input Format:
    -------------

    A single integer X.

    Output Format:
    --------------

    Print a single integer representing the maximum side length of the square.
                           
    Sample Input-1:
    ---------------

    4

    Sample Output-1:
    ----------------

    2

    Explanation:
    ------------

    A square of side 2 uses 2 × 2 = 4 tiles.

    Sample Input-2:
    ---------------

    8

    Sample Output-2:
    ----------------

    2

    
    
    */

    // public static void main(String[] args) {
    //     int n = 8;
    //     int l = 1;
    //     int r  = n/2;
    //     int ans = 0;
    //     while(l<r){
    //         int mid = l+(r-l)/2;
    //         int s = mid * mid;
    //         if(s<=n){
    //             r = mid;
    //         }
    //         else{
    //             l = mid-1;
    //         }
    //         ans = mid;
    //     }
    //     System.out.println(r);
    // }

    /*
    DATE:11-02-2026(P1)}
    A factory uses a long conveyor belt carrying boxes with different weights.
    Each position on the belt has a box with a certain weight.

    The manager wants to find a special position called the "Balance Point".

    A Balance Point is an index where:

    Total weight of boxes on the left side
    =
    Total weight of boxes on the right side

    Note:
    - The element at the balance index itself is not counted in either side.
    - If multiple balance points exist, return the first one.
    - If no such index exists, print -1.

    Input Format:
    -------------

    First line contains an integer N representing the number of boxes.

    Second line contains N space-separated integers representing the weights.

    Output Format:
    --------------

    Print a single integer representing the balance index.

    Sample Input-1:
    ---------------

    6
    1 7 3 6 5 6

    Sample Output-1:
    ----------------

    3

    Explanation:
    ------------

    Left side sum = 1 + 7 + 3 = 11  
    Right side sum = 5 + 6 = 11  

    So index 3 is the balance point.


    Sample Input-2:
    ---------------

    3
    1 2 3

    Sample Output-2:
    ----------------

    -1

    */

    // public static void main(String[] args) {
    //     // int[] arr = new int[]{1,7,3,6,5,6};
    //     int[] arr = new int[]{10,30,30,40};
    //     int tsum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         tsum+=arr[i];
    //     }
    //     // System.out.println("Tsum:"+tsum);
    //     int  rsum = 0;
    //     int lsum = 0;
    //     int f=0;
    //     for(int i=1;i<arr.length;i++){
    //         lsum = arr[i-1] +lsum;
    //         rsum = tsum - lsum - arr[i];
    //         // System.out.println(rsum);
    //         if(lsum==rsum){
    //             System.out.println("Index:"+(i));
    //             f=1;
    //         }
    //     }
    //     if(f==0){
    //         System.out.println("Not found");
    //     }
        
    // }

    /*
     DATE:11-02-2026(P2)}
    A logistics company stores packages in a long warehouse corridor.
    Each position in the corridor holds packages with a certain weight.

    Warehouse managers frequently ask queries like:

    "What is the total weight of packages stored from position L to position R?"

    Since these queries happen many times, calculating the sum repeatedly by scanning the corridor would be too slow.

    Your task is to process the queries efficiently and print the total weight for each query.

    Input Format:
    -------------

    First line contains two integers:
    N Q

    N → number of positions in the warehouse
    Q → number of queries

    Second line contains N space-separated integers representing the package weights.

    Next Q lines each contain two integers:
    L R

    L and R represent the range of positions (0-indexed, inclusive).

    Output Format:
    --------------

    For each query print the total weight in the range L to R.

    Sample Input-1:
    ---------------

    5 3
    2 4 1 5 3
    0 2
    1 3
    2 4

    Sample Output-1:
    ----------------

    7
    10
    9

    Explanation:
    ------------

    Array = [2,4,1,5,3]

    Query1 (0,2) → 2+4+1 = 7  
    Query2 (1,3) → 4+1+5 = 10  
    Query3 (2,4) → 1+5+3 = 9


    Sample Input-2:
    ---------------

    4 2
    10 20 30 40
    1 2
    0 3

    Sample Output-2:
    ----------------

    50
    100
    */

    // public static void main(String[] args) {
    //     int[] arr = new int[]{2,4,1,5,3};
    //     int[][] q = new int[][]{{0,2},{1,3},{2,4}};
    //     for(int i=0;i<q.length;i++){
    //         int s = q[i][0];
    //         // System.out.println(s);
    //         int e = q[i][1];
    //         int sum=0;
    //         for(int j=s;j<=e;j++){
    //             sum+=arr[j];
    //         }
    //         System.out.println(sum+" ");
    //     }
    // }



    
}
