import java.util.Scanner;
class whileDraculs{
    public static void main(String[] args){
        int n,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number ");
        n= s.nextInt();
        int last=n%10;
        n=n/10;
        while(n>0){
            int lastNumber= n%10;
            sum= sum+lastNumber;
            n=n/10;
        }
        if(last == sum){
            System.out.println("This is a dracula number");
        }else{
            System.out.println("this is not a dracula number");
        }
    }
}
/*enter a number 
1235
this is not a dracula number
PS D:\java\loop> */