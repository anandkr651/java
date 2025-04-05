class shape{
    int l,b;
    String color;
}
class rec extends shape{
    int areaRec;
    public void calculateArea(){
        areaRec= l*b;
    }
    public void area(){
        System.out.println("the area of the rectangle is "+areaRec);
    }
}
class display extends shape{
    public void recColor(){
        System.out.println("the color of the rectangle is "+color);
    }
}

public class hierarchicalinheritance{
    public static void main(String args[]){
        display r1= new display();
        rec r2= new rec();
        r2.l=5;
        r2.b=7;
        r2.calculateArea();
        r2.area();
        r1.color="blue";
        r1.recColor();
    }
}
/*the area of the rectangle is 35
the color of the rectangle is blue
PS D:\java\oop\inheritance> */