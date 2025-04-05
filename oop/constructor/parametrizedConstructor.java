class student{
    int std;
    int rollNo;
    student(int a,int b){
        System.out.println("parametrizedConstructor call");
        std=a;
        rollNo=b;
    }
    public void whichClass(){
        System.out.println("i am in "+std+" class");
    }
    public void roll(){
        System.out.println("my rollNo is "+rollNo);
    }
}

public class parametrizedConstructor{
    public static void main(String args[]){
       student s1= new student(3,87);
       s1.whichClass();
       s1.roll();
    }
}
/*parametrizedConstructor call
i am in 3 class
my rollNo is 87
PS D:\java\oop\constructor>*/