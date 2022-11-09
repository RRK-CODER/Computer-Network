import java.io.*;
import java.net.*;
public class server
{
public static void main(String args[])throws Exception
{
 System.out.println("Waiting for clients");
 ServerSocket ss=new ServerSocket(8000);
 Socket s=ss.accept();
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 PrintWriter print=new PrintWriter(s.getOutputStream(),true);
 BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
 String msg="";
 while(!msg.equals("stop")){
 String cmsg=br1.readLine();
 System.out.println("Message from client:"+cmsg);
 System.out.println("Enter your message");
 msg=br.readLine();
 print.println(msg);
 
 }
}
}