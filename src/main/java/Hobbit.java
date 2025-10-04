public class Hobbit extends Character {
    
    public Hobbit() {
        super(0, 3);
    }
    
    @Override
    public void kick(Character c) {
        toCry();
    }
    
    private void toCry() {
        System.out.println("Hobbit cries: 'Waaaah! I don't want to fight!'");
    }
}
