import java.util.Scanner;

public class Markparsentage {
    
    public static void main(String[] arg) {
        System.out.println("Calculating Percentage of Total Marks:--------------- ");
        System.out.println("TAking Input:---------------------------------------- ");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Total Marks: ");
        float TotalMarks = sc.nextInt();
            System.out.println("Enter the number 1st Subject MARKS: ");
            float a = sc.nextFloat();
            System.out.println("Enter the number 2nd Subject MARKS: ");
            float b = sc.nextFloat();
            System.out.println("Enter the number 3rd Subject MARKS: ");
            float c = sc.nextFloat();
            System.out.println("Enter the number 4th Subject MARKS: ");
            float d = sc.nextFloat();
            System.out.println("Enter the number 5th Subject MARKS: ");
            float e = sc.nextFloat();
            System.out.print("Marks Obtained in all Subjects: ");
            float sum = (a + b + c + d + e);
            System.out.println(sum);
            System.out.print("Out of : ");
        System.out.println(TotalMarks);
                System.out.print("Total Percent is: ");
                float percentage = sum * 100 / TotalMarks;
        System.out.println(percentage+"%");
    
        }
        
        
    }
}
