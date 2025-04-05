class student{
    int std;
    int rollNo;
    student(){
        System.out.println("zero argument Constructor call");
    }
    student(student s2){
        System.out.println("copyConstructor call");
        std=s2.std;
        rollNo=s2.rollNo;
    }
    public void whichClass(){
        System.out.println("i am in "+std+" class");
    }
    public void roll(){
        System.out.println("my rollNo is "+rollNo);
    }
}

public class copyConstructor{
    public static void main(String args[]){
       student s1= new student();
       s1.std=7;
       s1.rollNo=87;
       s1.whichClass();
       s1.roll();

        student s2= new student(s1);
        s2.whichClass();
        s2.roll();

    }
}
/*zero argument Constructor call
i am in 7 class
my rollNo is 87
copyConstructor call
i am in 7 class
my rollNo is 87
PS D:\java\oop\constructor>
*/