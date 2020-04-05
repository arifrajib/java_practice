import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingFlow {

    public static void main (String[] args) {

        //// Call the exception handler method
        methodWithExceptionHandler();
    }

    public static void methodWithExceptionHandler() {
        //// call method with exception handling
        try{
            method1();
        }
        catch (IOException exception) {
            ///// catch the exception
            System.out.println("Exception caught!!! "+exception.getMessage());
            System.out.println("Print the Exception Trace");
            exception.printStackTrace();
        }

    }

    private static void method1() throws IOException {
        //// call method without exception handling
        ///////// the method itself throws exception
        method2();
    }

    private static void method2() throws IOException {
        //// call method without exception handling
        ///////// the method itself throws exception
        methodWithException();
    }

    private static void methodWithException() throws IOException {
        //// the method generates exception and throws to the caller method
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("/file/that/does/not/exists")))) {

            /////// action that will perform reading the file if exists
            System.out.println("action that will perform, if the file exists");
        };
    }
}
