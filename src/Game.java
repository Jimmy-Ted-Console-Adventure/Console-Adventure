import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Game {

    public static Scanner input = new Scanner(System.in);
    public static String tableBorder = "+===============+\n";
    public static String statFormat = "| %7s | %-3d |\n";
    public static int currentHealth;
    public static int currentAttack;
    public static int currentMana;
    public static int currentDefense;
    public static int currentSpeed;
    public static int currentStealth;
    public static String heroName;
    public static int enemyHealth;
    public static int enemyAttack;
    public static int enemyMana;
    public static int enemyDefense;
    public static int enemySpeed;
    public static int enemyStealth;

    public static void statTable() {
        System.out.println(heroName);
        System.out.print(tableBorder);
        System.out.printf(statFormat, "Health", currentHealth);
        System.out.printf(statFormat, "Attack", currentAttack);
        System.out.printf(statFormat, "Mana", currentMana);
        System.out.printf(statFormat, "Defense", currentDefense);
        System.out.printf(statFormat, "Speed", currentSpeed);
        System.out.printf(statFormat, "Stealth", currentStealth);
        System.out.print(tableBorder);
    }

    public static void goblinStats() {
        System.out.println("Goblin");
        System.out.print(tableBorder);
        System.out.printf(statFormat, "Health", enemyHealth);
        System.out.printf(statFormat, "Attack", enemyAttack);
        System.out.printf(statFormat, "Mana", enemyMana);
        System.out.printf(statFormat, "Defense", enemyDefense);
        System.out.printf(statFormat, "Speed", enemySpeed);
        System.out.printf(statFormat, "Stealth", enemyStealth);
        System.out.print(tableBorder);
    }


    public static void setTimeout(Runnable runnable, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                runnable.run();
            } catch (Exception e) {
                System.err.println(e);
            }
        }).start();
    }

    public static void createChar() {
//        System.out.println("Choose your race");
//        //race table
//        String yourRace = input.nextLine(); // User Response
//        System.out.println("Enter your class");
        //class table
//        String yourClass = input.nextLine(); // User Response
        System.out.println("Enter your character name");
        heroName = input.nextLine(); // User Response

        System.out.printf("Your name is %s. Correct? [y/n] ", heroName);
        String charConfirm = input.nextLine(); // User Response
        if (!charConfirm.equalsIgnoreCase("y")) {
            createChar();
        }
    }

    public static void diceRoll(int num1) {
        currentHealth = (int) Math.floor(Math.random() * num1) + 1;
        currentAttack = (int) Math.floor(Math.random() * num1) + 1;
        currentMana = (int) Math.floor(Math.random() * num1) + 1;
        currentDefense = (int) Math.floor(Math.random() * num1) + 1;
        currentSpeed = (int) Math.floor(Math.random() * num1) + 1;
        currentStealth = (int) Math.floor(Math.random() * num1) + 1;
    }

    public static void enemyRoll(int num1) {
        enemyHealth = (int) Math.floor(Math.random() * num1) + 1;
        enemyAttack = (int) Math.floor(Math.random() * num1) + 1;
        enemyMana = (int) Math.floor(Math.random() * num1) + 1;
        enemyDefense = (int) Math.floor(Math.random() * num1) + 1;
        enemySpeed = (int) Math.floor(Math.random() * num1) + 1;
        enemyStealth = (int) Math.floor(Math.random() * num1) + 1;
    }


    public static void main(String[] args) {


//        Ask if the user is ready to start. If they type in "yes", start the game.
//        Ask the user for their name. Store this as a variable to personalize the adventure.
//                A classic RPG will have the hero going through different scenarios and battling their enemies.
//        Display enemy stats and hero stats. Properties and values can be assigned by you.
//        For example: Health, Attack Points, etc.
//                Decide on what actions your hero can take.
//                Attack (decreases enemyHealth)
//        Drink potion (adds to heroHealth)
//        Run? (ends the game)
//        Keep asking for user input until the enemyHealth reaches 0, then end the game.

        boolean isReady;// for the do loop below

        do {
            System.out.println("Welcome to our game!\n Are you ready to begin? [y/n]");
            String userReady = input.nextLine(); // User Response
            isReady = !userReady.equalsIgnoreCase("y");
            if (isReady) {
                System.out.println("inside");
            }
        } while (isReady);

        createChar();

        System.out.println("Lets roll for your stats!");
        diceRoll(20);
        //dice function for stats
        //table showing stats

        statTable();

        System.out.println("A story will go here at some point");

        System.out.println("A Goblin appears!!!");
        enemyRoll(20);
        goblinStats();
        System.out.println("Choose your action\n [a]ttack\n [d]fend\n [p]otion\n [f]lee");



        //Bonuses
//        Allow the user to specify hero stats and enemy stats.
//        Automate an enemyAttack after each time the hero takes a turn.
//                End the game if either heroHealth or enemyHealth drops to 0.
//        Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.


    }
}
