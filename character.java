
//Class representing DnD character

import enums.DNDclasses;
import enums.DNDraces;

public class character {
        private DNDclasses charClass;
        private int level;
        private DNDraces race;
        private String name;
        private String alignment;
        private String background;
        private int hitPoints;
        private int armorClass;
        private String skills_Proficiencies;
        private String feats;
        private String equipment;
        private int spellsKnown;
        
        public character(){
                this.name = "";
                this.level = 1;
                this.alignment = "";
                this.background = "";
                this.hitPoints = 0;
                this.armorClass = 0;
                this.skills_Proficiencies = "";
                this.feats = "";
                this.equipment = "";
                this.spellsKnown = 0;

        }




    
}
