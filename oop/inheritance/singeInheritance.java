class shape{
    int l,b;
}
class rec extends shape{
    public void area(){
        System.out.println("the area of the rectangle is "+l*b);
    }
}

public class singeInheritance{
    public static void main(String args[]){
        rec r1= new rec();
        r1.l=5;
        r1.b=7;
        r1.area();
    }
}
/*the area of the rectangle is 35
PS D:\java\oop\inheritance> */