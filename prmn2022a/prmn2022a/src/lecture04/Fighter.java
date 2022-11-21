package lecture04;

public class Fighter {

    private int hitPoint;
    private int Power;
    private String name;

    public Fighter(int hitPoint, int Power, String name) {
        this.hitPoint = hitPoint;
        this.Power = Power;
        this.name = name;
    }

    public void attack(Fighter enemy) {
        enemy.hitPoint = enemy.hitPoint - this.Power;
        System.out.println(this.name + "は" + enemy.name + "に" + this.Power + "ダメージを与えた");

    }

    public boolean isAlive() {
        if (this.hitPoint > 0) {
            return true;
        }
        return false;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public String getName() {
        return name;
    }
}


