public class Character {

    private String name;
    private double healthPoints;
    private double maxHealth;
    private int level;
    private int experiencePoints;
    private double gold;
    private boolean isAlive;
    private char race;
    private String[] inventory;

    Character(String name, char race) {
        this.name = name;
        this.race = race;

        this.healthPoints = 100;
        this.maxHealth = 100;
        this.level = 1;
        this.gold = 50;
        this.inventory = new String[] {"Sword", "Shield", "Potion"};

    }
    void printCharacterSheet() {

        String raceClass;

        if (race == 'W') {
            raceClass = "Warrior";
        } else if (race == 'M') {
            raceClass = "Mage";
        } else if (race == 'R') {
            raceClass = "Rogue";
        } else {
            raceClass = "Unknown";
            System.out.println("Not an eligible class");
        }

        System.out.println("\n=== CHARACTER SHEET ===");
        System.out.println("Name: " + name);
        System.out.println("Class: " + race + " (" + raceClass + ")");
        System.out.println("Level: " + level);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("Gold: " + gold);
    }

    void takeDamage(int amount) {
        healthPoints -= amount;
        System.out.println("\n" + name + " takes " + amount + " damage! Health: " + (healthPoints + amount) + " -> " + healthPoints);
    }

    void heal(int amount) {
        healthPoints += amount;
        if (healthPoints > maxHealth) {
            healthPoints = maxHealth;
        }
        System.out.println(name + " heals " + amount + " HP! Health: " + (healthPoints - amount) + " -> " + healthPoints);
    }

    void addGold(double amount) {
        gold += amount;
    }

    boolean removeGold(double amount) {
        if ((gold - amount) > 0) {
            gold -= amount;
            return true;
        } else {
            return false;
        }
    }

    void addXP(int amount) {
        experiencePoints += amount;
        System.out.println(name + " gains " + amount + " XP! Total: " + experiencePoints);
    }

    void levelUp() {
        if (experiencePoints > (level * 1000)) {
            level++;
            experiencePoints -= experiencePoints;
            maxHealth = (maxHealth * 2);
        } else {
            System.out.println("Not ready to level up!");
        }
    }

    boolean isHealthCritical() {
        if (healthPoints < 25) {
            return true;
        } else {
            return false;
        }
    }

    boolean isAlive() {
        if (healthPoints > 0) {
            return true;
        } else {
            return false;
        }
    }

    double getHealthPercentage() {
        double healthPercentage;

        healthPercentage = (healthPoints / maxHealth) * 100;
        return healthPercentage;
    }

    void printInventory() {
        String[] inventory = {"Sword", "Shield", "Potions", "Beverage", "Meat"};

        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }
    }
}
