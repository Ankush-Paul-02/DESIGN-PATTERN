import AdapterDesign.com.adap.AssignmentWork;
import AdapterDesign.com.adap.Pen;
import AdapterDesign.com.adap.PenAdapter;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that 
 * two unrelated interfaces can work together. The object that joins these unrelated 
 * interface is called an Adapter.
 */

public class AdapterSchool {
    public static void main(String[] args) {

        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("I'm bit tired!");
        
    }
}
