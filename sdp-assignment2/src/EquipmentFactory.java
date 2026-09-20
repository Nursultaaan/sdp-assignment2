public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
}

class MeleeEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new IronArmor();
    }
}

class MageEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new MagicStaff();
    }
    
    @Override
    public Armor createArmor() {
        return new MagicRobe();
    }
}
