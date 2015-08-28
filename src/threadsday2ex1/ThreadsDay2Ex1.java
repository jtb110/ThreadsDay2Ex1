/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsday2ex1;

/**
 *
 * @author Jonas
 */
public class ThreadsDay2Ex1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Threads t1 = new Threads("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        Threads t2 = new Threads("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        Threads t3 = new Threads("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");

        long start, end, time, result;

        start = System.nanoTime();

        t1.run();
        System.out.println("Thread1: " + t1.getSum());
        t2.run();
        System.out.println("Thread2: " + t2.getSum());
        t3.run();
        System.out.println("THread3: " + t3.getSum());

        end = System.nanoTime();

        time = end - start;
        System.out.println("Total time in nano seconds: " + time);
        
        result = t1.getSum() + t2.getSum() + t3.getSum();
        System.out.println("Total of all threads: " + result);
    }

}
