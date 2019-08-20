package log4jdemo;
import java.io.IOException;
import java.util.InputMismatchException;
import org.apache.log4j.Logger;

public class Div 
{
    private static final Logger logger=Logger.getLogger(Log4jDemo.class.getName());
     static int x1=0,y1=0,z1=0,exc=0;
    public void div() throws IOException
    {
       
        System.out.println("enter 2 operands");
        try
        {
            x1=Log4jDemo.sc.nextInt();
            y1=Log4jDemo.sc.nextInt();
        }
        catch(InputMismatchException e){
            exc=100;
            System.out.println("operands must be integer");
        }
        if(exc!=100)
        {
            if(y1!=0)
            {
                WebService object=new WebService();
                object.webservicefun();
            }
            else
            {
                logger.error("denominator can not be zero");
            }
        }
        else
            System.out.println("error in operands");
    }
}
