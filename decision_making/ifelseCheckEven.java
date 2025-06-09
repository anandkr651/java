import java.util.Scanner;
class ifelseCheckEven{
    public static void main(String[] args){
        int n;
        System.out.println("enter a number");
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        if(n%2==0){
            System.out.println(n +" is even number");
        }else{
              System.out.println(n +" is odd number");
        }
        s.close();
    }
}
/*enter a number
23
23 is odd number
PS D:\java\decision_making> */