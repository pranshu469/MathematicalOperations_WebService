package log4jdemo;
import java.io.IOException;
import java.util.InputMismatchException;

public class Mul
{
    static int x1=0,y1=0,z1=0,exc=0;
    public void mul() throws IOException
    {
       System.out.println("enter 2 operands");
       try{
           x1=Log4jDemo.sc.nextInt();
           y1=Log4jDemo.sc.nextInt();
           }
       catch(InputMismatchException e)
       {
            exc=100;
            System.out.println("operands must be integer");
        }
        
        if(exc!=100)
        {
            WebService object=new WebService();
            object.webservicefun();
        }
        else
        {
            System.out.println("error in operands");
        }
    }
}
