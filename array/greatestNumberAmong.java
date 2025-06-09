import java.util.Scanner;
class greatestNumberAmong{
    public static void main(String[] args){
        int m[]=new int[10],g;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the ten number");
        for(int i=0;i<10;i++){
            m[i]=s.nextInt();
        }
        g=m[0];
        for(int i=1;i<10;i++){
            if(g<m[i]){
                g=m[i];
            }
        }
        System.out.println(g+" is the greatest number among ten number");
        s.close();
    }
}
/*enter the ten number
34
565
1
4
7
5432
6667
2
0
6
6667 is the greatest number among ten number
PS D:\java\array> */