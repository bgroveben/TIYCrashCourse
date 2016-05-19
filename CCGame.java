import java.util.Scanner;

public class CCGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name adventurer?");
        String name = input.next();
        System.out.println("Greetings, " + name);

        System.out.println("Choose your weapon, sucka!");
        String weapon = input.next();
        System.out.println("A " + weapon + " is a fine choice " + name + ".");

        Entity player = new Entity(); // Notice how the code is used in the same way as Scanner()
        Entity ogre = new Entity();
        ogre.health = 50;

        while (player.health > 0 && ogre.health > 0) {
            player.health = player.health - ogre.damage;
            System.out.println("Ogre swings with club and does " + ogre.damage + " points of damage.");

            ogre.health = ogre.health - player.damage;
            System.out.println("Player swings with " + weapon + " and does " + player.damage + " points of damage");
        }
        if (player.health < 1) {
            System.out.println("Player loses.");
        }
        else if (ogre.health < 1) {
            System.out.println("Ogre is defeated.");
        }
    }
}

class Entity {
    double health = 100;
    double damage = 10;
}
