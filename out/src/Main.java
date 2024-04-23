import java.awt.*;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class  Main extends OOPGraphics {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        JFrame MainFrame = new JFrame();
        MainFrame.setLayout(new FlowLayout());
        MainFrame.add(this);
        MainFrame.pack();
        MainFrame.setVisible(true);
       this.about(); //comment this out for testing to stop the oop animation
    }

    public void processCommand(String command) {
        String[] sections = command.split(" ");
        String commandString = sections[0];
        int parameter = 0;

        if (sections.length > 1) {
            try {
                parameter = Integer.parseInt(sections[1]);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid parameter :(" + sections[1]);
                return;
            }
        }

        switch (sections[0]) {
            case "about":
                about();
                break;

            case "penup":
                penUp();
                break;

                case "pendown":
                    penDown();
                    break;

            case "turnleft":
                if (parameter <= 01)
                    System.out.println("Parameter invalid :(");
                else
                    turnLeft(parameter);
                break;

                case "turnright":
                    if (parameter <= 01)
                        System.out.println("Parameter invalid :(");
                    else
                        turnRight(parameter);
                    break;

            case "forward":
                if (parameter <= 01)
                    System.out.println("Parameter invalid :(");
                else
                    forward(parameter);
                break;

                    case "backward":
                        if (parameter <= 01)
                            System.out.println("Parameter invalid :(");
                        else
                            forward(parameter * -1);
                        break;

            case "black":
                setPenColour(Color.black);
                break;

                case "red":
                    setPenColour(Color.RED);
                    break;

                    case "green":
                        setPenColour(Color.GREEN);
                        break;
            case "blue":
                        setPenColour(Color.blue);
                        break;
                        case "yellow":
                            setPenColour(Color.YELLOW);
                            break;
            case "white":
                            setPenColour(Color.WHITE);
                            break;

            case "reset":
                            reset();
                            break;

            case "clear":
                clear();
                break;

            default:
                System.out.println("Invalid command - does not exist :( ");
                break;
        }

    }
}
