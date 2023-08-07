public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void gryffindorComareTo(Gryffindor student) {
        if (this.bravery + this.honor + this.nobility > student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффендорец, чем %s.\n", this.getName(), student.getName());
        } else if (this.bravery + this.honor + this.nobility < student.nobility + student.honor + student.bravery) {
            System.out.printf("%s лучший Гриффендорец, чем %s.\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s хорош ровно так же, как и %s.\n", student.getName(), this.getName());
        }

    }

    public String toString() {
        return "Имя " + getName() + "; Сила магии " + getMagicPower() + "; Расстояние трансгрессии " + getTransgressionDistance() + "; Благородство " + nobility + "; Честь " + honor + "; Храбрость " + bravery;
    }
}
