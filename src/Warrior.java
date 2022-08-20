public class Warrior extends Hero{


    public Warrior(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE”. ");
    }
}
