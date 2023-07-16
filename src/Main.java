import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] strArray = str.toCharArray();
        int aC=0;
        int combo=0;
        for(int i=0;i< strArray.length;i++){
            if(String.valueOf(strArray[i]).equals("A")){
                aC+=1;
            }else if(String.valueOf(strArray[i]).equals("G")){
                combo+=aC;
            }
        }
        System.out.println(combo);
    }
}