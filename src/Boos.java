public class Boos extends GameEntity {
Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info(){
        return "урон босса "+ getDamage()+ "жизнь босса" + getHeal() + " супер спасобность" + getWeapon() +
                "weapon: " + weapon.getWeapon();
    }

    }

