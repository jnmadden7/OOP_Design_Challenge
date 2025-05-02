public class Mage extends Character {

    public Mage(String name, int health) {
            super(name, health);
        }
    
    @Override
    public void tookDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(getName() + " takes a hit their elixir was not prepared for. " + getName() + "'s salubrity has dwindled to: " + getHealth());
    }

    @Override
    public void specialAttack(Character target) {
        String targetName = target.getName();
        System.out.println("MERLINS BEARD! " + getName() + " unleashes an energy that will curse " + targetName + " for generations to come!");
        target.tookDamage(25);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getName();
        System.out.println(getName() + " sends a roaring fireball into " + targetName + "'s center mass!");
        target.tookDamage(5);
    }
    
}
