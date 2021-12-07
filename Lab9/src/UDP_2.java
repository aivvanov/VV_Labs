import java.net.*; // получатель

import java.io.*;

class UDP_2 {

    public static void main(String [] args){
        try {
            DatagramSocket ds = new DatagramSocket(1111);
            while(true){
                DatagramPacket pack = new DatagramPacket(new byte [1024],1024);
                ds.receive(pack);
                System.out.println(new String (pack.getData()).trim());
            }
        } catch(Exception e) {
            System.err.println(e);
        }
    }
}