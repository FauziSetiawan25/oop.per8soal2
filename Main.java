import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listItem = new ArrayList<>(){{
            add("SWORD");
            add("SHIELD");
            add("POTION");
        }};
        Player p1 = new Player(10, 50,"wahab");
        Merchant merchant1 = new Merchant(20, 20, listItem);
        Zombie zombie1 = new Zombie(5, 30, Zombie.type.MEELE);
        Zombie zombie2 = new Zombie(5, 15, Zombie.type.RANGED);

        System.out.println("TES INFO OBJEK");
        p1.entityInfo();
        merchant1.entityInfo();
        zombie1.entityInfo();
        zombie2.entityInfo();

        System.out.println("==============\n");

        System.out.println("TES INTERAKSI MERCHANT");
        p1.interact(merchant1);

        System.out.println();
        p1.attack(merchant1);
        p1.attack(merchant1);
        p1.interact(merchant1);
        System.out.println("==============\n");

        System.out.println("TES SERANG ZOMBIE");
        p1.attack(zombie1);
        p1.attack(zombie1);
        p1.attack(zombie1);
        zombie1.attack(p1);
        System.out.println("==============\n");

        System.out.println("TES SERANG PLAYER");
        zombie2.attack(p1);
        zombie2.attack(p1);
        zombie2.attack(p1);
        zombie2.attack(p1);
        p1.interact(merchant1);
        p1.attack(zombie1);




    }
}
