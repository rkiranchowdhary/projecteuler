import java.lang.reflect.Array;
import java.util.*;

public class Student {
    String arr[]=null;

    public static void main(String[] args) {

        //int x=0;
        String[] arr =new String[2];

        Scanner input = new Scanner (System.in);

        System.out.println("\t\t\tStudent Record Menu");

        System.out.println("\t\tEnter Student Details");

        int i=0;

        for(i=0;i<arr.length;i++) {
            System.out.println("Full name:");
            String name = input.next(); 

            Array.set(arr,  i, name);
            System.out.println("Age:");
            String age = input.next();
            Array.set(arr,  i, age);
            System.out.println("Course:");
            String course = input.next();
            Array.set(arr,  i, course);
            System.out.println("Year:");
            String year = input.next();
            Array.set(arr,  i, year);
            System.out.println("Section:");
            String section = input.next();
            Array.set(arr,  i, section);
        }     

        for(String s:arr){
            System.out.println("The Values are:"+s.valueOf(i));
        }
    }
}