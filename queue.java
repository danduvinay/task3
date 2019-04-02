import java.io.*;
import java.util.*;

public class queue
{
   public static int [] queue=new int[9999999];
   public static int front = - 1, rear = - 1;
   public static void Insert(int val)
 {
      if (front == - 1)
          front = 0;
      rear++;
      queue[rear] = val;
  }
public static void Delete() 
{
   front++;
}
public static void Display()
 {
      for (int i = front; i <front+1; i++)
         {
             System.out.println(queue[i]);
          }
      
}

  public static void main(String[] args) 
   {
      Scanner s=new Scanner(System.in);
     int ch,n;
     n=s.nextInt();
     for(int i=0;i<n;i++)
      {
        ch=s.nextInt();
           switch (ch) 
            {
              case 1: int val=s.nextInt();
                      Insert(val);
                       break;
              case 2: Delete();
                      break;
     	      case 3: Display();
        	       break;
             }
   
        }

    }
}

