interface Animal{
    public void walk();
    // Animal()      //err
    // void eat(){}  //err
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