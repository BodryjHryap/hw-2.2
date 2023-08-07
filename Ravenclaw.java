public class Ravenclaw extends Hogwarts{
    private int smart;
    private int vise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int vise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.vise = vise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void ravenclawComareTo(Ravenclaw student) {
        if (this.smart + this.vise + this.witty + this.creativity > student.smart + student.vise + student.witty + student.creativity) {
            System.out.printf("%s лучший Когтевранец, чем %s.\n", this.getName(), student.getName());
        } else if (this.smart + this.vise + this.witty + this.creativity < student.smart + student.vise + student.witty + student.creativity) {
            System.out.printf("%s лучший Когтевранец, чем %s.\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s хорош ровно так же, как и %s.\n", student.getName(), this.getName());
        }

    }

    public String toString() {
        return "Имя " + getName() + "; Сила магии " + getMagicPower() + "; Расстояние трансгрессии " + getTransgressionDistance() + "; Ум " + smart + "; Мудрость " + vise + "; Остроумие " + witty + "; Креативность" + creativity;
    }
}
