import javax.lang.model.util.SimpleElementVisitor14;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 60, 51, 71, 67, 81);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Jean Granger", 70, 68, 91, 35, 63);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 62, 81, 34, 72, 64);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 61, 84, 65, 91, 34);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 41, 34, 76, 84, 34);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 64, 80, 34, 75, 68);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 71, 67, 91, 35, 40, 63);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 67, 35, 72, 81, 90, 80);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 61, 58, 39, 19, 80, 97);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 80, 54, 33, 80, 64, 73, 90);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 54, 80, 40, 63, 70, 30, 40);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 64, 61, 70, 34, 61, 50);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(zachariasSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontague);
        System.out.println(gregoryGoyle);

        harryPotter.compare(hermioneGranger);
        zachariasSmith.compare(cedricDiggory);
        padmaPatil.compare(marcusBelby);
        grahamMontague.compare(gregoryGoyle);

        harryPotter.compareStudents(dracoMalfoy);
    }
}