public class Hogwarts {
    private String fullName;
    private int powerMagic;
    private int transgression;

    public Hogwarts(String fullName, int powerMagic, int transgression) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент: " + getFullName() +
                ", сила магии: " + getPowerMagic() +
                ", трансгрессия: " + getTransgression();
    }

    public void compareStudents(Hogwarts student) {
        if (this.getPowerMagic() > student.getPowerMagic()) {
            System.out.println(this.getFullName() + " обладает большей силой магии, чем " + student.getFullName() + ".");
        } else if (this.getPowerMagic() < student.getPowerMagic()){
            System.out.println(student.getFullName() + " обладает большей силой магии, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равную силу магии.");
        }

        if (this.getTransgression() > student.getTransgression()) {
            System.out.println(this.getFullName() + " обладает большей дальностью трансгрессии, чем " + student.getFullName() + ".");
        } else if (this.getTransgression() < student.getTransgression()) {
            System.out.println(student.getFullName() + " обладает большей дальностью трансгрессии, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равную дальность трансгрессии.");
        }
    }
}
