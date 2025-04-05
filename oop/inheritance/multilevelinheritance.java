class shape{
    int l,b;
}
class rec extends shape{
    int areaRec;
    public void calculateArea(){
        areaRec= l*b;
    }
}
class display extends rec{
    public void area(){
        System.out.println("the area of the rectangle is "+areaRec);
    }
}

public class multilevelinheritance{
    public static void main(String args[]){
        display r1= new display();
        r1.l=5;
        r1.b=7;
        r1.calculateArea();
        r1.area();
    }
}
/*the area of the rectangle is 35
PS D:\java\oop\inheritance> */