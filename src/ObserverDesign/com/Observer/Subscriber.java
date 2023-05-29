package ObserverDesign.com.Observer;

public class Subscriber implements Observer {
    
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey " + name + ", Video uploaded: " + channel.title);
    }

    @Override
    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

}
