package AdapterDesign.com.adap;
import AdapterDesign.com.friend.GelPen;

public class PenAdapter implements Pen {

    GelPen gelPen = new GelPen();

    @Override
    public void write(String str) {
        gelPen.mark(str);
    } 
}
