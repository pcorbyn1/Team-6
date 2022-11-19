import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;

import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
public class PatientGUI extends JFrame{
    public static void main(String[] args){
        //setting up gui layout
        JFrame frame = new JFrame("Patient Lookup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //adding components to PatientGUI
        JLabel label1 = new JLabel("Welcome to Patient Database \n");
        JLabel label2 =  new JLabel("Enter Patient ID");
        JPanel panel = new JPanel(new GridBagLayout(), false);
       
        frame.add(label1);
        panel.add(label2);

        JTextField tfPatientID = new JTextField("Enter Here", 20);
        panel.add(tfPatientID);

        JButton button1= new JButton("Search Patients");
        JButton button2= new JButton("Add Patients");
        JButton button3 = new JButton("Edit Patients");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem patientFile = new JMenuItem("Add Patient File");
        file.add(patientFile);
        frame.setJMenuBar(menu);

        frame.add(panel);

        //setting up when open
        frame.setSize(800,200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    
    }   
}
