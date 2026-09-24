public class Iteration1and2 {

    public static void main() {
        //Iteration 1: Variables
        String name = "Chad";
        int healthPoints = 85;
        int maxHealth = 100;
        int level = 5;
        int experiencePoints = 2300;
        double gold = 156.5;
        boolean isAlive = true;
        char race = 'W';
        String raceClass;
        String[] inventory = {"Sword", "Shield", "Potions", "Beverage", "Meat"};

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

        System.out.println("=== CHARACTER SHEET ===");
        System.out.println("Name: " + name);
        System.out.println("Class: " + race + " (" + raceClass + ")");
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("Level: " + level);
        System.out.println("XP: " + experiencePoints);
        System.out.println("Gold: " + gold);
        System.out.println("Alive: " + isAlive);

        //Iteration 2: Control Structures
        //Status checks:
        if (healthPoints < 25) {
            System.out.println("WARNING: Health critical!");
        }

        if (healthPoints <= 0) {
            isAlive = false;
        }

        //Inventory:
        System.out.println("\n");
        int inventoryCount = inventory.length;
        System.out.println("Inventory (" + inventoryCount + " items): ");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }

        //Level system:
        System.out.println("\n=== STATUS ===");
        if (experiencePoints > 1000) {
            System.out.println("Ready to level up!");
        }

        //Simpel "combat" simulation:
        System.out.println("\n=== COMBAT ===");
        int incomingDamage = 30;
        int healthPoints1 = healthPoints - incomingDamage;

        if (healthPoints > 0) {
            System.out.println(name + " takes " + incomingDamage + " damage!");
            System.out.println("Health: " + healthPoints + " -> " + healthPoints1);
            System.out.println(name + " is still alive.");
        }
    }

}
