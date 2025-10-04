public class Elf extends Character {
    
    public Elf() {
        super(10, 10);
    }
    
    @Override
    public void kick(Character c) {
        if (c.getPower() < this.power) {
            System.out.println("Elf kills " + c.getClass().getSimpleName() + " instantly!");
            c.setHp(0);
        } else {
            System.out.println("Elf decreases " + c.getClass().getSimpleName() + "'s power by 1");
            c.setPower(c.getPower() - 1);
        }
    }
}
