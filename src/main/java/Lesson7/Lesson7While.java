package Lesson7;

public class Lesson7While {
    public static void main(String args[]) throws InterruptedException {
        int i=1;
        while(true)
        {
            System.out.println(i);
            i++;
            Thread.sleep(1000);
        }
    }
}
