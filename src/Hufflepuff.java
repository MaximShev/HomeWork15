public class Hufflepuff extends Hogwarts {
    int hardWork;
    int loyalty;
    int honesty;

    public Hufflepuff(String fullName, int powerMagic, int transgression, int hardWork, int loyalty, int honesty) {
        super(fullName, powerMagic, transgression);
        this.hardWork = hardWork;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Студент: " + getFullName() +
                ", сила магии: " + getPowerMagic() +
                ", трансгрессия: " + getTransgression() +
                ", трудолюбие: " + hardWork +
                ", верность: " + loyalty +
                ", честность: " + honesty;
    }

    public void compare(Hufflepuff student) {
        int powerSum1 = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int powerSum2 = student.getHardWork() + student.getLoyalty() + student.getHonesty();
        if (powerSum1 > powerSum2) {
            System.out.println(this.getFullName() + " лучший Пуффендуец, чем " + student.getFullName() + ".");
        } else if (powerSum1 < powerSum2) {
            System.out.println(student.getFullName() + " лучший Пуффендуец, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равное количество очков навыков");
        }
    }
}
