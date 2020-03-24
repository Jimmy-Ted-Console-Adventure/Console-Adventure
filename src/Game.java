import java.util.Scanner;

public class Game {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

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

        boolean isReady;

        do{
            System.out.println("Welcome to our game!\n Are you ready to begin? [y/n]");
            String userReady = input.nextLine(); // User Response
            isReady = !userReady.equalsIgnoreCase("y");
//            if (isReady){
//                System.out.println("inside");
//            }
        } while(isReady);
















        //Bonuses
//        Allow the user to specify hero stats and enemy stats.
//        Automate an enemyAttack after each time the hero takes a turn.
//                End the game if either heroHealth or enemyHealth drops to 0.
//        Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.


    }
}
