/*
Quetion-1:
You are provided with a sequence of integers representing various measurements. 
A position in this sequence is termed a balance point if the sum of all measurements before it equals the sum of all measurements after it. 
Your task is to identify all such balance points within the sequence.
Input Format:
--------------
Line-1: An integer N, representing the number of measurements in the sequence.
Line-2: A line with N space-separated integers, representing the measurements.
Output Format:
--------------
Line-1: Print all the balance point indices as space-separated integers. If no balance point exists, print -1.
Sample Input-1:
---------------
7
-7 1 5 2 -4 3 0
Sample Output-1:
----------------
3 6
Explanation:
------------
At index 3: Sum of elements before = -7 + 1 + 5 = -1, Sum of elements after = -4 + 3 + 0 = -1.
At index 6: Sum of elements before = -7 + 1 + 5 + 2 + (-4) + 3 = 0, Sum of elements after = 0.
Sample Input-2:
---------------
3
1 2 3
Sample Output-2:
----------------
-1
Explanation:
-------------
No index satisfies the balance point condition.
Sample Input-3:
---------------
5
2 3 5 3 2
Sample Output-3:
----------------
2
Explanation:
------------
At index 2: Sum before = 2 + 3 = 5, Sum after = 3 + 2 = 5.
Constraints:
-------------
1 ≤ N ≤ 100,000
-1,000,000 ≤ measurement[i] ≤ 1,000,000
 */

// import java.util.ArrayList;

// class online{
//     public static void BalancePointFinder(int arr[]){
//         ArrayList<Integer> li = new ArrayList<>();
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         int lsum=0,rsum=-1;
//         for(int i=1;i<arr.length-1;i++){
//             if(lsum==rsum){
//                 System.out.print(i+" ");
//                 li.add(i-1);
//             }
//             else{
//             lsum+=arr[i-1];
//             System.out.println("lsum:"+lsum);
//             rsum=sum-lsum-arr[i];
//             System.out.println("rsum:"+rsum);
//             }
//         }

//         for(int i=0;i<li.size()-1;i++){
//             System.out.print(li.get(i)+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {-7, 1, 5, 2, -4, 3, 0};
//         BalancePointFinder(arr);

//     }
// }

/*
You are given a sorted sequence of distinct integers. 
An index i is termed a match point if the value at that index equals the index itself, i.e., sequence[i] == i. 
Your task is to identify any such match point within the sequence. 
If multiple match points exist, return any one of them. If no match point is found, return -1.

Input Format:
--------------
Line-1: An integer N, representing the number of elements in the sequence.
Line-2: A line with N space-separated integers, representing the elements of the sequence.

Output Format:
--------------
Line-1: Print a single integer, The index of the match point if found or -1 if no match point exists.

Sample Input-1:
---------------
7
-4 -2 0 1 4 6 7

Sample Output-1:
----------------
4

Explanation:
------------
At index 4, the value is 4, satisfying the condition sequence[4] == 4.

Sample Input-2:
---------------
6
-10 -5 3 4 7 9

Sample Output-2:
----------------
-1

Constraints:
-------------
1 ≤ N ≤ 100,000
-1,000,000 ≤ sequence[i] ≤ 1,000,000
The sequence is sorted in ascending order.
All elements are distinct.

 */
//by recusrion 
public class online {
    public static int matchPoint(int[] arr,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==i){
            return i;
        }
        else{
            return matchPoint(arr, i+1);
        }
    }
    public static void main(String[] args) {
        // int arr[] ={-4,-2,0,1,4,6,7};
        int arr[] ={-10,-5,3,4,7,9};
        System.out.println(matchPoint(arr, 0));
    }
    
    
}





/*
Motu loves to eat Laddus. A Laddus vendor prepared N boxes of laddus, 
where i-th box contains box[i] laddus. And the laddus vendor went outside 
the shop, He will be back in T hours time.

Motu can decide his eating speed of laddus per hour as S.  
Each hour, He chooses any box of laddus, and eats S laddus from that box.  
If the box has less than S laddus, he eats all of them instead, 
and won't eat any more laddus during this hour.

Motu likes to eat slowly, but he wants to finish eating all the laddus 
before the vendor come back.

Can you help Motu to find out his minimum eating speed S,
such that he can eat all the laddus within T hours, and print S.

Note:
	- You may assume that the time T is always >= Number of boxes

Input Format:
-------------
Line-1: space separated integers, box[], number of laddus in each box
Line-2: An integer T.

Output Format:
--------------
Print an integer S, minimum eating speed of Motu.


Sample Input-1:
---------------
4 8 9 13
8

Sample Output-1:
----------------
5

Explanation:
-----------
With Eating speed of 5:
Motu eats 4 laddus in 1st box in 1st hour., remaining in 1st box 0
Motu eats 5 laddus from 2nd box in 2nd hour, remaining in 2nd box 3
Motu eats 3 laddus from 2nd box in 3rd hour, remaining in 2nd box 0
Motu eats 5 laddus from 3rd box in 4th hour, remaining in 3rd box 4
Motu eats 4 laddus from 3rd box in 5th hour, remaining in 3rd box 0
Motu eats 5 laddus from 4th box in 6th hour, remaining in 4th box 8
Motu eats 5 laddus from 4th box in 7th hour, remaining in 4th box 3
Motu eats 3 laddus from 4th box in 8th hour, remaining in 4th box 0.


Sample Input-2:
---------------
15 18 12 17 22
7

Sample Output-2:
----------------
17

 */