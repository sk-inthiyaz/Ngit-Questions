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

    public static boolean tresure(int[][] arr,int r,int c,int t){
        int li = 0;
        int ri =  r*c-1;
        while(li<=ri){
            int mid = (li+ri)/2;
            int midi = mid /c;
            int midj = mid%c;
            if(arr[midi][midj]==t){
                return true;
            }
            else if(arr[midi][midj]>t){
                ri=mid-1;
            }
            else if(arr[midi][midj]<t){
                li=mid+1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr= new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int r = 3,c=4,t=9;
        boolean b = tresure(arr,r,c,t);
        System.out.println(b);
    }
}
