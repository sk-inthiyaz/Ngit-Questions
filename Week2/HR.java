import java.util.*;
public class HR {
    //29/03/2025[1'miniMaxSum',2'birthdayCakeCandles]05/03/2025[1'TimeConversion']
    //07/04/2025[1.'gradingStudents',2.'countApplesAndOranges',3.'kangaroo']
    //10/04/2025[1.'climbingLeaderboard'(Med)]
    //11/04/2023[1.'breakingRecords']
    /*
    Quetion1:
    arr = [1,3,5,7,9]
    The minimum sum = 3+5+7=16
    The Maximum sum = 3+5+7+9=24
     */
    // public static void miniMaxSum(List<Integer> arr) {
    // // Write your code here
    // long min=arr.get(0);
    // long max=arr.get(0);
    // long sum=arr.get(0);
    //     for(int i=1;i<arr.size();i++){
    //         sum+=arr.get(i);
    //         if(max<arr.get(i)){
    //             max=arr.get(i);
    //         }
    //         if(min>arr.get(i)){
    //             min=arr.get(i);
    //         }
    //     }
    //     System.out.println((sum-max)+" "+(sum-min));
    // }
    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,7,9));
    //     miniMaxSum(list);
    // }

    // Quetion2:birthdayCakeCandles
    /*
    candles =[4,4,1,3]
    The tallest candles are 4 units high. There are 2 candles with this height, so the function should return 2.
     */
    // public static int birthdayCakeCandles(List<Integer> candles) {
    //     int max=candles.get(0);
    //     int count=0;
    //     for(int i=0;i<candles.size();i++){
    //         if(max<candles.get(i)){
    //             max=candles.get(i);
    //         }
    //     }
    //     for(int i=0;i<candles.size();i++){
    //         if(candles.get(i)==max){
    //             count+=1;
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,4,2,10,6,10,7));
    //     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,4,1,3,4));
    //     System.out.println(birthdayCakeCandles(list));
    // }


    //Quetion:TimeConversion
    // public static String timeConversion(String s) {
    //     // Write your code here
    //     String hr = s.substring(0, 2);
    //     String ms = s.substring(2, s.length()-2);
    //     String format = s.substring(s.length()-2,s.length());
    //     Integer dhr;
    //     if(format.equals("AM")){
    //         if(hr.equals("12")){
    //             hr="00";
    //         }
    //     }
    //     else{
    //         if(!hr.equals("12")){
    //             dhr = Integer.parseInt(hr);
    //             dhr = 12 + dhr;
    //             hr = Integer.toString(dhr);
    //         }
    //     }
    //     String result = hr + ms ;
    //     System.out.println(result);
    //     return null;
    // //     }
    // public static void main(String[] args) {
    //     timeConversion("12:01:00AM");
    // }

    // public static List<Integer> gradingStudents(List<Integer> grades) {
    //     // Write your code here
    //     List<Integer>result = new ArrayList<>();
    //     int d,a;
    //     for(int i=0;i<grades.size();i++){
    //         if(grades.get(i)<38){
    //             result.add(grades.get(i));
    //         }
    //         else{
    //             d = grades.get(i)/5;
    //             a=(d+1)*5;
    //             if(a-grades.get(i)<3){
    //                 result.add(a);
    //             }
    //             else{
    //                 result.add(grades.get(i));
    //             }
    //         }
    //     }
    //     return result;
    // }
    // public static void main(String[] args) {//4,73,67,38,33
    //     ArrayList<Integer> list = new ArrayList<>(Arrays.asList(73,67,38,33));
    //     List<Integer>res = gradingStudents(list);
    //     System.out.println(res);  
    // }

    //Q)countApplesAndOranges
    // public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    //     // Write your code here
    //     int c1=0,c2=0;
    //     for(int i=0;i<apples.size();i++){
    //         apples.set(i, apples.get(i)+a); // change value at index 1 to 25
    //         if(apples.get(i)>=s && apples.get(i)<=t){
    //             c1+=1;
    //         }
    //     }
    //     for(int i=0;i<oranges.size();i++){
    //         oranges.set(i, oranges.get(i)+b);
    //         if(oranges.get(i)>=s && oranges.get(i)<=t){
    //             c2+=1;
    //         }
    //     }
        
    //     System.out.println(c1);
    //     System.out.println(c2);
        
    //     }
    // public static void main(String[] args) {
    //     // ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,-4));
    //     ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-2,2,1));
    //     // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,-2,-4));
    //     ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,-6));
    //     // countApplesAndOranges(7, 10, 4, 12, list1,list2);
    //     countApplesAndOranges(7, 11, 5, 15, list1, list2);
    // }
    

    //Question:kangaroo
    /**
    You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
    The first kangaroo starts at location  and moves at a rate of  meters per jump.
    The second kangaroo starts at location  and moves at a rate of  meters per jump.
    You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.
Example
After one jump, they are both at , (, ), so the answer is YES.
Function Description
Complete the function kangaroo in the editor below.
kangaroo has the following parameter(s):
int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2
Returns
string: either YES or NO
Input Format
A single line of four space-separated integers denoting the respective values of , , , and .
Constraints
Sample Input 0
0 3 4 2
Sample Output 0
YES
Explanation 0
The two kangaroos jump through the following sequence of locations:
image
From the image, it is clear that the kangaroos meet at the same location (number  on the number line) after same number of jumps ( jumps), and we print YES.
Sample Input 1
0 2 5 3
Sample Output 1
NO

21 6 47 3
NO
*/
    // public static String kangaroo(int x1, int v1, int x2, int v2) {
    //     if(v2>=v1 && x1!=x2){
    //         return "NO";
    //     }
    //     else{
    //         if((x2-x1)%(v2-v1)==0){
    //             return "YES";
    //         }
    //         else{
    //             return "NO";
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(kangaroo(43,2,70,2));
    // }



    // public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    //     // Remove duplicates and sort in descending order
    //     Set<Integer> uniqueSet = new HashSet<>(ranked);
    //     List<Integer> uniqueList = new ArrayList<>(uniqueSet);
    //     Collections.sort(uniqueList, Collections.reverseOrder());
    //     System.out.println("uniqueList:"+uniqueList);
    //     List<Integer> result = new ArrayList<>();
    //     int index = uniqueList.size() - 1; // Start from the end for efficiency
    //     System.out.println("Intial Index:"+index);
    //     for (int score : player) {
    //         System.out.println("index:"+index+" >=0 "+"Score:"+score+" uniqueList[index]"+uniqueList.get(index));
    //         System.out.println();
    //         while (index >= 0 && score >= uniqueList.get(index)) {
    //             index--;
    //             System.out.println(index);
    //         }
    //         System.out.println(index+2);
    //         result.add(index + 2); // rank = index + 2 (because rank starts at 1)
    //     }
    
    //     return result;
    // }
    
    // public static void main(String[] args) {
    //     List<Integer> result = climbingLeaderboard(
    //         Arrays.asList(100, 100, 50, 40, 40, 20, 10),
    //         Arrays.asList(5, 25, 50, 120)
    //     );
    //     System.out.println(result); // Output: [6, 4, 2, 1]
    // }
    

    //Q)breaking
    // public static List<Integer> breakingRecords(List<Integer> scores) {
    //     // Write your code here
    //     ArrayList<Integer> hsa = new ArrayList<>();
    //     ArrayList<Integer> lsa = new ArrayList<>();
    //     Integer hs=scores.get(0);
    //     Integer ls=scores.get(0);
    //     for(int i=1;i<scores.size();i++){
    //         if(scores.get(i)>hs){
    //             hs=scores.get(i);
    //             hsa.add(scores.get(i));
    //         }
    //         if(scores.get(i)<ls){
    //             ls=scores.get(i);
    //             lsa.add(scores.get(i));
    //         }
    //     }
    //     List<Integer> list = new ArrayList<>();
    //     list.add(hsa.size());
    //     list.add(lsa.size());
    //     System.out.println(list);
    //     return list;
    //     }

    // public static void main(String[] args) {
    //     // List<Integer> arr = breakingRecords(Arrays.asList(10,5,20,20,4,5,2,25,1));
    //     List<Integer> arr = breakingRecords(Arrays.asList(3,4,21,36,10,28,35,5,24,42));
    // }


    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum,count=0;
        int mi=m;
        for(int i=0;i<s.size()-(m-1);i++){ 
            sum=0;
            for(int j=i;j<mi;j++){
                sum+=s.get(j);
            }
            if(d==sum){
                count+=1;
            }
            mi=mi+1;
        }
    return count;
        }

        public static void main(String[] args) {
            // int b = birthday(Arrays.asList(2,2,1,3,2), 4, 2);
            int b = birthday(Arrays.asList(1,2,1,3,2), 3, 2);
            // int b = birthday(Arrays.asList(1,1,1,1,1,1), 3, 2);
        }





  




/**
We define a magic square to be an  matrix of distinct positive integers from  to  where the sum of any row, column, or diagonal of length  is always equal to the same number: the magic constant.

You will be given a  matrix  of integers in the inclusive range . We can convert any digit  to any other digit  in the range  at cost of . Given , convert it into a magic square at minimal cost. Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range .

Example

$s = [[5, 3, 4], [1, 5, 8], [6, 4, 2]]

The matrix looks like this:

5 3 4
1 5 8
6 4 2
We can convert it to the following magic square:

8 3 4
1 5 9
6 7 2
This took three replacements at a cost of .

Function Description

Complete the formingMagicSquare function in the editor below.

formingMagicSquare has the following parameter(s):

int s[3][3]: a  array of integers
Returns

int: the minimal total cost of converting the input square to a magic square
Input Format

Each of the  lines contains three space-separated integers of row .

Constraints

Sample Input 0

4 9 2
3 5 7
8 1 5
Sample Output 0

1
Explanation 0

If we change the bottom right value, , from  to  at a cost of ,  becomes a magic square at the minimum possible cost.

Sample Input 1

4 8 2
4 5 7
6 1 6
Sample Output 1

4
Explanation 1

Using 0-based indexing, if we make

-> at a cost of 
-> at a cost of 
-> at a cost of ,
then the total cost will be .

Language
Java 15
More
12345678910111213141516171819202122232425262728
        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

Line: 57 Col: 1

Test against custom input

 */
}
