public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void hogwartsComareTo(Hogwarts student) {
        if (this.magicPower + this.transgressionDistance> student.magicPower + student.transgressionDistance) {
            System.out.printf("%s лучший студент Хогвартса, нежели чем %s.\n", this.getName(), student.getName());
        } else if (this.magicPower + this.transgressionDistance < student.magicPower + student.transgressionDistance) {
            System.out.printf("%s лучший студент Хогвартса, нежели чем %s.\n", student.getName(), this.getName());
        } else {
            System.out.printf("%s хорош ровно так же, как и %s.\n", student.getName(), this.getName());
        }

    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
