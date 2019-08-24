
package log4jdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebService 
{
    static String action;
    static int paramX;
    static int paramY;
    public void webservicefun()
    {
        if(Log4jDemo.a==1)
        {paramX=Add.x1;paramY=Add.y1;   action="add";}
        if(Log4jDemo.a==2)
        {paramX=Sub.x1;paramY=Sub.y1;action="sub";}
        if(Log4jDemo.a==3)
        {paramX=Mul.x1;paramY=Mul.y1;action="mul";}
        if(Log4jDemo.a==4)
        {paramX=Div.x1;paramY=Div.y1;action="div";}
            
        try {
            	//change the uri after running  MathematicalOperationsRestWebService
		URL url = new URL("http://localhost:8084/RestJson_2//generic");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");
                
                StringBuilder input = new StringBuilder("{");
                input.append("\"x\":");
                //input.append(Add.x1);
                input.append(paramX);
                input.append(",");
                input.append("\"y\":");
                //input.append(Add.y1);
                input.append(paramY);
                input.append(",");
                input.append("\"action\":");
                input.append(action);
                input.append("}");
                
                OutputStream os = conn.getOutputStream();
		os.write(input.toString().getBytes());
		os.flush();
                BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		conn.disconnect();

            } catch (Exception e){
                System.out.println(e);
              } 
    }
   
    
}
