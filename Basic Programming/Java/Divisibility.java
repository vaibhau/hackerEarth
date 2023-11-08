/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;

class isDivisible {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        
        int[] data = new int[n];
        for(int i=0; i<n; i++){
            data[i] = sc.nextInt();
        }

        
        // Write your code here
        String ans = "Yes";
        for(int i=0; i<n; i++){
            if(data[i] % 10 != 0)
                ans = "No";
            else
                ans = "Yes";
        }
        System.out.println(ans);
    }
}
