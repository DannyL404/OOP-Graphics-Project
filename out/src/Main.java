import java.awt.FlowLayout;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class Main extends OOPGraphics {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        JFrame MainFrame = new JFrame();
        MainFrame.setLayout(new FlowLayout());
        MainFrame.add(this);
        MainFrame.pack();
        MainFrame.setVisible(true);
        this.about();
    }

    public void processCommand(String command) {
    }
}
