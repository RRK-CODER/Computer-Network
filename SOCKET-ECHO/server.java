import java.io.*;
import java.net.*;
class echoserver
{
public static void main(String args[]) throws IOException
{
Socket s=null;
ServerSocket ss=new ServerSocket(8000);
s=ss.accept();
System.out.println(s);
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream())
);
PrintWriter print=new PrintWriter(s.getOutputStream(),true);
String b1=br.readLine();
print.println(b1);
}
}
