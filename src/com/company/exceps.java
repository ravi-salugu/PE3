package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exceps {
    public static void main (String[] args)
    {



        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1 for NegativeArraySizeException, 2 for IndexOutOfBoundsException, 3 for NullPointerException blocks execution");
            int r=sc.nextInt();
            switch (r){

                case 1: int[] arr = new int[-2];break;
                case 2: String[] fruit = {"Apple", "Banana", "Orange", "Grapes"};
                        String s=fruit[7]; break;

                case 3: String[] str=null;
                        System.out.println(str[0]);break;

                default:
                        System.out.println("Check again");break;
            }


        }

        catch(NegativeArraySizeException ne)
        {
            System.out.println("NegativeArraySizeException,  exception caught in catch block");
        }
        catch (IndexOutOfBoundsException iee)
        {
            System.out.println("IndexOutOfBoundsException, exception caught in catch block");
        }
        catch (NullPointerException np)
        {
            System.out.println("NullPointerException exception caught in catch block");
        }


        finally
        {
            System.out.println("finally block executed");
        }

        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}
