import java.io.*;
import java.net.*;
public class client
{
public static void main(String args[]) throws IOException
{
 Socket s=new Socket("localhost",8000);
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 PrintWriter print=new PrintWriter(s.getOutputStream(),true);
 BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
 String msg="";
 while(!msg.equals("stop")){
 System.out.println("Enter your message");
 msg=br.readLine();
 print.println(msg);
 String smsg=br1.readLine();
 System.out.println("Message from server:"+smsg);
 }
} }