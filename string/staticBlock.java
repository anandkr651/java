// class student{

//     String name;
//     static int std;
//     int roll;

//     static{  // it is called only one time.
//         std = 4;
//         System.out.println("i am in static");
//     }

//     student(){  // it can be called as the object is created.
//         name = "";
//         roll=1;
//         System.out.println("i am in constructor");
//     }
// }
// public class staticBlock{
//     public static void main(String args[]){
//         student s1 = new student();
//         s1.name = "anand";
//         student.std =1;
//         s1.roll= 4;

//         student s2 = new student();
//     }
// }
/*i am in static  //static block is always call first then constructor is called.
i am in constructor
i am in constructor
PS D:\java\string> */

//notes --> if object is not created the static block is not load.
class student{

    String name;
    static int std;
    int roll;

    static{  // it is called only one time.
        std = 4;
        System.out.println("i am in static");
    }

    student(){  // it can be called as the object is created.
        name = "";
        roll=1;
        System.out.println("i am in constructor");
    }
}
public class staticBlock{
    public static void main(String args[]) throws ClassNotFoundException{
        Class.forName("student");
    }
}
/*i am in static
PS D:\java\string> */