import java.util.*;
import java.util.LinkedList;
import java.util.List;

public class midelement
{
  public static void main(String[] args) 
  {  Scanner s= new Scanner(System.in);
  int n=s.nextInt();
	List names = new LinkedList();
	for(int i=0;i<n;i++)
	{
       int b=s.nextInt();
        names.add(b);
	}
	
	   	System.out.println("LinkedList content: " + names. get(n/2));
	
	
  }
}
