public class Ravenclaw extends Hogwarts {
    int ming;
    int wisdom;
    int wit;
    int creation;

    public Ravenclaw(String fullName, int powerMagic, int transgression, int ming, int wisdom, int wit, int creation) {
        super(fullName, powerMagic, transgression);
        this.ming = ming;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMing() {
        return ming;
    }

    public void setMing(int ming) {
        this.ming = ming;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Студент: " + getFullName() +
                ", сила магии: " + getPowerMagic() +
                ", трансгрессия: " + getTransgression() +
                ", ум: " + ming +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", творчество: " + creation;
    }

    public void compare(Ravenclaw student) {
        int powerSum1 = this.getCreation() + this.getMing() + this.getWit() + this.getWisdom();
        int powerSum2 = student.getCreation() + student.getMing() + student.getWit() + student.getWisdom();
        if (powerSum1 > powerSum2) {
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + student.getFullName() + ".");
        } else if (powerSum1 < powerSum2) {
            System.out.println(student.getFullName() + " лучший Когтевранец, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равное количество очков навыков");
        }
    }
}
