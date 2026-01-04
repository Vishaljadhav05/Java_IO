package InputStream_And_OutputStream_Classes;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInput_OutputDemo {

    // -> PipedInputStream and PipedOutputStream are used simultaneously.
    // -> These streams are used to transfer the data from one thread to another thread.
    // -> Both these streams should be connected.


    //      Thread 1                                                         Thread 2
    //      |                                                                   |
    //      |                                                                   |
    //      |   -----> [ PipedInputStream ] -----> [ PipedOutputStream ] -----> |
    //      |                                                                   |
    //      |                                                                   |
    public static void main(String[] args) throws Exception
    {
        String st = "This is piped input and output";

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        pos.write(st.getBytes());

        int i;

        while ((i = pis.read()) != -1) {
            System.out.print((char)i);
        }

        pis.close();
        pos.close();
    }
}
