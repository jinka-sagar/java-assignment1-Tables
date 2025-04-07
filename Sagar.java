import java.util.Scanner;
public class Sagar{
    public static void main(String[] args) {
      Scanner marks=new Scanner(System.in);
      System.out.println("Enter Telugu Marks");
      int telugu=marks.nextInt();
      System.out.println("Enter Hindi Marks");
      int hindi=marks.nextInt();
      System.out.println("Enter English Marks");
      int english=marks.nextInt();
      System.out.println("Enter Maths Marks");
      int maths=marks.nextInt();
      System.out.println("Enter Science Marks");
      int science=marks.nextInt();
      System.out.println("Enter Social Marks");
      int social=marks.nextInt();
      int totalMarks=telugu+hindi+english+maths+science+social;
      System.out.println("the total marks is: "+totalMarks);
      if(totalMarks>=590 && totalMarks<=600){
        System.out.println("student passed in 1st class");
        System.out.println("Outstanding");
      }
      else if(totalMarks>=580 && totalMarks<=590){
        System.out.println("student passed in second class");
      }
      else if(totalMarks>=570 && totalMarks<580){
        System.out.println("student passed in 3rd class");
        System.out.println("good improve next time");
      }
      else if(totalMarks>=150 & totalMarks<570){
        System.out.println("student just passed");
        System.out.println("Bad Performance");
      }
      else{
        System.out.println("You are failed");
      }
    }
  }
 