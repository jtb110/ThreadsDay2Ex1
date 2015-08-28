    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsday2ex1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Jonas
 */
public class Threads implements Runnable {

    private byte[] size;
    private long sum = 0;
    String ThisURL;
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    public Threads(String url) {
        this.ThisURL = url;
    }

    public void run() {
        try {
            InputStream input = new URL(getThisURL()).openStream();
            byte[] bytebuff = new byte[4096];
            int read;
            while ((read = input.read(bytebuff)) > 0) {
                out.write(bytebuff, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            size = out.toByteArray();

            for (byte c : size) {
                sum += c;

            }
        }
    }

    public String getThisURL() {
        return ThisURL;
    }

    public void setThisURL(String ThisURL) {
        this.ThisURL = ThisURL;
    }

    public void resetSUM() {
        sum = 0;
    }
    public long getSum(){
        return sum;
    }

}
