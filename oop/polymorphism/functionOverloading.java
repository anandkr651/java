class student{
    public void whichClass(){
        System.out.println("i am in stydy in cocas");
    }
    public void whichClass(int std){
        System.out.println("i am study in "+std+ " class");
    }
    public void whichClass(int std,int roll){
        System.out.println("i am study in "+std+ " class and my roll is "+roll);
    }
}

public class functionOverloading{
    public static void main(String args[]){
       student s1= new student();
       s1.whichClass();
       s1.whichClass(3);
       s1.whichClass(3,98);
    }
}
/*i am in stydy in cocas
i am study in 3 class
i am study in 3 class and my roll is 98
PS D:\java\oop\polymorphism>*/