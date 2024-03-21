import units.*;

public class Main {
    public static void main(String[] args) {

        Peasant pearent = new Peasant("Bob", 35);
        Robber rober = new Robber("Alex", 22);
        Sniper sniper = new Sniper("Robin", 27);
        Wizard wizard = new Wizard("Saruman", 88);
        Pikeman pikeman = new Pikeman("John", 18);
        Crossbowman crossbowman = new Crossbowman("Mira", 30);
        Monk monk = new Monk("George", 65);

        System.out.println(pearent);
        System.out.println(rober);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(pikeman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}