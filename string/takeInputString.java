import java.util.Scanner;
class takeInputString{
    public static void main(String[] args){
        String s2;
        String s1= new String();
        Scanner s= new Scanner(System.in);
        System.out.println("enter the string");
        s2= s.nextLine();
        s1=s.nextLine();
        System.out.println("display the string ");
        System.out.println(s2);
        System.out.println(s1);
    }
}
/*enter the string
anand bhagat
raja babu
display the string 
anand bhagat
raja babu
PS D:\java\string> */