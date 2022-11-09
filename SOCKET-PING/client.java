import java.io.*;
import java.net.*;
//import jdk.internal.org.jline.utils.InputStreamReader;
public class client {
 
 public static void main(String[] args) throws IOException{
 long t1,t2;
 Socket s=new Socket("localhost",8000);
 System.out.println("enter a string");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in))
;
 String message=br.readLine();
 PrintWriter print=new PrintWriter(s.getOutputStream(),true);
 t1=System.currentTimeMillis();
 print.println(message);
 
 BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
 String str=br1.readLine();
 t2=System.currentTimeMillis();
 System.out.println("Pinging from"+s.getInetAddress()+ "with string "+message);
  System.out.println("Reply from"+s.getInetAddress()+ "with string "+str+ "of length"+ str.length());
  System.out.println("sent"+message.length()+"received:"+str.length()+"lost:"+(message.length()-str.length()));
  System.out.println("Time Taken :"+(t2-t1));
  }
 }
 