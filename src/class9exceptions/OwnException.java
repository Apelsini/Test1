package class9exceptions;

/**
 * Created by user on 13.02.2019.
 */
public class OwnException {
    public static void main(String[] args) {
        try {
            throw new SachekException("MY OWN EXCEPTION");
        } catch (SachekException e) {
            e.printStackTrace();
        }

    }
}

// creation of an own exception

class SachekException extends Exception {
    public SachekException (String msg) {
        super(msg);

    }
}

class VirusPetiaException extends RuntimeException {
    public VirusPetiaException (String msg) {
        super(msg);

    }

}
