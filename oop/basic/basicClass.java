class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write something");
    }
    public void penColor(){
        System.out.println("this is a "+this.color+" pen");
    }
}

public class basicClass{
    public static void main(String args[]){
       pen pen1 = new pen();
       pen1.color="blue";
       pen1.type="gel";
       pen1.write();
       pen1.penColor();

       pen pen2=new pen();
       pen2.color="red";
       pen2.type="ballPen";
       pen2.write();
       pen2.penColor();
    }
}
/*Write something
this is a blue pen
Write something
this is a red pen
PS D:\java\oop\basic>  */