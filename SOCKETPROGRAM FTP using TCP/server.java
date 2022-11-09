import java.io.*;
import java.net.*;
public class server {
 public static void main(String[] args)throws Exception{
 try{
 ServerSocket a = new ServerSocket(4333);
 Socket s1 =a.accept();
 FileInputStream f1 = new FileInputStream("D:/CSE/Semester 5/CN LAB/SOCKETPROGRAM FTP using TCP/hi.txt");
 byte b[]=new byte[3000];
 f1.read(b,0,b.length);
 OutputStream os = s1.getOutputStream();
 os.write(b,0,b.length);
 System.out.println("File sent successfully !");
 }
 catch(IOException e)
{
 System.out.println("Error"+e.getMessage());
}
}
}