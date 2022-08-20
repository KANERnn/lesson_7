public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(150, 50, 50);
        System.out.println(medic.getDamage() + " " + medic.getHp());
        medic.applySuperAbility();
        Magic magic = new Magic(200, 40);
        System.out.println(magic.getDamage() + " " + magic.getHp());
        magic.applySuperAbility();
        Warrior warrior = new Warrior(100, 30);
        System.out.println(warrior.getDamage() + " " + warrior.getHp());
        warrior.applySuperAbility();
        Hero[] hero = {
                medic, warrior, magic
        };
        for (int i = 0; i < hero.length; i++) {
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());
            }
        }
    }
}