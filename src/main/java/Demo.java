public class Demo {
    public static void main(String args[]) {
        System.out.println("=== HEROES GAME DEMO ===");
        
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();
        
        // Create two random characters
        Character fighter1 = factory.createCharacter();
        Character fighter2 = factory.createCharacter();
        
        // Make sure we have different characters for an interesting fight
        while (fighter1.getClass().equals(fighter2.getClass())) {
            fighter2 = factory.createCharacter();
        }
        
        // Start the fight
        gameManager.fight(fighter1, fighter2);
        
        System.out.println("\n=== DEMO COMPLETE ===");
    }
}
