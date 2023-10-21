import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



//UI main class
public class characterGenUI extends JFrame{


    characterGenUI(){
        this.setTitle("DnD Character Generator");// sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false);//prevents frame from being resized
        this.setSize(1000,800); // sets dimensions or frame
        this.setVisible(true); // makes fram visible 

        ImageIcon diceImg = new ImageIcon("Images/d20.png");
        this.setIconImage(diceImg.getImage());


        // input panel
        inputPanel inptPanel = new inputPanel();
        getContentPane().add(inptPanel);
        
        
        setLocationRelativeTo(null); // Center on screen
        setVisible(true);
        

        
    }


   
    
}
