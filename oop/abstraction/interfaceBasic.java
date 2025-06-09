interface Animal{
    public void walk();

    //note --->interface abstract methods cannot have body
    // public void walk(){
    //     System.out.println("anima can walk on 4 legs");
    // }
}
interface Herbivour{
}
class Horse implements Animal,Herbivour{
    public void walk(){
        System.out.println("horse can walk on 4 legs");
    }
}
public class interfaceBasic{
    public static void main(String args[]){
       Horse horse = new Horse();
       horse.walk();
    }
}