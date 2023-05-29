package ObserverDesign.com.Observer;
import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subscribers = new ArrayList<>();
    String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.update();
        }
    }

    @Override
    public void upload(String title) {
        this.title = title;
        notifySubscribers();
    }

}
