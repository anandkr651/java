import java.util.Scanner;
class displayDay{
    public static void main(String[] args){
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number to display the day name");
        n= s.nextInt();
        switch(n){
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
            case 7:System.out.println("Saturday");break;
            default:System.out.println("Invalid day number");break;
        }
    }
}
/*enter a number to display the day name
7
Saturday
PS D:\java\switch> */