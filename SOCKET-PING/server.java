import java.io.*;
import java.net.*;
//import jdk.internal.org.jline.utils.InputStreamReader;
public class server {
 public static void main(String[] args) throws IOException{
 System.out.println("Waiting for clients");
 ServerSocket ss=new ServerSocket(8000);
 Socket s=ss.accept();
 BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
 String msg=br1.readLine();
 PrintWriter print=new PrintWriter(s.getOutputStream(),true);
 print.println(msg);
 }
 
}
