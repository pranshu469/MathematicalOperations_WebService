package log4jdemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;


public class Log4jDemo
{
    static Scanner sc;
    
    //static String path="C:\\Users\\Pranshu\\Documents\\NetBeansProjects\\13-06-19\\Log4jDemo\\src\\Log4jDemo.properties";
    static Properties p;
    static int a;
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        sc=new Scanner(System.in);
        System.out.println("enter the name of properties file");
         
        String path="C:\\Users\\Pranshu\\Documents\\NetBeansProjects\\13-06-19\\Log4jDemo\\src\\"+sc.nextLine()+".properties";   
        
        Add obj1=new Add();
        Sub obj2=new Sub();
        Mul obj3=new Mul();
        Div obj5=new Div();
        sc=new Scanner(System.in);
         
        p = new Properties();
        InputStream is=new FileInputStream(path);
        p.load(is);
         
        
        while(true)
        {
            System.out.println("enter input(for info press-0...for exiting press-10)");
                                 
            try{
                  sc=new Scanner(System.in);
                    a=sc.nextInt();
                }catch(InputMismatchException e){
                     System.out.println("not valid input");
                }
                 
                if(a!=10 && a!=1 && a!=2 && a!=3 && a!=4 && a!=0)
                {
                   System.out.println("wrong input ");
                }     
                if(a==10)
                {
                     break;
                }
            
                if(a==1)
                {
                    obj1.add();
                }
                if(a==2)
                {
                    obj2.sub();
                }
            
                if(a==3)
                {
                    obj3.mul();
                }
            
                if(a==4)
                {   
                    obj5.div();
                }
                if(a==0)
                {
                    System.out.println("1.  ADD");
                    System.out.println("2.  SUB");
                    System.out.println("3.  MUL");
                    System.out.println("4.  DIV");
                    System.out.println("10.  EXIT");
                }
           
        }
    }
}
