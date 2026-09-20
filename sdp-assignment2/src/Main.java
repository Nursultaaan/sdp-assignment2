public class Main {
    public static void main(String[] args) {
        EquipmentFactory meleeEquipment = new MeleeEquipmentFactory();
        EquipmentFactory mageEquipment = new MageEquipmentFactory();

        CharacterSpawner meleeSpawner = new MeleeCharacterSpawner();
        CharacterSpawner mageSpawner = new MageCharacterSpawner();

        Character mage = mageSpawner.spawnCharacter(12, 250, mageEquipment);
        mage.displayStats();


        Character melee = meleeSpawner.spawnCharacter(10, 100, meleeEquipment);
        melee.displayStats();
    }
}