


import java.util.Scanner;



// public class FunctionWithSyntax{
// public static void FunctionName(type parameter1, type parameter2) {
// statements or code
// }
//     public static void main(String[] args) {
// callback
//FunctionName(parameterValue1, parameterValue2)
//     }
// }

/*
for taking the input from the user we need to add 
**import java.util.Scanner;**
and in the main class or the function wee need to add
       ** Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();**



*/



public class FunctionWithSyntax {

    public static int AddSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int sum = AddSum(a, b);
        System.out.println(sum);

    }

}
