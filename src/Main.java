public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(150, 50, 50);
        System.out.println(medic.getDamage() + " " + medic.getHp());
        Magic magic = new Magic(200, 40);
        System.out.println(magic.getDamage() + " " + magic.getHp());
        Warrior warrior = new Warrior(100, 30);
        System.out.println(warrior.getDamage() + " " + warrior.getHp());
        Hero[] hero = {
                medic, warrior, magic
        };
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());
            }
        }
    }
}