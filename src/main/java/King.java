import java.util.Random;

public class King extends Character {
    private static final Random random = new Random();
    
    public King() {
        super(random.nextInt(11) + 5, random.nextInt(11) + 5); // 5-15 range
    }
    
    @Override
    public void kick(Character c) {
        int damage = random.nextInt(power) + 1; // 1 to power
        System.out.println("King deals " + damage + " damage to " + c.getClass().getSimpleName());
        c.takeDamage(damage);
    }
}
