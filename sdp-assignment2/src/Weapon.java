public interface  Weapon {
    String getWeaponName();
    int getDamage();
}

class Sword implements Weapon {
    @Override
    public String getWeaponName() {
        return "Sword";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}

class MagicStaff implements Weapon {
    @Override
    public String getWeaponName() {
        return "Magic Staff";
    }

    @Override
    public int getDamage() {
        return 40;
    }
}