// class human {
//     // int age =11;
//     // String name = "anand";

//     private int age = 11;
//     private String name = "anand";

//         public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setAge(int a) {
//         age = a;
//     }

//     public void setName(String b) {
//         name = b;
//     }
// }

// public class demo {
//     public static void main(String args[]) {
//         human h1 = new human();

//         // System.out.println(h1.name + " : "+h1.age); //error

//         h1.setName("ankit");
//         h1.setAge(17);

//         System.out.println(h1.getName() + " : " + h1.getAge());
//     }
// }
/*ankit : 17
PS D:\java\oop\encapulation>*/


//notes --> right click goto source action then click to generate getter and setter option click it. automatically code written.
class human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class demo {
    public static void main(String args[]) {
        human h1 = new human();

        h1.setName("ankit");
        h1.setAge(17);

        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}
/*ankit : 17
PS D:\java\oop\encapulation>*/