import ObserverDesign.com.Observer.Channel;
import ObserverDesign.com.Observer.Subscriber;

/**
 * Observer design pattern is useful when you are interested in the state of an object 
 * and want to get notified whenever there is any change. In observer pattern, the 
 * object that watch on the state of another object are called Observer and the object 
 * that is being watched is called Subject.
 */

public class ObserverYoutube {
    public static void main(String[] args) {
        
        Channel telusko = new Channel();

        Subscriber subscriber1 = new Subscriber("Ankush");
        Subscriber subscriber2 = new Subscriber("Paul");
        Subscriber subscriber3 = new Subscriber("Purbanka");
        Subscriber subscriber4 = new Subscriber("Patra");


        telusko.subscribe(subscriber1);
        telusko.subscribe(subscriber2);
        telusko.subscribe(subscriber3);
        telusko.subscribe(subscriber4);

        telusko.unSubscribe(subscriber2);

        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);

        telusko.upload("Design Pattern Tutorial");

    }
}
