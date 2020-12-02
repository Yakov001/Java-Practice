public class RedRoseSoldier implements Humanoid{
    private static int health;
    private static int damage;

    public void RedRoseSoldier(int health, int damage){
        this.health = health;
        this.damage = damage;
    }


    @Override
    public void walk() {
        System.out.println("Red Rose Soldier walks");
    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    public int gethealth() {
        return 0;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
