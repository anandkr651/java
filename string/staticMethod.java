class student{

    String name;
    static int std;
    int roll;

    void display(){
        System.out.println("my name is "+name + ". my roll is " + roll + ". i study in "+ std + " class.");
    }
    public static void display1(){
        System.out.println("std : " + std);
    }
    // public static void display2(){
    //     System.out.println("std : " + std + "name : "+ name +" roll : "+ roll); // it give an error because i cannot access non-static variable in the static method.
    // }

    public static void display2(student s1){
        System.out.println("std : " + std + " name : "+ s1.name +" roll : "+ s1.roll); 
    }
}
public class staticMethod{
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "anand";
        student.std =1;
        s1.roll= 4;

        student s2 = new student();
        s2.name = "raja";
        student.std = 3;
        s2.roll= 5;

        s1.display();
        s2.display();
        
        // s1.display1(); //it can also work but it is not the best practise.
        student.display1();

        student.display2(s1);

    }
}
/*my name is anand. my roll is 4. i study in 3 class.
my name is raja. my roll is 5. i study in 3 class.
std : 3
std : 3 name : anand roll : 4
PS D:\java\string> */