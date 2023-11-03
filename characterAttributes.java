
//Class representing DnD character

import enums.Alignments;
import enums.DNDclasses;
import enums.DNDraces;

public class characterAttributes {
        private DNDclasses charClass;
        private int level;
        private DNDraces race;
        private String name;
        private Alignments alignment;
        
        
        public characterAttributes(){
                this.charClass = DNDclasses.UNKNOWN;
                this.race = DNDraces.UNKNOWN;
                this.name = "";
                this.level = 0;
                this.alignment = Alignments.UNKNOWN;
                

        }

        public DNDclasses getCharClass(){
                return charClass;
        }
        public void setCharClass(DNDclasses charClass){
                this.charClass = charClass;
        }
        
        public int getLevel(){
                return level;
        }
        public void setLevel(int level){
                this.level = level;
        }
        
        public DNDraces getRace(){
                return race;
        }
        public void setRace(DNDraces race){
                this.race = race;
        }

        public void setName(String name){
                this.name = name;
        }
        public String getName(){
                return this.name;
        }
        public Alignments getAlignment(){
                return alignment;
        }
        public void setAlightment(Alignments alignment){
                this.alignment = alignment;
        }
        


    
}
