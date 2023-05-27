import BuilderPattern.com.phone.Phone;
import BuilderPattern.com.phone.PhoneBuilder;

/**
 * The builder pattern is a design pattern designed to provide a flexible solution to 
 * various object creation problems in object-oriented programming. The intent of the 
 * builder design pattern is to separate the construction of a complex object from its 
 * representation. It is one of the Gang of Four design patterns.
 */

public class BuilderShop {
    public static void main(String[] args) {

        Phone vivo = new PhoneBuilder().setOs("Android").setRam(6).setBattery(4500).getPhone();
        System.out.println(vivo);
    }
}
