public class Utopec implements Humanoid{
    private static int health;
    private static int damage;

    public void Utopec(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void walk() {
        System.out.println("Utopec has jumped");
    }

    @Override
    public void takeDamage(int damage) {
        health = health - Math.min(health, damage);
        System.out.println("Utopec takes " +Math.min(health, damage)+ " damage.");
        if (health == 0){
            System.out.println("Utopec is dead.");
        }
    }

    @Override
    public int gethealth() {
        return health;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
