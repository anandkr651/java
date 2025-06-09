// class student{

//     String name;
//     int std;
//     int roll;

//     void display(){
//         System.out.println("my name is "+name + ". my roll is " + roll + ". i study in "+ std + " class.");
//     }
// }
// public class staticKeyword{
//     public static void main(String args[]){
//         student s1 = new student();
//         s1.name = "anand";
//         s1.std = 1;
//         s1.roll= 4;

//         student s2 = new student();
//         s2.name = "raja";
//         s2.std = 1;
//         s2.roll= 5;

//         s1.display();
//         s2.display();
//     }
// }
/*my name is anand. my roll is 4. i study in 1 class.
my name is raja. my roll is 5. i study in 1 class. */

class student{

    String name;
    static int std;
    int roll;

    void display(){
        System.out.println("my name is "+name + ". my roll is " + roll + ". i study in "+ std + " class.");
    }
}
public class staticKeyword{
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "anand";
        // s1.std = 1;
        student.std =1;
        s1.roll= 4;

        student s2 = new student();
        s2.name = "raja";
        // s2.std = 3;
        student.std = 3;
        s2.roll= 5;

        // s1.std = 5;

        s1.display();
        s2.display();  
    }
}
/*my name is anand. my roll is 4. i study in 5 class.
my name is raja. my roll is 5. i study in 5 class.
PS D:\java\string>*/

/*my name is anand. my roll is 4. i study in 3 class.
my name is raja. my roll is 5. i study in 3 class.
PS D:\java\string> */