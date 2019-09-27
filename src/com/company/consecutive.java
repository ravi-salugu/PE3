import java.util.Scanner;
import java.util.Arrays;
public class consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers followed by commas");
        String str=sc.nextLine();
        String[] arrOfStr = str.split(",");
        int[] numbers = new int[arrOfStr.length];
        for(int i=0;i<arrOfStr.length;i++)
            {
                numbers[i]=Integer.parseInt(arrOfStr[i]);

            }
            Arrays.sort(numbers);
        int flag=0;
        for(int i=0;i<arrOfStr.length-1;i++)
        {
            if(numbers[i]==numbers[i+1]) flag++;

        }
        if((numbers[numbers.length-1]==numbers[0]+numbers.length-1)&&(flag==0)) System.out.println(str+" are consecutive numbers");
        else System.out.println(str +" are not consecutive numbers");



            }
    }