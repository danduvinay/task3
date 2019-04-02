import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sparsearrays {
 public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String[] st=new String[100000];
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
          st[i]= s.next();
        }
        int m=s.nextInt();
        for(int j=0;j<m;j++)
        { int count=0;
            String ss=s.next();
            for(int i=0;i<n;i++)
            {
                if((ss.compareTo(st[i]))==0)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
