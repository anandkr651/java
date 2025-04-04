import java.util.Scanner;
class nestedifGreatestNumber{
    public static void main(String[] args){
        int x,y,z;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the three number");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if(x>y){
            if(x>z){
               System.out.println(x+" is the greatest number"); 
            }else{
                System.out.println(z+" is the greatest number");
            }
        }else{
            if(y>z){
               System.out.println(y+" is the greatest number");  
            }else{
                System.out.println(z+" is the greatest number"); 
            }
        }
    }
}
/*enter the three number
5  
7
1
7 is the greatest number
PS D:\java\decision_making> */