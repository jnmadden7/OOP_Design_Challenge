import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Warrior warrior = new Warrior("Thorfin", 100);
        Mage mage = new Mage("Ezreal", 80);

        startBattle(warrior, mage);
        System.out.println("Battle has concluded.");
    }

    public static void startBattle(Character fighter1, Character fighter2) {
        printIntro(fighter1, "Hailing from the west");
        printIntro(fighter2, "Representing the lands across eastern seas");
        String fighterOneName = fighter1.getName();
        String fighterTwoName = fighter2.getName();


        boolean battleOngoing = true;
        Random random = new Random();
        final int NUM_EVENTS = 4;

        System.out.println("Battle begins!");
        while(battleOngoing) {
            
            int nextEvent = random.nextInt(NUM_EVENTS);
            switch(nextEvent) {
                case 0:
                    fighter1.attack(fighter2);
                    break;
                case 1:
                    fighter1.specialAttack(fighter2);
                    break;
                case 2:
                    fighter2.attack(fighter1);
                    break;
                case 3:
                    fighter2.specialAttack(fighter1);
                    break;
                default:
                    break;
            }    
            if (!fighter1.isAlive()) {
                System.out.println(fighterOneName + " has fallen. " + fighterTwoName + " has claimed victory!");
                battleOngoing = false;
            }
            else if (!fighter2.isAlive()) {
                System.out.println(fighterTwoName + " has fallen. " + fighterOneName + " is victorious!");
                battleOngoing = false;
            }
        }
    }
    public static void printIntro(Character fighter, String intro) {
        System.out.println(intro + ", " + fighter.getName() +
            " boasting a heart of " + fighter.getHealth() +
            ", enters the battlefield with fierce determination.");
    }    
}