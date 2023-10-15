
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
                this.charClass = DNDclasses.UNKNOWN;
                this.race = DNDraces.UNKNOWN;
                this.name = "";
                this.level = 1;
                this.alignment = "";
                this.background = "";
                this.hitPoints = 0;
                this.armorClass = 10;
                this.skills_Proficiencies = "";
                this.feats = "";
                this.equipment = "";
                this.spellsKnown = 0;

        }

        public DNDclasses getCharClass(){
                return charClass;
        }
        public void setCharClass(DNDclasses charClass){
                this.charClass = charClass;
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
        public String getAlignment(){
                return alignment;
        }
        public void setAlightment(String alignment){
                this.alignment = alignment;
        }
        public String getBackground(){
                return background;
        }
        public void setBackground(String background){
                this.background = background;
        }
        public int getHP(){
                return hitPoints;
        }
        public void setHP(int hitPoints){
                this.hitPoints = hitPoints;
        }
        public String getSkills_Proficiences(){
                return skills_Proficiencies;
        }
        public void setSkills_Proficiences(String skills_proficiences){
                this.skills_Proficiencies = skills_proficiences;
        }
        public String getFeats(){
                return feats;

        }
        public void setFeats(String feats){
                this.feats = feats;
        }
        public String getEquiptment(){
                return equipment;

        }
        public void setEquipment(String equipment){
                this.equipment = equipment;
        }
        public int getSpellsKnown(){
                return spellsKnown;
        }
        public void setSpellsKnown(DNDclasses charClass, int spellsKnown){
                this.spellsKnown = spellsKnown;
        }


    
}
