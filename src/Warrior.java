public class Warrior extends Character {

    public Warrior(String name, int health) {
            super(name, health);
        }
    
    @Override
    public void tookDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(getName() + " took " + damage + " damage to their armor! " + getName() + " has but this much strength left before they leave for Valhalla: " + getHealth());
    }
        
    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(getName() + " swung their sword at " + targetName + "! Unleashing a disorienting strike to their foe!");
        target.tookDamage(10);
    }

    @Override
    public void specialAttack(Character target) {
        String targetName = target.getName();
        System.out.println(getName() + " swung their sword with the strength of 10,000 men! " + targetName + " must pray to the gods they don't dwindle in health.");
        target.tookDamage(20);
    }
    
}
