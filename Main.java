
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER THE CASE:");
        Scanner faa=new Scanner(System.in);
        String kam=faa.next();
        switch(kam){
    case "Apple" ->System.out.println("A red color fruit");
          
    case "Orange" ->System.out.println("A Red color fruit");
         
    case "Mango" ->System.out.println("A Yellow colored fruit");
         
    default -> System.out.println("It is not a fruit");
        }
    }
}