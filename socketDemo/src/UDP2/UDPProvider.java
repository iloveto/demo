package UDP2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPProvider {
    public static void main(String[] args) throws IOException {
        System.out.println("UDPProvider已经启动");
        //监听20000端口号
        DatagramSocket ds = new DatagramSocket(20000);
        final byte[] buf = new byte[512];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        ds.receive(datagramPacket);
        String ip = datagramPacket.getAddress().getHostAddress();
        int port = datagramPacket.getPort();
        int len = datagramPacket.getLength();
        String data = new String(datagramPacket.getData(), 0, len);
        System.out.println("data:"+data+" ip:"+ip+" port:"+port);
        String res = len+"";
        DatagramPacket resp = new DatagramPacket(res.getBytes(), res.length(), datagramPacket.getAddress(), datagramPacket.getPort());
        ds.send(resp);
        ds.close();
    }
}
