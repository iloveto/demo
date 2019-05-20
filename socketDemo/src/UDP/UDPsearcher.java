package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.SocketException;

public class UDPsearcher {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //请求
        byte[] buf = "hello".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        datagramPacket.setAddress(Inet4Address.getLocalHost());
        datagramPacket.setPort(20000);
        //发送
        ds.send(datagramPacket);

        //接收实体
        final byte[] receiveBuf = new byte[512];
        DatagramPacket reveivePack = new DatagramPacket(receiveBuf, receiveBuf.length);
        //接收
        ds.receive(reveivePack);
        String ip = datagramPacket.getAddress().getHostAddress();
        int port = datagramPacket.getPort();
        int len = datagramPacket.getLength();
        String data = new String(datagramPacket.getData(), 0, len);
        System.out.println("data:"+data+" ip:"+ip+" port:"+port);

        ds.close();
    }
}
