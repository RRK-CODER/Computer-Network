import java.io.*;
import java.net.*;
public class client {
 
 public static void main(String[] args) throws Exception {
 // TODO code application logic here
 try{
 byte[] b = new byte[3000];
 Socket s = new Socket("localhost",4333);
 InputStream is = s.getInputStream();
 FileOutputStream f = new FileOutputStream("D:/CSE/Semester 5/CN LAB/hi.txt");
 is.read(b,0,b.length);
 f.write(b,0,b.length);
 System.out.println("File saved successfully !");
 }
 catch(IOException e){
 System.out.println("Error "+e);
 }
 } }
