package guiframe;
import java.awt.FlowLayout;//it creates layout area
import javax.swing.JFrame;//creates side frames
import javax.swing.JLabel;//creates text and label design
public class Second extends JFrame{
    private JLabel item1;
    //bulit a constructor
public Second(){
    super("Xiaomi App");
    setLayout(new FlowLayout());
    item1= new JLabel("Arriving xiaomi ultra book");
   item1.setToolTipText("implemented by java language_"); //it creates tool tip (OR) hovering prompt
    add(item1);
}
}
