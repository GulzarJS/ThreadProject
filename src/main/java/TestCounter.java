import java.util.Random;
import java.lang.Math;


public class TestCounter  {

    public static void main(String[] args){


        //Creating threads
        Thread counter1=new Counter("Counter1");
        Thread counter2=new Counter("Counter2");
        Thread counter3=new Counter("Counter3");

        //Starting threads
        counter1.start();

        counter2.start();

        counter3.start();












    }

}