import java.util.Random;

public class CharacterFactory {
    private static final Random random = new Random();
    
    public Character createCharacter() {
        int characterType = random.nextInt(4); // 0-3 for 4 character types
        
        switch (characterType) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return new Hobbit(); // fallback
        }
    }
}
