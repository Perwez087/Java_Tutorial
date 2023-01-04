package Array_Practice;
import java.util.Arrays;
public class Ques_1 {
    public static void main(String[] args) {
        // Write a Java program to sort a numeric array and a string array?

        int [] array1={101,105,102,104,103};
        String [] array2={"Java","C++","CPP","Python","C"};

        System.out.println("Original array are :"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted Numeric array are :"+Arrays.toString(array1));

        System.out.println("Original String are :"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String are :"+Arrays.toString(array2));

    }
}
