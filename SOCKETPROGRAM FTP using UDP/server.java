import java.io.*;
import java.net.*;
import java.util.*;
public class server {
 public static void main(String args[]) throws IOException {
 byte b[] = new byte[3072];
 DatagramSocket dsoc = new DatagramSocket(1000);
 System.out.println("UDP file sender");
 FileOutputStream f = new FileOutputStream("D:/CSE/Semester 5/CN LAB/SOCKETPROGRAM FTP using UDP/hi.txt");
 while (true) {
 DatagramPacket dp = new DatagramPacket(b, b.length);
 dsoc.receive(dp);
 System.out.println(new String(dp.getData(), 0, dp.getLength()));
 System.out.println("The file is sent successfully");
 }
 }
}