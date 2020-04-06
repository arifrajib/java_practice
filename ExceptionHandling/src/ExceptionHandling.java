public class ExceptionHandling {

    public static void main (String[] args) {


        try {
            //System.out.println("Exception Thrown from here");
            //throw new ThrowableException();
            exceptionMethod();
        } catch (ThrowableException e) {
            System.out.println("Exception catch here");
        } finally {
            System.out.println("Finally block execute; exception thrown or not");
        }
    }

    private static void exceptionMethod () throws ThrowableException{
        System.out.println("Exception Thrown from here");
        throw new ThrowableException();
    }

}


class ThrowableException extends Exception{

    private static final long serialVersionUID = 1L;

    public ThrowableException () {
        super();
    }
}