public class array2DDemo{
    public static void main(String args[]){
        int num[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("display the number");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
/*display the number
26 66 75 91 
85 27 81 2
36 39 42 41
PS D:\java\array>  */