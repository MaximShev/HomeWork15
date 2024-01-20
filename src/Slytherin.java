public class Slytherin extends Hogwarts {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int lustForPower;

    public Slytherin(String fullName, int powerMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, powerMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Студент: " + getFullName() +
                ", сила магии: " + getPowerMagic() +
                ", трансгрессия: " + getTransgression() +
                ", хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + lustForPower;
    }

    public void compare(Slytherin student) {
        int powerSum1 = this.getLustForPower() + this.getAmbition() + this.getCunning() + this.getDetermination() + this.getResourcefulness();
        int powerSum2 = student.getLustForPower() + student.getAmbition() + student.getCunning() + student.getDetermination() + student.getResourcefulness();
        if (powerSum1 > powerSum2) {
            System.out.println(this.getFullName() + " лучший Когтевранец, чем " + student.getFullName() + ".");
        } else if (powerSum1 < powerSum2) {
            System.out.println(student.getFullName() + " лучший Когтевранец, чем " + this.getFullName() + ".");
        } else {
            System.out.println(this.getFullName() + " и " + student.getFullName() + " имеют равное количество очков навыков");
        }
    }
}
