public class Iteration3and4 {
    
    static String name = "Chad";
    static double healthPoints = 85;
    static double maxHealth = 100;
    static int level = 5;
    static int experiencePoints = 2300;
    static double gold = 156.5;
    static boolean isAlive = true;
    static char race = 'W';

    //Iteration 3: Methods
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
        System.out.println("XP: " + experiencePoints);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);
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
    public void main() {

        printCharacterSheet();

        takeDamage(30);
        heal(20);
        addXP(500);

        if (removeGold(100)) {
            System.out.println("Bought a potion!");
        } else {
            System.out.println("Not enough gold!");
        }

        System.out.println("Health: " + getHealthPercentage() + "%");

        if (isHealthCritical()) {
            System.out.println("WARNING: Find a healer!");
        }

        printCharacterSheet();

/******************************/
//Iteration 4: Objects

        Character hero = new Character("Chad", 'W');
        Character enemy = new Character("Witch", 'M');

        hero.printCharacterSheet();
        enemy.printCharacterSheet();

        //Combat!
        hero.takeDamage(50);
        enemy.takeDamage(60);

        hero.printCharacterSheet();
        enemy.printCharacterSheet();
    }
}
