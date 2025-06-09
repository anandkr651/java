public class buffer{
    public static void main(String args[]){
        StringBuffer c1 = new StringBuffer();
        System.out.println(c1.capacity());

        StringBuffer s1 = new StringBuffer("navin");
        s1.append(" reddy");
        System.out.println(s1);

        s1.insert(6,"java ");
        System.out.println(s1);

        // String s2 = s1;  //error
        // System.out.println(s2);

        String s2 = s1.toString();
        System.out.println(s2);

        s1.deleteCharAt(2);
        System.out.println(s1);

        s1.setLength(11);
        System.out.println(s1);

    }
}
/*16
navin reddy
navin java reddy
navin java reddy
nain java reddy
nain java r
PS D:\java\string>*/