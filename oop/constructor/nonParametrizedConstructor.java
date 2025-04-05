class student{
    int std;
    int rollNo;
    student(){
        System.out.println("nonParametrizedConstructor call");
    }
    public void whichClass(){
        System.out.println("i am in "+std+" class");
    }
    public void roll(){
        System.out.println("my rollNo is "+rollNo);
    }
}

public class nonParametrizedConstructor{
    public static void main(String args[]){
       student s1= new student();
       s1.std=6;
       s1.rollNo=879;
       s1.whichClass();
       s1.roll();
    }
}
/*nonParametrizedConstructor call
i am in 6 class
my rollNo is 879
PS D:\java\oop\constructor> */