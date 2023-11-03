//UI componenet for input
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import enums.Alignments;
import enums.DNDclasses;
import enums.DNDraces;

public class inputPanel extends JPanel {
    private JTextField nameField;
    private JComboBox<DNDclasses> classComboBox;
    private JComboBox<DNDraces> raceComboBox;
    private JComboBox<Alignments> alignComboBox;
    private JTextField levField;
    
    

    public inputPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        JPanel basicInfo = new JPanel();
        basicInfo.setLayout(new FlowLayout(FlowLayout.LEFT));
        nameField = new JTextField(20);
        classComboBox = new JComboBox<>(DNDclasses.values());
        raceComboBox = new JComboBox<>(DNDraces.values());
        alignComboBox = new JComboBox<>(Alignments.values());
        levField = new JTextField(5);

        nameField.setPreferredSize(new Dimension(100, 20));
        classComboBox.setPreferredSize(new Dimension(100, 20));
        raceComboBox.setPreferredSize(new Dimension(100, 20));
        alignComboBox.setPreferredSize(new Dimension(50, 20));
        levField.setPreferredSize(new Dimension(50,20));
       

        basicInfo.add(new JLabel("Character Name: "));
        basicInfo.add(nameField);
        basicInfo.add(new JLabel("Class:"));
        basicInfo.add(classComboBox);
        basicInfo.add(new JLabel("Race:"));
        basicInfo.add(raceComboBox);
        basicInfo.add(new JLabel("Alignment:"));
        basicInfo.add(alignComboBox);
        basicInfo.add(new JLabel("Level:"));
        basicInfo.add(levField);
       

        add(basicInfo);
    }



}
