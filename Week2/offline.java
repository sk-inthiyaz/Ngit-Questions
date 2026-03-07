import java.util.Scanner;

class offline{
    //Question:Square of the matrix
    // public static void main (String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt(),n=sc.nextInt();
    //     int arr[][]= new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print(arr[i][j]*arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //question2:
    /*Left diagonal elements print
    input=
    3
    1 2 3
    4 5 6
    7 8 9
    output=
    1 5 9
    */
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt();
    //     int arr[][]= new int[m][m];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             if(i==j){
    //                 System.out.print(arr[i][j]+" ");
    //             }
    //         }
    //     }

    // }


    // Quetion3:
    /*Right diagonal elements print
        input=
        3
        1 2 3
        4 5 6
        7 8 9
        output=
        3 5 7
        */
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt();
    //     int arr[][]= new int[m][m];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             if((i+j)==m-1){
    //                 System.out.print(arr[i][j]+" ");
    //             }
    //         }
    //     }
    // }

    // Quetion:
    /*Left diagonal sum and Right diagonal sum
    input=
    3
    1 2 3
    4 5 6
    7 8 9
    output=
    Left diagonal sum = 15
    Right diagonal sum = 15
    Diagonals Sum = 30
    */
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt(),leftdsum=0,rightdsum=0,totalsum;
    //     int arr[][]= new int[m][m];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<m;j++){
    //             if((i+j)==m-1){
    //                 rightdsum = rightdsum+arr[i][j];
    //             }
    //             if(i==j){
    //                 leftdsum = leftdsum+arr[i][j];
    //             }
    //         }
    //     }
    //     totalsum = rightdsum+leftdsum;
    //     System.out.println("Left diagonal sum = "+leftdsum);
    //     System.out.println("Right diagonal sum = "+rightdsum);
    //     System.out.println("Diagonals Sum = "+totalsum);

    // }


    //Quetion:
    /*
    2D Array RowPower
    input=
    3 3
    6 7 3
    4 5 6
    7 8 9
    output=
    1 1 1
    4 5 6
    49 64 81

    input=
    2 3
    4 5 6
    7 8 9
    output=
    1 1 1
    7 8 9
    */
    // public static void main (String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt(),n=sc.nextInt();
    //     double arr[][]= new double[m][n];
    //     double x;
    //     int s;
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }

    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             x = arr[i][j];
    //             x = Math.pow(x, i);
    //             arr[i][j]=x;
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             s=(int)arr[i][j];
    //             System.out.print(s+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    //Quetion:
    /* Print Matrix Transpose
    case=1
    input=
    3 3
    1 2 3
    4 5 6
    7 8 9
    output=
    1 4 7
    2 5 8
    3 6 9
    case=2
    input=
    3 2
    1 2
    4 5
    7 8
    output=
    1 4 7
    2 5 8
    */
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int m=sc.nextInt(),n=sc.nextInt();
    //     int arr[][]= new int[m][n];
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.print(arr[j][i]+" ");
    //         }
    //         System.out.println();
    //     }

    // }

    //Quetion:
    /*Linear Search
    input=
    3
    1 9 8
    8
    output=
    Yes

    input=
    3
    1 9 8
    5
    output=
    No
    */
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int f =0;
//     int arr[]= new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//     }

//     int s = sc.nextInt();
//     for(int i=0;i<n;i++){
//         if(s==arr[i]){
//             f=1;
//         }
//     }
//     if(f==1){
//         System.out.println("Yes");
//     }
//     else{
//         System.out.println("No");
//     }
// }

//Quetion
/*SortingArrayElements both in ascending and descending orders. 
ascending (print in a method) and 
descending order(print in constructor)
input=
8
1 9 8 2 6 4 3 7
output=
1 2 3 4 6 7 8 9
9 8 7 6 4 3 2 1
*/
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int temp;
    //     for(int i=1;i<n;i++){
    //         for(int j=0;j<n-i;j++){
    //             if(arr[j+1]<arr[j]){
    //                 temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    //     for(int i=n-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }



/**
 Quetion:/*
Radha is willing to print a set of * in a square box.
Help Radha to do it.
input=3
* * *
* * *
* * *

*/

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }



/*
John is playing with # dots game in ascending order.
Help him to print a set of # accordingly.
input=3
#
# # 
# # #

*/
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print("# ");
//         }
//         System.out.println();
//     }
// }


/*
Krishna is playing with numbers game in ascending order.
Help him to print accordingly.
input=3
output=
1
2 2
3 3 3
*/
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }
// }




/*
Hari wants to construct a staircases pattern using the ′#’ symbol. 
He is very busy at CRT training. Your task is to help Hari 
to print this staircase pattern as shown below.
input=5
output=
    #
   ##
  ###
 ####
#####
*/

// public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         int i,j;
//         int n = sc.nextInt();
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n;j++){
//                 if((i+j)<(n+1)){
//                     System.out.print("   ");
//                 }
//                 else{
//                     System.out.print(" * ");
//                 }
//             }
//             System.out.println();
//         }
// }


/*
Rafiq is playing with characters game in ascending order.
Help him to print accordingly.
input=3
output=
A
B B
C C C
*/
// public static void main(String[] args) {
//     int n,i,j,ch;
//     Scanner sc = new Scanner(System.in);
//     n=sc.nextInt();
//     for(i=1;i<=n;i++){
//         ch=65;
//         for(j=1;j<=i;j++){
//         System.out.printf("%c ",ch);
//         ch++;
//         }
//         System.out.println();
//         }
// }



/*
Varun is willing to play with a square box of #'s. 
Now its your turn to help him to build that square box

input=4
output=
# # # #
# # # #
# # # #
# # # #

*/
// public static void main(String[] args) {
//     Scanner  sc = new Scanner(System.in);
//         int i,j;
//         int n = sc.nextInt();
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n;j++){
//                 System.out.print("# ");
//             }
//             System.out.println();
//         }
// }


/*
Varun wants to design a Left Triangle Pattern.Let’s help him by accepting a number.

Input:
5
Output: 
           *
         * *
       * * *
     * * * *
   * * * * *
   
*/

// public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         int i,j;
//         int n = sc.nextInt();
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n;j++){
//                 if((i+j)<(n+1)){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
// }


/*
Sudheer wants to design a pyramid of stars.
Let’s help him by accepting a number.

Input:
3
Output: 
  *
 * *
* * *

*/
// public static void main(String[] args){
//     Scanner  sc = new Scanner(System.in);
//     int i,j,s;
//     int n = sc.nextInt();
//     for(i=1;i<=n;i++){
//             for(s=1;s<=(n-i);s++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=((2*i)-1);j++){
//                 if(((j)%2)!=0){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//         System.out.println();
// }
//     sc.close();
// }





/*
Masha is playing in a hollow square box, can you print it now.

Testcase:
8
output=
* * * * * * * *
*             *
*             *
*             *
*             *
*             *
*             *
* * * * * * * *
*/
// public static void main(String[] args) {
//     int n,i,j;
//     Scanner sc = new Scanner(System.in);
//     n=sc.nextInt();
//     for(j=1;j<=n;j++){
//         for(i=1;i<=n;i++){
//             if((i==1 || j==1) || (i==n ||j==n))
//             System.out.print("* ");
//             else {
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }
// }



/*
Arun wants to design a reverse Right Triangle Star Pattern.Let’s help him
by accepting a number.
Input:
3
OUTPUT:
* * *
* *
*
*/

// public static void main(String[] args) {
//     Scanner  sc = new Scanner(System.in);
//     int i,j;
//     int n = sc.nextInt();
//     for(i=1;i<=n;i++){
//         for(j=i;j<=n;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }


/*
Varun wants to design a reverse Left Triangle Pattern.Let’s help him by accepting a number.
Input:
5
Output: 
   * * * * * 
     * * * *
       * * *
         * *
           *
*/

// public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         int i,j;
//         int n = sc.nextInt();
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n;j++){
//                 if(i>j){
//                     System.out.print("  ");
//                 }
//                 else{
//                     System.out.print("* ");
//                 }
//             }
//             System.out.println();
//         }
// }

/*
Write a java program to check whether the given number is 
divisible by 3 or not using a method

input=6
output=Yes

input=64
output=No
*/

// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n =sc.nextInt();
//   if(n%3==0){
//     System.out.println("Yes");
//   }
//   else{
//     System.out.println("No");
//   }
// }

/*Practice program to display 3 different methods messages
Note - Use 3 different method declarations

if val=1 method1 message - Hello
if val=2 method2 message - Welcome
else method3 message - Hello World

input=1
output=Hello

input=2
Welcome

input=5
Hello World
*/


// public static void  method1(){
//   System.out.println("Hello");
// }
// public static void  method2(){
//   System.out.println("Welcome");
// }
// public static void  method3(){
//   System.out.println("Hello World");
// }

// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     if(n==1){
//       method1();
//     }
//     else if(n==2){
//       method2();
//     }
//     else{
//       method3();
//     }
// }


/*
Radha wants to check square of the given number. Help her to print it.
input=5
output=
Value method square= 25
*/
// public static int square(int n){
//   return n*n;
// }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n =sc.nextInt();
//   System.out.println(square(n));
// }



/*
Harsha wants to print math table of the given number. 
Print it by using a method in a another class.
input=8
output=
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
*/
// public static void table(int n){
//   int i;
//   for(i=1;i<=10;i++){
//     System.out.printf("%d * %d = %d\n",n,i,n*i);
//   }
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//   int n =sc.nextInt();
//   table(n);
// }



/*
Finding sum and average of a given list of numbers.
input=
5
12 25 36 42 58
Output=
Sum=173
Avg=34.6
*/


// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n=sc.nextInt();
//   int sum=0;
//   int arr[]=new int[n];
//   for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//   }
//   for(int i=0;i<n;i++){
//     sum+=arr[i];
//   }
//   double ssum = (double)sum;
//   double avg = ssum/n;
//   System.out.println("Sum="+sum);
//   System.out.println("Avg="+avg);

// }

/*
Finding smallest and largest in a given list of numbers.
input=
8
55 22 77 11 88 99 33 44
output=
Min=11
Max=99
*/
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n=sc.nextInt();
//   int sum=0;
//   int arr[]=new int[n];
//   for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//   }
//   int min=arr[0];
//   int max=arr[0];
//   for(int i=1;i<n;i++){
//     if(max<arr[i]){
//       max=arr[i];
//     }
//     if(min>arr[i]){
//       min=arr[i];
//     }
//   }
//   System.out.println("Min="+min);
//   System.out.println("Max="+max);
// }



/*
Find the sum of indexes of even elements of a given array. if no even value print -1.
input=
6
1 8 2 6 5 3
output=
SEI=6
*/
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n=sc.nextInt();
//   int sum=0;
//   int arr[]=new int[n];
//   for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//   }
//   for(int i=0;i<n;i++){
//     if(arr[i]%2==0){
//       sum+=i;
//     }
//   }
//   System.out.println("SEI="+sum);
// }


/*
Find a number in an array which is multiple of 3, 
then square their indices and display.
if no such element print -1
input=
6
1 9 2 6 5 3
output=
35

input=
5
1 7 5 2 8
output=
-1
*/

// public static void main(String[] args) {
  
// }

/*
Program to merge two given arrays and display resultant array.
input=
6 4
1 9 2 6 5 3
4 7 15 8
output=
1 9 2 6 5 3 4 7 15 8
*/

// public static void main(String[] args) {
//   int n,m;
//   Scanner sc = new Scanner(System.in);
//   n=sc.nextInt();
//   m=sc.nextInt();
//   int arr1[]=new int[n];
//   int arr2[]=new int[m];
//   int arr3[]=new int[n+m];
//   for(int i=0;i<n;i++){
//     arr1[i]=sc.nextInt();
//   }
//   for(int i=0;i<m;i++){
//     arr2[i]=sc.nextInt();
//   }
//   for(int i=0;i<n;i++){
//     arr3[i]=arr1[i];
//   }
//   for(int i=0;i<m;i++){
//     arr3[n+i]=arr2[i];
//   }
//   for(int i=0;i<m+n;i++){
//     System.out.print(arr3[i]+" ");
//   }
  

// }



/*
Array - Print only elements having k as one digit.
input=
5
28 95 68 25 44
8
output=
28 68
*/
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int k;
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  k=sc.nextInt();
  for(int i=0;i<n;i++){
    if(arr[i]%10==k){
      System.out.print(arr[i]+" ");
    }
  }

}


}