// package feb26;
/*
input:
7 3
5 2 3 5 4 2 1
Output:
12

*/

import java.util.*;

public class week4 {
    public static void bre(String s){

    }
    /* {DATE:24-02-2026}
    input:
    7 3
    5 2 3 5 4 2 1
    Output:
    12
    */
    // public static void main(String[] args) {
    //     HashMap<Integer,Integer> hm = new HashMap<>();
    //     int[] arr = new int[]{5,2,3,5,4,2,1};
    //     int k = 3;
    //     int i = 0,j=0,sum=0,max = Integer.MIN_VALUE;
    //     while(i<arr.length){
    //         hm.put(arr[i],hm.getOrDefault(arr[i], 1));
    //         sum+=arr[i];
    //         System.out.println(hm);
    //         if(i-j+1==k){
    //             if(hm.size()==k){
    //                 max = Math.max(max, sum);
    //             }
    //             hm.remove(arr[j]);
    //             sum = sum - arr[j];
    //             j++;
    //         }
    //         i++;            
    //     }
    //     System.out.println(max);

    // }


    /*  
    {DATE:24-02-2026(P1)}
    The Kingdom of CodeLand has a long bridge made of square tiles, where each tile
is painted either red ('R') or blue ('B'). A critical mission has been assigned
to you: ensure that a section of the bridge is sturdy enough to support heavy 
traffic. Blue tiles are reinforced, while red tiles are weak and need to be
reinforced by painting them blue.

You are given a 0-indexed string bridge of length n, where bridge[i] represents 
the color of the i-th tile. Each character in bridge is either 'R' (red) or 'B'
(blue).

Your goal is to ensure that there is at least one segment of k consecutive blue 
tiles on the bridge to support heavy traffic. You can repaint a red tile ('R') 
to a blue tile ('B') in one operation.

Write a program to determine the minimum number of repaint operations needed to
create a segment of k consecutive blue tiles.

Input Format:
---------------
Space separated string and integer, S and K

Output Format:
-----------------
An integer value.


Sample Input-1:
------------------
RRBRBBRRBR 4

Sample Output-1:
--------------------
1

Explanation:
-------------
One way to achieve 4 consecutive blue tiles is to repaint the 4th tile to get bridge = "RRBBBBRRBR".
This requires 1 operations.

Sample Input-2:
------------------
BRBRRBB 3

Sample Output-2:
--------------------
1

Explanation:
--------------
One way to achieve 3 consecutive blue tiles is to repaint the 2nd tile to get
bridge = "BBBRRBB".
This requires only 1 operation.

Sample Input-3:
------------------
BBBRRBRBRR 5

Sample Output-3:
--------------------
2

Explanation:
--------------
One way to achieve 5 consecutive blue tiles is to repaint the 4th and 9th tiles to get bridge = "BBBBBBBRRR".
This requires 2 operations.
    
    */

    // public static void main(String[] args) {
    //     String s = "BBBRRBRBRR";
    //     int k  = 5;
    //     int i = 0,j=0,min = Integer.MAX_VALUE;
    //     HashMap<Character,Integer> hm = new HashMap<>();
    //     while(j<s.length()){
    //         hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)+1);
    //         // if(j<k){
    //         //     j++;
    //         // }
    //         if(j-i+1==k){
    //             if(hm.containsKey('R')){
    //                 min = Math.min(min,hm.get('R'));
    //             }
    //             if(hm.get(s.charAt(i))==1){
    //                 hm.remove(s.charAt(i));
    //             }
    //             else{
    //                 hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
    //             }
    //             i++;
    //         }
    //         j++;
    //         // System.out.println(hm);
    //     }
    //     System.out.println(min);
    // }   

    //-------------------------------------------------------------------------------------------------------------------

    /*
    {DATE:24-02-2026(P2)}
    A digital security lab is analyzing two encrypted messages.

    The first message S is the original encoded template, and the second message T 
    is the received transmission.

    For the transmission to be considered valid:

    Every character in S must consistently map to exactly one character in T.

    No two different characters in S may map to the same character in T.

    The order of characters must remain unchanged.

    The mapping must be consistent throughout the entire string.

    Your task is to determine whether the received transmission follows a valid
    one-to-one cipher mapping.

    Return true if the mapping is valid; otherwise return false.

    Input Format
    Line-1: A string S
    Line-2: A string T
    Output Format
    Print true if the cipher mapping is valid.
    Otherwise print false.

    Constraints
    1 <= S.length <= 10^4
    S.length == T.length
    S and T contain only lowercase English letters.

    Sample Input – 1
    egg
    add
    Sample Output – 1
    true
    Explanation

    'e' → 'a'
    'g' → 'd'

    The mapping is consistent and one-to-one.

    Sample Input – 2
    foo
    bar
    Sample Output – 2
    false
    Explanation
    'o' maps to both 'a' and 'r', which violates consistent mapping.

    a-->a
    b-->a
    Sample Input – 3
    paper
    title
    Sample Output – 3
    true
        
    */

    // public static boolean d(String s,String t){
    //     HashMap<Character,Character> hm = new HashMap<>();
    //     // String s = "foo";
        
    //     // String t = "bar";
        
    //     if(s.length()!=t.length()) System.out.println("false");
    //     for(int i=0;i<s.length();i++){
    //         Character sc = s.charAt(i);
    //         Character tc = t.charAt(i);
    //         if(hm.containsKey(sc)){
    //             if(hm.get(sc)!=tc){
    //                 return false;
    //             }
    //     }
    //     else{
    //         if(hm.containsValue(tc)){
    //             return false;
    //         }
    //         hm.put(sc,tc);
    //     }
    //     }
    //     return true;

    // }
    // public static void main(String[] args) {
    //     String s = "abc";
    //     String t = "eff";
    //     boolean h = d(s, t);
    //     System.out.println(h);

    // }



    /*
    {DATE:24-02-2026(P3)}
    You are given a string s consisting only of lowercase English letters.

    A substring is considered special if it contains no repeating characters
    (i.e., every character appears only once in that substring).

    Your task is to count how many special substrings exist in the given string.

    A substring is a contiguous sequence of characters within a string.

    Input Format
    Line-1: A lowercase string s
    Output Format
    Print an integer — the total number of special substrings.
    Constraints
    1 <= s.length <= 10^5
    s consists only of lowercase English letters.
    Sample Input – 1
    abcd
    Sample Output – 1
    10
    Explanation

    All characters are unique.

    Length 1 → a, b, c, d → 4
    Length 2 → ab, bc, cd → 3
    Length 3 → abc, bcd → 2
    Length 4 → abcd → 1

    Total = 4 + 3 + 2 + 1 = 10

    Sample Input – 2
    ooo
    Sample Output – 2
    3
    Explanation

    Only substrings of length 1 are valid:
    o, o, o

    Sample Input – 3
    abab
    Sample Output – 3
    7
    Explanation

    Length 1 → a, b, a, b → 4
    Length 2 → ab, ba, ab → 3

    Total = 7
    */
    // public static void main(String[] args) {
    //     String s  = "abcd";
    //     // int i = 0,j = 0;
    //     int cnt = 0;
    //     // HashMap<Character,Integer> hm = new HashMap<>();
    //     // while(j<s.length()){
    //     //     hm.put(s.charAt(j),1);
    //     //     if(j+1==hm.get(s.charAt(j))){
    //     //         cnt++;
    //     //     }
    //     // }





    //     for(int i=0;i<s.length();i++){
    //         HashMap<Character,Integer> hm = new HashMap<>();
    //         for(int j=i;j<s.length();j++){
    //             hm.put(s.charAt(j),1);
    //             if(hm.size()==j-i+1) cnt++;
    //         }
    //     }

    //     System.out.println(cnt);
    // }



    /*
    {DATE:28-02-2026(P1)}
    MotorSport Ltd hosting a Racing Championship. Mr. Ajith is participating 
    in car races. Each race start and end in perticular time intervals.

    You are given an array of racing time intervals consisting of
    start and end times [[s1,e1],[s2,e2],...] (s < e ) of N races, in which 
    Ajith has to participate. Your task is to determine whether Ajith can 
    in all the races or not.

    NOTE: If a race starts at time 'a' ends at time 'b', 
    another race can start at 'b'.

    Input Format:
    -------------
    Line-1: An integer N, number of races Ajith has to participate.
    Next N lines: Two space separated integers, start and end time of each race.

    Output Format:
    --------------
    Print a boolean value.


    Sample Input-1:
    ---------------
    3
    0 30
    5 10
    15 20

    Sample Output-1:
    ----------------
    false

    Sample Input-2:
    ---------------
    3
    0 10
    15 25
    30 35

    Sample Output-2:
    ----------------
    true    
    */
//    public static boolean race(int[][] arr,int n){
//     int si = arr[0][1];
//     for(int i=1;i<n;i++){
//         int fi = arr[i][0];
//         if(si>fi){
//             return false;
//         }
//         si = arr[i][0];
//     }
//     return true;
//    }
//    public static void main(String[] args) {
//     int n = 3;
//     // int[][] arr = new int[][]{{0,30},{5,10},{15,20}};
//     // int[][] arr = new int[][]{{0,10},{15,20},{30,35}};
//     int[][] arr = new int[][]{{0,30},{5,10},{15,20}};
//     System.out.println(race(arr, n));
//    }


/*
{DATE:28-02-2026(P2)}
There is a series of bulbs in which some bulbs are turned on(indicated by 1) 
and others are off(indicated by 0). 

A contiguous sub-series of bulbs CSB with following rules.
    1. Number of bulbs with status as 'on' and 'off' are same.
    2. Bulbs which are 'on' and 'off' are grouped together.

You will be given the series as a string of 1's and 0's.
Your task is to find the count of all the CSBs  exist in the given series.



Input Format:
-------------
A string, indicates bulbs series.

Output Format:
--------------
Print an integer result.1 

Sample Input-1:
---------------
010011000110

Sample Output-1:
---------------/-
9

Explanation:
------------
01-3, 10-3, 0011-2, 1100-1 


Sample Input-2:
---------------
0101010

//1.000111
2.111000
3.1100
4.0011
Sample Output-2:
----------------
6

Explanation:
------------
01-3, 10-3
*/

// public static int bulb(String s){
//     int count = 1;
//     List<Integer> li = new ArrayList<>();
//     for(int i=1;i<s.length();i++){
//         if(s.charAt(i-1)==s.charAt(i)){
//             count++;
//         }
//         else{
//             li.add(count);
//             count=1;
//         }
//     }
//     li.add(count);
//     int ans=0;
//     for(int i=1;i<li.size();i++){
//         ans+=Math.min(li.get(i),li.get(i-1));
//     }
//     System.out.println(ans);
//     return 0;
// }
// public static void main(String[] args) {
//     // String s = "010011000110";
//     String s = "0101010";
//     int sl = s.length();
//     int b = bulb(s);
// }






}
