import java.net.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;

class server {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {
        ServerSocket server = null;
        Socket socket;
        server = new ServerSocket(4000);
        System.out.println("Server Waiting for image");
        socket = server.accept();
        System.out.println("Client connected...");
        InputStream in = socket.getInputStream();
        DataInputStream dis = new DataInputStream(in);
        int len = dis.readInt();
        byte[] data = new byte[len];
        dis.readFully(data);
        dis.close();
        in.close();
        InputStream ian = new ByteArrayInputStream(data);
        BufferedImage bImage = ImageIO.read(ian);
        ImageIO.write(bImage, "jpg", new File("screencaptured.jpg"));
    }
}