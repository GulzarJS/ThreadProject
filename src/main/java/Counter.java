import java.util.Random;

public class Counter extends Thread {

    // name of thread
    public String name;

    //Static variable for incrementing by each thread for marking order
    public static int order;


    public Counter( String name) {
        this.name = name;

    }


    public void run() {

        // value which thread increment 1->n
        int value=0;


        // random value for choosing Thread.sleep millisecons
        final Random rand = new Random();
        int i;

            for (i = 0; i < 5; i++) {
                    try {
                        value++;
                        //finding random value
                        int rand_1 = rand.nextInt(5000);
                        // threas sleep for 0-5 seconds
                        Thread.sleep(rand_1);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    if(value==5){
                        //End of the thread
                        System.out.println(" order: "+(++order)+ "=>"+name + ": " + value+ " The End ");
                    }else {
                        // dislay value and order of each incrementation
                        System.out.println(" order: " + (++order) + " => " + name + ": " + value);
                    }

                }



        }






    }





















