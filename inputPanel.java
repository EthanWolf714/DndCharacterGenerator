//UI componenet for input
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import enums.Alignments;
import enums.DNDclasses;
import enums.DNDraces;

public class inputPanel extends JPanel {
    private characterAttributes characterAttributes;
    private JTextField nameField;
    private JComboBox<DNDclasses> classComboBox;
    private JComboBox<DNDraces> raceComboBox;
    private JComboBox<Alignments> alignComboBox;
    private JTextField levField;
    
    

    public inputPanel(characterAttributes characterAttributes) {
        this.characterAttributes = characterAttributes;
        
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Character Info section 
        JPanel attributesPanel = new JPanel();
        attributesPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        nameField = new JTextField(20);
        nameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e ){
                updateCharacterName();
            }
            @Override
            public void removeUpdate(DocumentEvent e){
                updateCharacterName();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        classComboBox = new JComboBox<>(DNDclasses.values());
        classComboBox.addActionListener( e -> {
            DNDclasses selectedClass = (DNDclasses)  classComboBox.getSelectedItem();
            characterAttributes.setCharClass(selectedClass);
        });
        raceComboBox = new JComboBox<>(DNDraces.values());
        raceComboBox.addActionListener( e -> {
            DNDraces selectedRace = (DNDraces) raceComboBox.getSelectedItem();
            characterAttributes.setRace(selectedRace);
        });
        alignComboBox = new JComboBox<>(Alignments.values());
        alignComboBox.addActionListener( e -> {
            Alignments selectedAlignment = (Alignments)  alignComboBox.getSelectedItem();
            characterAttributes.setAlightment(selectedAlignment);
        });
        levField = new JTextField(5);
        levField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e ){
                updateCharacterLevel();
            }
            @Override
            public void removeUpdate(DocumentEvent e){
                updateCharacterLevel();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });

        nameField.setPreferredSize(new Dimension(100, 20));
        classComboBox.setPreferredSize(new Dimension(100, 20));
        raceComboBox.setPreferredSize(new Dimension(100, 20));
        alignComboBox.setPreferredSize(new Dimension(50, 20));
        levField.setPreferredSize(new Dimension(50,20));
       

        attributesPanel.add(new JLabel("Character Name: "));
        attributesPanel.add(nameField);
        attributesPanel.add(new JLabel("Class:"));
        attributesPanel.add(classComboBox);
        attributesPanel.add(new JLabel("Race:"));
        attributesPanel.add(raceComboBox);
        attributesPanel.add(new JLabel("Alignment:"));
        attributesPanel.add(alignComboBox);
        attributesPanel.add(new JLabel("Level:"));
        attributesPanel.add(levField);
       //End Character info section


       JPanel statsPanel = new JPanel();

       JPanel equipmentPanel = new JPanel();

       JPanel spellsPanel = new JPanel();

       JPanel backgroundPanel = new JPanel();



        add(attributesPanel);
        



    }

    private void updateCharacterName() {
        String name = nameField.getText();
        characterAttributes.setName(name);
    }
    private void updateCharacterLevel() {
        String levelText = levField.getText();
        if(!levelText.isEmpty()){
            try {
                int level = Integer.parseInt(levelText);
                characterAttributes.setLevel(level);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid integer for character level", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }


}
