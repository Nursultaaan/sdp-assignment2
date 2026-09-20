public interface Armor {
    String getArmorName();
    int getDefense();
}

class IronArmor implements Armor {
    @Override
    public String getArmorName() {
        return "Iron Armor";
    }

    @Override
    public int getDefense() {
        return 50;
    }
}

class MagicRobe implements Armor {
    @Override
    public String getArmorName() {
        return "Magic Robe";
    }

    @Override
    public int getDefense() {
        return 20;
    }
}

