import java.util.*;
class factorialOfANumber{
    public static void factorial(int number){
        int s=1;
        for(int i=1;i<=number;i++){
           s=s*i;
        }
        System.out.println("factorial of a number "+s);
    }
    public static void main(String args[]){
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number ");
        n= s.nextInt();
        factorial(n);
    }
}
/*enter the number 
5
factorial of a number 120
PS D:\java\function> */