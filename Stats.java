import java.util.Arrays;
import java.util.Random;

public class Stats {
        private int[] statArr;
        private int Strength;
        private int Dexterity;
        private int Constitution;
        private int Intelligence;
        private int Wisdom;
        private int Charisma;
        private int modifire; 
    public Stats() {
       
        
        
    }

    
        
    public void rollStats(){
        statArr = new int[6]; // Initialize the array
        Random random = new Random();

        // Roll 4d6 for each stat and store the three highest values
        for (int i = 0; i < 6; i++) {
            int[] rolls = new int[4];

            // Roll 4d6
            for (int j = 0; j < 4; j++) {
                rolls[j] = random.nextInt(6) + 1;
            }

            // Sort the rolls in descending order
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (rolls[k] > rolls[j]) {
                        int temp = rolls[j];
                        rolls[j] = rolls[k];
                        rolls[k] = temp;
                    }
                }
            }

            // Sum the three highest rolls and store the result
            int sum = rolls[0] + rolls[1] + rolls[2];
            statArr[i] = sum;
            
        }
        
    }

    public int[] displayStats(){
        rollStats();
        return statArr;
    }

    // Getter method to access the rolled values
    public int[] getStats(){
        return statArr;
    }
    public void setStr(int Strength){
        this.Strength = Strength;
    }
    public int getStr(){
        return Strength;
    }
    public void setDex(int Dexterity){
        this.Dexterity = Dexterity;
    }
    public int getDex(){
        return Dexterity;
    }
    public void setCon(int Constitution){
        this.Constitution = Constitution;
    }
    public int getCon(){
        return Constitution;
    }
    public void setInt(int Intelligence){
        this.Intelligence = Intelligence;
    }
    public int getInt(){
        return Intelligence;
    }
    public void setWis(int Wisdom){
        this.Wisdom= Wisdom;
    }
    public int getWis(){
        return Wisdom;
    }
    public void setCha(int Charisma){
        this.Charisma = Charisma;
    }
    public int getCha(){
        return Charisma;
    }


    public  void setModifire(int stat){
            if(stat >= 20  ){
                this.modifire = 5;
            }else if(stat <= 19 && stat >= 18){
                this.modifire = 4;
            }
    }

    public int getModifire(){
        return this.modifire;
    }
    
}
