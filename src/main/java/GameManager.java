public class GameManager {
    
    public void fight(Character c1, Character c2) {
        System.out.println("=== FIGHT BEGINS ===");
        System.out.println("Fighter 1: " + c1);
        System.out.println("Fighter 2: " + c2);
        System.out.println();
        
        int round = 1;
        
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("--- Round " + round + " ---");
            
            // Character 1 attacks Character 2
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName() + ":");
            c1.kick(c2);
            System.out.println("Result: " + c2);
            
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated!");
                break;
            }
            
            // Character 2 attacks Character 1
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName() + ":");
            c2.kick(c1);
            System.out.println("Result: " + c1);
            
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated!");
                break;
            }
            
            System.out.println();
            round++;
        }
        
        System.out.println("=== FIGHT ENDS ===");
        if (c1.isAlive()) {
            System.out.println("Winner: " + c1.getClass().getSimpleName() + "!");
        } else {
            System.out.println("Winner: " + c2.getClass().getSimpleName() + "!");
        }
    }
}
