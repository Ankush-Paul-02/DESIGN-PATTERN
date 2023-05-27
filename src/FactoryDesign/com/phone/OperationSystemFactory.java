package FactoryDesign.com.phone;

public class OperationSystemFactory {
    public OS getInstance(String os) {
        if (os.equals("Open")) {
            return new Android();
        } else if (os.equals("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
