import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1=0, n2=0; //איתחול המשתנים
        int bigNum=0, smallNum=0;
        int diff=0;
        int pairs = 0;

        boolean isNegative = false;

        while(pairs<20 && isNegative==false && diff!=1){
            System.out.println("enter 1st numbere");
            n1 = s.nextInt();
            System.out.println("enter 2nd numbere");
            n2 = s.nextInt();
            pairs++;

            bigNum = Math.max(n1, n2);
            smallNum = Math.min(n1, n2);
            diff = bigNum -smallNum;
            System.out.println("the diff is :"+diff);

            if(n1<0 || n2<0)
                isNegative=true;
        }
        System.out.println(pairs);
    }
}