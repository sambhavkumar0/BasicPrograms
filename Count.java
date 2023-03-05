import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            a=sc.nextInt();
            b=sc.nextInt();
        }
        int c=a+b;
        System.out.println(c);
    }
}
