import java.util.Scanner;
class ifelseTwoNumber{
    public static void main(String[] args){
        int x,y,z;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the two number");
        x=s.nextInt();
        y=s.nextInt();
        if(x>y){
            z= x*y;
            System.out.println("the product of two number is "+ z);
        }else{
            z=x%y;
            System.out.println("the modulus of two number is "+z);
        }
        s.close();
    }
}
/*enter the two number
456
981
the modulus of two number is 456
PS D:\java\decision_making>  */