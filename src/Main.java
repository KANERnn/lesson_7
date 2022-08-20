public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(150, 50, 50);
        Magic magic = new Magic(200, 40);
        Warrior warrior = new Warrior(100, 30);

        Hero[] hero = {
                medic, warrior, magic
        };
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].info());
            hero[i].applySuperAbility();
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());

            }
        }
    }
}