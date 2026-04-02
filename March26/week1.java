public class week1 {
    /*
    {DATE:03-02-2026(P1)}
    There are N sticks of various lengths, stklen[], where stklen[i] is the length of the i-th stick.
    And you need to break them into pieces of any length.
    And you will be given another integer P, number of pieces you need to make.
    You need to break the sticks to make P pieces of equal lengths.
    You can consider the unwanted piece as scrap.

    You can break a stick of length 6 as follows:
        - 6 pieces of length-1.
        - 1 piece of length-1 and 1 piece of length-2 and one piece of length-3.
        - 3 pieces of length-2, etc.
	
    Your task is to check, can you break the sticks into P pieces of equal length,
    if possible, retrun the maximum length of the pieces possible.
    otherwise return 0.

    Input Format:
    -------------
    Line-1: Two space separated integers, N and P.
    Line-2: N space separated integers, length of the sticks.

    Output Format:
    --------------
    Print an integer result.


    Sample Input-1:
    ---------------
    3 3
    6 8 10

    Sample Output-1:
    ----------------
    6


    Sample Input-2:
    ---------------
    3 4
    6 8 10

    Sample Output-2:
    ----------------
    5
    */
    // public static void main(String[] args) {
    //     int k = 3,p = 3;
    //     int[] arr = new int[]{6,8,10};
    //     int max = -1;
    //     for(int i=0;i<arr.length;i++){
    //         max = Math.max(max,arr[i]);
    //     }
    //     int s = 0,e = max,ans = -1;
    //     while(s<=e){
    //         int mid = s + (e-s)/2;
    //         int res  = f(mid,arr);
    //         if(res>=p){
    //             ans = mid;
    //             s = mid+1;
    //             // break;
    //         }
    //         else{
    //             e = mid-1;
    //         }
    //     }
    //     System.out.println(ans);
    // }
    // public static int f(int mid,int[] arr){
    //     // return 0;
    //     int c = 0;
    //     for(int i=0;i<arr.length;i++){
    //         c += arr[i]/mid;
    //     }
    //     return  c;
    // }



    /*
    {DATE:03-02-2026(P2)}
    A crew of N players played a game for one time, and got some scores.
    They have to stand in the same positions after they played the game.
    
    There is a constraint that, the player-K score, should not be greater or smaller than both of his neighbors.
    To achieve this constraint, there are few steps to be followed as mentioned:
            - If the score of player-K is smaller than both his neighbors,then his score is incremented by 1
            - If the score of player-K is greater than both his neighbors,then his score is decremented by 1
            - The first and last elements never change.
            Repeat these steps, until the constraint is satisified.
    
    Your task is to find and print the resultant array of scores, after the constraint is achieved.
    
    NOTE: Players are not allowed to swap their positions to achieve the constraint.
    
    Input Format:
    -------------
    Line-1: An integer N, number of players.
    Line-2: N space separated integers represents scores of each player.
    
    Output Format:
    --------------
    Print integer array, the resultant scores.
    
    Sample Input-1:
    --------------- 
    6
    4 3 5 2 6 3
    
    Sample Output-1:
    ----------------
    [4, 4, 4, 4, 4, 3]

    Sample Input-2:
    ---------------
    8
    5 1 4 2 7 4 6 3
    
    Sample Output-2:
    ----------------
    [5, 3, 3, 3, 5, 5, 5, 3]
    
    */


    /*
    {DATE:05-02-2026(P1)}

    Mr PushpaRaj has N bottles of Spirit as bottles[], where i-th bottle contains bottle[i] liters of Spirit. He wants to make that all the bottles contains same amount of Spirit. Generally, Spirit evaporates quickly, due to this,  P percentage of Spirit will be evaporated while pouring it from one bottle to another, i.e., if He poured M liters of Spirit from one bottle to another, the amount of Spirit evaporated is P% of M.

    Your task is to help Mr PushpaRaj find the maximum amount of Spirit in each bottle after making sure that all the bottles have the same amount of Spirit.

    NOTE: Print the result within 10^(-5) of the actual result will be accepted.
    Use Binary Serach technique to solve this.

    Input Format:
    -------------
    Line-1: Two space separated integers, N and P.
    Line-2: N space separated integers, bottles[].

    Output Format:
    --------------
    Print a double value rounded to 5 decimals. 


    Sample Input-1:
    ---------------
    4 75
    2 8 3 12

    Sample Output-1:
    ----------------
    4.00000

    Explanation:
    ------------
    ::-The bottles contains {2,8,3,12},Pour 4 ltrs from bottles[1] to bottles[0].
    4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
    ::-The bottles contains {3,4,3,12}, Pour 4 ltrs from bottles[3] to bottles[0].
    4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
    ::-The bottles contains {4,4,3,8}, Pour 4 ltrs from bottles[3] to bottles[2].
    4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
    ::-All the bottles have 4 ltrs of Spirit in them, so return 4.


    Sample Input-2:
    ---------------
    4 50
    3 5 8 10

    Sample Output-2:
    ----------------
    5.66666


    */
//    public static void main(String[] args) {
//     int[] arr = new int[]{3,5,8,10};
//     int  x = 50;
//     int l=0,r = arr[arr.length-1];
//     while(l<r){
        
//     }
//    }


/*
    {DATE:05-02-2026(P2)}

        Ram and Sita are subscribing to a travel service for their respective 
        business commitments in Rome.

        You are provided with four subscription strings, startOfRam, 
        endOfRam, startOfSita, and endOfSita. 
        Ram's subscription allows him to be in the city from the dates 
        startOfRam to endOfRam(inclusive), while Sita's subscription
        covers the period from startOfSita to endOfSita (inclusive). 

        Each subscription date is represented as a 5-character string in 
        the format "MM-DD", indicating the month and day of the date.

        Your task is to determine the total number of days when 
        they can enjoy their Rome experience together.

        Assume that all subscription dates fall within the same calendar year, 
        which is not a leap year. Note that the number of days per month 
        can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].

        Input Format:
        -------------
        4 space separated strings, startOfRam, endOfRam, startOfSita, and endOfSita. 

        Output Format:
        -------------
        An integer result.


        Sample Input-1:
        ----------------
        08-15 08-18 08-16 08-19

        Sample Output-1:
        ----------------
        3

        Explanation: 
        ------------
        Ram will be in Rome from August 15 to August 18. 
        Sita will be in Rome from August 16 to August 19. 
        They both in Rome together on August 16th, 17th, and 18th, 
        so the answer is 3.


        Sample Input-2:
        ----------------
        10-01 10-31 11-01 12-31

        Sample Output-2:
        ----------------
        0


    */

        // public static void main(String[] args) {
        //     String s = "10-01 10-31 11-01 12-31";
        //     String[] s_split = s.split("-");
        //     for(String n:s_split){
        //         System.out.println(n);
        //     }
        // }


        /*
    DATE:06-02-2026(P1)}
    Arjun wants to build a swimming pool, in the backyard of his farm-house.
    The backyard has an empty land of size m*n. 
    Some part of the backyard is used to build the swimming pool
    You will be given the m*n grid values (0's and 1's). 
    where 1 indicates swimming pool, and 0 indiactes empty land.

    Your task to find the perimeter of the swimming pool.

    Note: There is only one swimming pool.

    Input Format:
    -------------
    Line-1: Two integers M and N, size of the backyard.
    Next M lines: N space separated integers, either 0 or 1
    0- represents empty land and 1- represents the swimming pool 

    Output Format:
    --------------
    Print an integer, the perimeter of the swimming pool


    Sample Input-1:
    ---------------	
    4 4
    0 1 0 0
    1 1 1 0
    0 1 0 0
    1 1 0 0
    
    Sample Output-1:
    ----------------
    16


    Sample Input-2:
    ---------------
    1 2
    1 0
    
    Sample Output-2:
    ----------------
    4
    
    -1 0 1 0
    0 1 0 -1
    */

    // public static void main(String[] args) {
    //     int n = 4,m=4;
    //     int[][] arr = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
    //     int ans = 0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             int ci = 0;
    //             if(arr[i][j]==1){
    //                 int[] row = {-1,0,1,0};
    //                 int[] col = {0,1,0,-1};
    //                 for(int k=0;k<4;k++){
    //                     int nrow = i + row[k];
    //                     int ncol = j + col[k];
    //                     if(!(nrow>=0 && nrow<n && ncol>=0 && ncol<m)){
    //                         ci++;
    //                     }
    //                     else{
    //                         if(arr[nrow][ncol]!=1){  
    //                             ci++;
    //                         }
    //                     }
    //                 }
    //             }
    //             // System.out.println(ans);
    //             ans+=ci;
    //         }
    //     }
    //     System.out.println(ans);
    // }


    /*
    
    DATE:07-02-2026(P1)}

    Mr Ravi is a business man, he does business weekly Q times, 
    and records his PROFIT or LOSS every time in to data[][] array. 
    He records the LOSS as a negative value and PROFIT as a positive value.

    Your task is to help Mr Ravi to know that how many total number of times,
    he was in LOSS after P weeks.

    NOTE: The values in data[][] are in descending order both row-wise and 
    column-wise as given in sample testcases.

    Input Format:
    -------------
    Line-1: Two space separated integers, P and Q
    Next P lines: Q space separated integers, data[][].   

    Output Format:
    --------------
    Print an integer result.


    Sample Input-1:
    ---------------
    4 4
    5 4 2 -2
    4 3 1 -2
    2 2 -1 -3
    -1 -1 -2 -4

    Sample Output-1: 
    ----------------
    8

    Explanation: 
    ------------
    8 days in LOSS,since there are 8 negative values.

    Sample Input-2:
    ---------------
    4 4
    8 7 1 -2
    7 6 2 -3
    3 -1 -2 -4
    -2 -3 -4 -7
        
    Sample Output-2:
    ----------------
    9

    Explanation:
    ------------
    9 days in LOSS,since there are 8 negative values.

    Sample Input-3:
    ---------------
    2 2
    9 3
    5 0

    Sample Output-3:
    ----------------
    0
    
    */
   public static void main(String[] args) {

   }

}
