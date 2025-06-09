import java.util.Scanner;


class demo {
    public int add(int c,int d){
        System.out.println("add two number ");
        return c+d;
    }
}

class calculator{
    public static void main(String arg[]){
        int a,b;
        Scanner s= new Scanner(System.in);
        System.out.println("enter two number");
        a= s.nextInt();
        b= s.nextInt();

        demo d1 = new demo();
        int result = d1.add(a,b);
        System.out.print(result);
        s.close();
    }
}
/*enter two number
5
9
add two number 
14
PS D:\java\oop\basic> */