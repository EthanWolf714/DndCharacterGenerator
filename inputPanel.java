//UI componenet for input
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.Label;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import enums.DNDclasses;
import enums.DNDraces;

public class inputPanel extends JPanel {
    private JTextField nameField;
    private JComboBox<DNDclasses> classComboBox;
    private JComboBox<DNDraces> raceComboBox;
    

    public inputPanel() {
        nameField = new JTextField(20);
        classComboBox = new JComboBox<>(DNDclasses.values());
        raceComboBox = new JComboBox<>(DNDraces.values());

        setLayout(new FlowLayout(FlowLayout.LEFT));

        nameField.setPreferredSize(new Dimension(100, 20));
        classComboBox.setPreferredSize(new Dimension(100, 20));
        raceComboBox.setPreferredSize(new Dimension(100, 20));

        add(new Label("Character Name: "));
        add(nameField);
        add(new Label("Class"));
        add(classComboBox);
        add(new Label("Race"));
        add(raceComboBox);

    }



}
