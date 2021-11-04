import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev = a + b;
            System.out.print(prev + " ");
            for(int j = 1; j < n; j++){
                b *= 2;
                System.out.print(prev + b + " ");
                prev += b;
            }
            System.out.println();
        }
        in.close();
        
    }
}
