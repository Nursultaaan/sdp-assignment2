public abstract class CharacterSpawner {

    public abstract Character createCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory);

    public Character spawnCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory) {
        Character character = createCharacter(level, healthPoints, equipmentFactory);
        System.out.println(" Spawning " + character.getCharacterClass());
        return character;
    }
}

class MeleeCharacterSpawner extends CharacterSpawner {
    @Override
    public Character createCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory) {
        return new MeleeCharacter(level, healthPoints, equipmentFactory);
    }
}

class MageCharacterSpawner extends CharacterSpawner {
    @Override
    public Character createCharacter(int level, int healthPoints, EquipmentFactory equipmentFactory) {
        return new MageCharacter(level, healthPoints, equipmentFactory);
    }
}