//this is wrong

// import java.util.Scanner;
// class greaterNumber{
//     public static void main(String[] args){
//         int x,y;
//         Scanner s= new Scanner(System.in);
//         System.out.println("enter the two number");
//         x=s.nextInt();
//         y=s.nextInt();
//         (x>y)?System.out.println(x+" is the greater number"):System.out.println(y+" is the grteater number");
//     }
// }

import java.util.Scanner;
class greaterNumber{
    public static void main(String[] args){
        int x,y;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the two number");
        x=s.nextInt();
        y=s.nextInt();
        System.out.println(x>y ? x+" is the greater number":y+" is the grteater number");
        s.close();
    }
}
/*enter the two number
8
4
8 is the greater number
PS D:\java\ternaryOperator> */