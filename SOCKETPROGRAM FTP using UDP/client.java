import java.net.*;
import java.io.*;
public class client{
 public static void main(String args[]) throws Exception {
 byte b[] = new byte[3000];
 FileInputStream f = new FileInputStream("D:/CSE/Semester 5/CN LAB/SOCKETPROGRAM FTP using UDP/hi.txt");
 System.out.println("UDP file receiver");
 DatagramSocket dsoc = new DatagramSocket(2000);
 int i = 0;
 while (f.available() != 0) {
 b[i] = (byte) f.read();
 i++;
 }
 System.out.println("The file received successfully");
 f.close();
 dsoc.send(new DatagramPacket(b, i, InetAddress.getLocalHost(), 1000));
 }
}