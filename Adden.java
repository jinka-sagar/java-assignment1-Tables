    import java.util.Scanner;
public class Adden {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
        sum();
        sum();
    }
        static void sum(){
           Scanner sa=new Scanner(System.in);
        System.out.println("enter num1 value: ");
        int num1=sa.nextInt();
        System.out.println("enter num2 value: ");
        int num2=sa.nextInt();
        System.out.println("enter num3 value: ");
        int num3=sa.nextInt();
        int sum=(num1+num2)*num3;
        System.out.println(sum);
        }
}
