import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.*;

import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
public class PatientGUI extends JFrame{
    public static void main(String[] args){
        //setting up gui layout
        JFrame frame = new JFrame("Patient Lookup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //adding components to PatientGUI
        JLabel label1 =  new JLabel("Enter Patient ID");
        frame.add(label1);

        JTextField tfPatientID = new JTextField("Enter Here", 20);
        frame.add(tfPatientID);


        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem patientFile = new JMenuItem("Add Patient File");
        file.add(patientFile);
        frame.setJMenuBar(menu);

        //setting up when open
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    
    }   
}
