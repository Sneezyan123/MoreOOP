import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    
    @Test
    void testHobbitCreation() {
        Hobbit hobbit = new Hobbit();
        assertEquals(0, hobbit.getPower());
        assertEquals(3, hobbit.getHp());
        assertTrue(hobbit.isAlive());
    }
    
    @Test
    void testElfCreation() {
        Elf elf = new Elf();
        assertEquals(10, elf.getPower());
        assertEquals(10, elf.getHp());
        assertTrue(elf.isAlive());
    }
    
    @Test
    void testKingCreation() {
        King king = new King();
        assertTrue(king.getPower() >= 5 && king.getPower() <= 15);
        assertTrue(king.getHp() >= 5 && king.getHp() <= 15);
        assertTrue(king.isAlive());
    }
    
    @Test
    void testKnightCreation() {
        Knight knight = new Knight();
        assertTrue(knight.getPower() >= 2 && knight.getPower() <= 12);
        assertTrue(knight.getHp() >= 2 && knight.getHp() <= 12);
        assertTrue(knight.isAlive());
    }
    
    @Test
    void testCharacterDeath() {
        Hobbit hobbit = new Hobbit();
        hobbit.takeDamage(3);
        assertFalse(hobbit.isAlive());
    }
    
    @Test
    void testCharacterFactory() {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter();
        assertNotNull(character);
        assertTrue(character instanceof Hobbit || 
                  character instanceof Elf || 
                  character instanceof King || 
                  character instanceof Knight);
    }
    
    @Test
    void testElfKickWeaker() {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        
        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
    }
    
    @Test
    void testElfKickStronger() {
        Elf elf = new Elf();
        King king = new King();
        int originalPower = king.getPower();
        
        elf.kick(king);
        assertEquals(originalPower - 1, king.getPower());
    }
    
    @Test
    void testGameManagerFight() {
        GameManager gameManager = new GameManager();
        Hobbit hobbit = new Hobbit();
        Elf elf = new Elf();
        
        // This should complete without throwing exceptions
        assertDoesNotThrow(() -> gameManager.fight(hobbit, elf));
    }
}