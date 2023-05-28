package CompositeDesign.com.composite;

/**
 * Composite pattern is one of the Structural design pattern. Composite design pattern 
 * is used when we have to represent a part-whole hierarchy.
 */

public class CompositeTest {
    public static void main(String[] args) {
        
        Component hardDrive = new Leaf(4000, "HardDrive");
        Component mouse = new Leaf(5000, "Mouse");
        Component monitor = new Leaf(6000, "Monitor");
        Component ram = new Leaf(7000, "RAM");
        Component cpu = new Leaf(8000, "CPU");


        Composite peripheral = new Composite("Peripheral");
        Composite cabinet = new Composite("cabinet");
        Composite motherboard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherboard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
