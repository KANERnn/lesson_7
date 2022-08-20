public abstract class Hero implements HavingSuperAbility{
    private int hp;
    private int damage;

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    private String superAbility;
    public String info() {
        return getHp() + " " + getDamage();
    }
}
