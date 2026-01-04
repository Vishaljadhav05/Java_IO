package InputStream_And_OutputStream_Classes;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            //Used to read primitive data from input stream
            DataInputStream dis = new DataInputStream(null);
            dis.readInt();
            dis.read(null);
            dis.readInt();
            dis.readAllBytes();
            dis.readBoolean(); 
            //etc...

            //Used to write primitive data from input stream
            DataOutputStream dos = new DataOutputStream(null);
            dos.writeInt(0);
            dos.writeUTF(null);
            dos.writeLong(0);
            dos.writeByte(0);
            //etc......
            
            dis.close();
            dos.close();



        } catch (Exception e) {
           System.out.println(e);
        }
    }
}