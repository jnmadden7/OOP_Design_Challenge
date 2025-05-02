public abstract class Character implements Attackable{
    private String name;
    private int health;
    protected int id;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public boolean isAlive() {
        return health > 0;
    }
    
    public abstract void attack(Character target);
    public abstract void specialAttack(Character target);
}
