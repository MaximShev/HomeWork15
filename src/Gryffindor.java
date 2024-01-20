import java.sql.SQLOutput;

public class Gryffindor extends Hogwarts {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(String fullName, int powerMagic, int transgression, int nobility, int honor, int bravery) {
        super(fullName, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент: " + getFullName() +
                ", сила магии: " + getPowerMagic() +
                ", трансгрессия: " + getTransgression() +
                ", благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }

    public void compare(Gryffindor student) {
        int powerSum1 = this.getNobility() + this.getHonor() + this.getBravery();
        int powerSum2 = student.getNobility() + student.getHonor() + student.getBravery();
        if (powerSum1 > powerSum2) {
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + student.getFullName() + ".");
        } else if (powerSum1 < powerSum2) {
            System.out.println(student.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равное количество очков навыков");
        }
    }
}
