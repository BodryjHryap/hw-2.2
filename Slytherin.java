public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void slytherinComareTo(Slytherin student) {
        if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower> student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s.\n", this.getName(), student.getName());
        } else if (this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower < student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower) {
            System.out.printf("%s лучший Слизеринец, чем %s.\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s хорош ровно так же, как и %s.\n", student.getName(), this.getName());
        }
    }

    public String toString() {
        return "Имя " + getName() + "; Сила магии " + getMagicPower() + "; Расстояние трансгрессии " + getTransgressionDistance() + "; Хитрость " + cunning + "; Решительность " + determination + "; Амбициозность " + ambition + "; Находчивость" + resourcefulness + "; Жажда власти " + lustForPower;
    }
}
