import FactoryDesign.com.phone.OS;
import FactoryDesign.com.phone.OperationSystemFactory;

/**
 * The factory design pattern is used when we have a superclass with multiple
 * sub-classes and based on input, we need to return one of the sub-class. This pattern 
 * takes out the responsibility of the instantiation of a class from the client program 
 * to the factory class.
 */

public class FactoryMain {
    public static void main(String[] args) {
        OperationSystemFactory operationSystemFactory = new OperationSystemFactory();
        OS os = operationSystemFactory.getInstance("Close");
        os.spec();
    }
}
