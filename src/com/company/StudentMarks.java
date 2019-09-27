import java.io.IOException;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of students");
            int numOfStudents = sc.nextInt();
            int[] stuGrades = new int[numOfStudents];
            for(int i=0;i<numOfStudents;i++)
            {
                System.out.println("Enter marks one by one");
                stuGrades[i] = sc.nextInt();
                if((stuGrades[i]>=0)&&(stuGrades[i]<=100)) continue;else{throw new IOException(" invalid grade");  }
            }




        }
}
