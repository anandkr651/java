import java.util.Scanner;
class ifelseCheckVowel{
    public static void main(String[] args){
        char m;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the character");
        m= s.next().charAt(0);
        if(m=='a'|| m=='e'|| m=='i'|| m=='o' || m=='u'||m=='A'|| m=='E'|| m=='I'||m=='O'||m=='U'){
            System.out.println(m +" is a vowel");
        }else{
            System.out.println(m +" is a not vowel");
        }
    }
}
/*enter the character
y
y is a not vowel
PS D:\java\decision_making> */