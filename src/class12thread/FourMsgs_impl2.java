package class12thread;

/**
 * Created by user on 22.02.2019.
 */
public class FourMsgs_impl2 {
    public static void main(String[] args) {
        Thread mesaaga1 = new Thread(new MyRunnable("mesaaga1"));
        mesaaga1.start();


        Thread mesaaga2 = new Thread(new MyRunnable("message2"));
        mesaaga2.start();

        Thread mesaaga3 = new Thread(new MyRunnable("newmessage"));
        mesaaga3.start();


        Thread mesaaga4 = new Thread(new MyRunnable("nmsgmsgmsssage"));
        mesaaga4.start();


        mesaaga1.interrupt();
        mesaaga2.interrupt();
        mesaaga3.interrupt();
        mesaaga4.interrupt();



    }
}
