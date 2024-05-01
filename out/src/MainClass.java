import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import uk.ac.leedsbeckett.oop.OOPGraphics;

public class  MainClass extends OOPGraphics {
    public static void main(String[] args) {
        new MainClass();
    }

    public MainClass() {
        JFrame MainClassFrame = new JFrame();
        MainClassFrame.setLayout(new FlowLayout());
        MainClassFrame.add(this);
        MainClassFrame.pack();
        MainClassFrame.setVisible(true);
        this.about();
    }

    @Override
    public void about() {
        displayMessage("Dan's cool turtle swag");
        super.about();
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
                displayMessage("Invalid parameter :( " + sections[1]);
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
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
                else
                    turnLeft(parameter);
                break;

            case "turnright":
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
                else
                    turnRight(parameter);
                break;

            case "forward":
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
                else
                    forward(parameter);
                break;

            case "backward":
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
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

            case "square":
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
                else {
                    for (int i = 0; i < 4; i++) {
                        forward(parameter);
                        turnRight(90);
                    }
                }
                break;

            case "pen":
                Color colour = new Color(Integer.parseInt(sections[1]), Integer.parseInt(sections[2]), Integer.parseInt(sections[3]));
                setPenColour(colour);
                break;

            case "penwidth":
                setStroke(parameter);
                break;

            case "triangle":
                if (parameter <= 01) {
                    displayMessage("Parameter invalid :(");
                    System.out.println("Parameter invalid :(");
                }
                else {
                for (int i = 0; i < 3; i++) {
                    forward(parameter);
                    turnRight(120);
                }
                }
                break;

            default:
                displayMessage("Parameter invalid :(");
                System.out.println("Invalid command - does not exist :( ");
                break;
        }


        class SavedCommands {
            public String[] SavedCommands = new String[0];

            public void add (String command) {
                String[] temporary = new String[SavedCommands.length + 1];
                for (int i = 0; i < SavedCommands.length; i++) {
                    temporary[i] = SavedCommands[i];
                }
                temporary[SavedCommands.length] = command;
                SavedCommands = temporary;
            }

        }
    }
}
