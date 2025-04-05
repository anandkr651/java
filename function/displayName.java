import java.util.*;
public class displayName{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        System.out.println("enter your name");
        Scanner s= new Scanner(System.in);
        String name=s.next();
        printMyName(name);
    }   
}
/*enter your name
anand kumar
anand
PS D:\java\function> */