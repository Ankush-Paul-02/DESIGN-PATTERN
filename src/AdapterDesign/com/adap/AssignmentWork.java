package AdapterDesign.com.adap;

public class AssignmentWork {

    private Pen pen;
    
    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String assignment) {
        pen.write(assignment);
    }

}
