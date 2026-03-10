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





    
}
