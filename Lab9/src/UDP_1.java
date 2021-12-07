import java.net.*; // Отправитель

import java.io.*;

class UDP_1 {

    private String host;

    private int port;

    UDP_1(String h, int p){
        host=h;
        port=p;
    }

    public void sendMessage(String msg){
        try{
            byte [] data = msg.getBytes();
            InetAddress addr = InetAddress.getByName(host);
            DatagramPacket pack = new DatagramPacket(data,data.length,addr,port);
            DatagramSocket ds = new DatagramSocket();
            ds.send(pack);
            ds.close();
        }catch(IOException e){
            System.err.println(e);
        }

    }

    public static void main(String[] args) {
        UDP_1 sndr = new UDP_1("localhost",1111);
        for (String arg: args)
            sndr.sendMessage(arg);
    }

}