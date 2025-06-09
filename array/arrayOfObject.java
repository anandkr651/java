class student{
    int roll;
    String name;
    int marks;
}

public class arrayOfObject{
    public static void main(String args[]){
        student s1 = new student();
        s1.roll = 1;
        s1.name = "anand";
        s1.marks = 67;

        student s2 = new student();
        s2.roll = 2;
        s2.name = "raja";
        s2.marks = 87;

        student s3 = new student();
        s3.roll = 3;
        s3.name = "ankit";
        s3.marks = 98;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++){
            System.out.println("my name is "+ students[i].name + ". my roll number is "+ students[i].roll);
        }

        for(student stud : students){
            System.out.println(stud.name +" : " + stud.marks);
        }
    }
}
/*my name is anand. my roll number is 1
my name is raja. my roll number is 2
my name is ankit. my roll number is 3
anand : 67
raja : 87
ankit : 98
PS D:\java\array>  */