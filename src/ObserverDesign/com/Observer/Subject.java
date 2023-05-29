package ObserverDesign.com.Observer;

public interface Subject {

    void subscribe(Subscriber subscriber);

    void unSubscribe(Observer subscriber);

    void notifySubscribers();

    void upload(String title);

}