public class SimpleTest {
    
    public static void main(String[] args) {
        System.out.println("=== RUNNING SIMPLE TESTS ===");
        
        // Test Hobbit
        testHobbit();
        
        // Test Elf
        testElf();
        
        // Test King
        testKing();
        
        // Test Knight
        testKnight();
        
        // Test CharacterFactory
        testCharacterFactory();
        
        // Test GameManager
        testGameManager();
        
        System.out.println("=== ALL TESTS PASSED ===");
    }
    
    private static void testHobbit() {
        System.out.println("Testing Hobbit...");
        Hobbit hobbit = new Hobbit();
        assert hobbit.getPower() == 0 : "Hobbit power should be 0";
        assert hobbit.getHp() == 3 : "Hobbit hp should be 3";
        assert hobbit.isAlive() : "Hobbit should be alive";
        System.out.println("✓ Hobbit test passed");
    }
    
    private static void testElf() {
        System.out.println("Testing Elf...");
        Elf elf = new Elf();
        assert elf.getPower() == 10 : "Elf power should be 10";
        assert elf.getHp() == 10 : "Elf hp should be 10";
        assert elf.isAlive() : "Elf should be alive";
        System.out.println("✓ Elf test passed");
    }
    
    private static void testKing() {
        System.out.println("Testing King...");
        King king = new King();
        assert king.getPower() >= 5 && king.getPower() <= 15 : "King power should be 5-15";
        assert king.getHp() >= 5 && king.getHp() <= 15 : "King hp should be 5-15";
        assert king.isAlive() : "King should be alive";
        System.out.println("✓ King test passed");
    }
    
    private static void testKnight() {
        System.out.println("Testing Knight...");
        Knight knight = new Knight();
        assert knight.getPower() >= 2 && knight.getPower() <= 12 : "Knight power should be 2-12";
        assert knight.getHp() >= 2 && knight.getHp() <= 12 : "Knight hp should be 2-12";
        assert knight.isAlive() : "Knight should be alive";
        System.out.println("✓ Knight test passed");
    }
    
    private static void testCharacterFactory() {
        System.out.println("Testing CharacterFactory...");
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter();
        assert character != null : "Character should not be null";
        assert (character instanceof Hobbit || 
                character instanceof Elf || 
                character instanceof King || 
                character instanceof Knight) : "Character should be one of the valid types";
        System.out.println("✓ CharacterFactory test passed");
    }
    
    private static void testGameManager() {
        System.out.println("Testing GameManager...");
        GameManager gameManager = new GameManager();
        Hobbit hobbit = new Hobbit();
        Elf elf = new Elf();
        
        // This should complete without throwing exceptions
        try {
            gameManager.fight(hobbit, elf);
            System.out.println("✓ GameManager test passed");
        } catch (Exception e) {
            System.err.println("✗ GameManager test failed: " + e.getMessage());
            throw e;
        }
    }
}
