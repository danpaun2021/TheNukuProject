package pachetzel;
import org.testng.annotations.Test;

import javax.swing.JOptionPane;

@Test
public class GUI {
    public void gui(){
    //  GUI acronym =  graphical user interface
     String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " +age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are " +height+" cm tall");
    }
}
