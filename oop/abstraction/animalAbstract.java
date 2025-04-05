// class Animal{
//    public void walk(){
//         System.out.println("walk");
//     }
// }
// class Horse extends Animal{
//     public void walk(){
//         System.out.println("horse can walk on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("chicken can walk on 2 legs");
//     }
// }
// public class animalAbstract{
//     public static void main(String args[]){
//        Horse horse = new Horse();
//        horse.walk();
//     }
// }
/*horse can walk on 4 legs
PS D:\java\oop\abstraction> */


abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("horse can walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("chicken can walk on 2 legs");
    }
}
public class animalAbstract{
    public static void main(String args[]){
       Horse horse = new Horse();
       horse.walk();
    }
}
/*horse can walk on 4 legs
PS D:\java\oop\abstraction>*/