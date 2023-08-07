public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void hufflepuffComareTo(Hufflepuff student) {
        if (this.hardworking + this.loyal + this.honest > student.hardworking + student.loyal + student.honest) {
            System.out.printf("%s лучший Пуффендуец, чем %s.\n", this.getName(), student.getName());
        } else if (this.hardworking + this.loyal + this.honest < student.hardworking + student.loyal + student.honest) {
            System.out.printf("%s лучший Пуффендуец, чем %s.\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s хорош ровно так же, как и %s.\n", student.getName(), this.getName());
        }

    }

    public String toString() {
        return "Имя " + getName() + "; Сила магии " + getMagicPower() + "; Расстояние трансгрессии " + getTransgressionDistance() + "; Трудолюбивость " + hardworking + "; Верность " + loyal + "; Честность " + honest;
    }
}
