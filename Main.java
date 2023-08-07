public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 40, 50, 60, 70, 80);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 90, 90, 80, 30);
        Gryffindor ronWesley = new Gryffindor("Ron Wesley", 20, 40, 60, 50, 10);
        Hufflepuff cedrickDiggory = new Hufflepuff("Cedrick Diggory", 90, 80, 80, 80, 70);
        Hufflepuff zachariaSmith = new Hufflepuff("Zacharia Smith", 60, 60, 60, 50, 60);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch Fletchley", 30, 40, 60, 50, 70);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 50, 70, 60, 50, 70, 80, 90);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 40, 30, 60, 70, 50, 50, 50);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 30, 50, 40, 50, 40, 60, 70);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 30, 50, 40, 50, 40, 30);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 70, 60, 90, 60, 70, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 60, 40, 80, 40, 50, 60);
        System.out.println(harryPotter);
        harryPotter.gryffindorComareTo(hermioneGranger);
        harryPotter.hogwartsComareTo(dracoMalfoy);
    }
}
