import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.*;
import java.util.concurrent.Flow;



public class MainFrame extends JFrame{


    MainFrame(){
        this.setTitle("DnD Character Generator");// sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);//prevents frame from being resized
        this.setSize(1000,800); // sets dimensions or frame
        this.setVisible(true); // makes fram visible 

        ImageIcon diceImg = new ImageIcon("Images/d20.png");
        this.setIconImage(diceImg.getImage());


        //StatSection
        
        
    }


   
    
}
