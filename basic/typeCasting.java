import java.util.Scanner;
class typeCasting{
    public static void main(String args[]){
        byte n;
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        n=s.nextByte();
        System.out.println("byte is "+n);

        int a;
        a=n;
        System.out.println("number is "+a);


        int b;
        System.out.println("enter the number");
        b=s.nextInt();
        System.out.println("number is "+b);

        byte c;
        // c=b;  //error: incompatible types: possible lossy conversion from int to byte
        c = (byte)b;
        System.out.println("Byte is "+c);
        s.close();
    }
}
/*enter the number
55
byte is 55
number is 55
enter the number
222
number is 222
Byte is -34
PS D:\java\basic> */