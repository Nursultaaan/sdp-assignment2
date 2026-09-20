public abstract class Character {
    private final String characterClass;
    private final int level;
    private final int healthPoints;
    private final Weapon weapon;
    private final Armor armor;

    public Character(String characterClass, int level, int healthPoints, EquipmentFactory equipmentFactory) {
        if (level < 1) {
            throw new IllegalArgumentException("Character level must be greater than 0");
        }
        if (healthPoints <= 0) {
            throw new IllegalArgumentException("HP must be greater than 0 ");
        }
        if (equipmentFactory == null) {
            throw new IllegalArgumentException("Equipment factory can't be emptys ");
        }

        this.characterClass = characterClass;
        this.level = level;
        this.healthPoints = healthPoints;
        this.weapon = equipmentFactory.createWeapon();
        this.armor = equipmentFactory.createArmor();
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getWeapon() {
        return weapon.getWeaponName();
    }

    public String getArmor() {
        return armor.getArmorName();
    }

    public void displayStats() {
        System.out.println("Class: " + characterClass +
                " Level: " + level +
                " HP: " + healthPoints +
                " Weapon: " + weapon.getWeaponName() +
                " Weapon Damage: " + weapon.getDamage() +
                " Armor: " + armor.getArmorName() +
                " Armor Defense: " + armor.getDefense());
    }
}

class MeleeCharacter extends Character {
    public MeleeCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory) {
        super("Melee", level, healthPoints, equipmentFactory);
    }
}

class MageCharacter extends Character {
    public MageCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory) {
        super("Mage", level, healthPoints, equipmentFactory);
    }
}