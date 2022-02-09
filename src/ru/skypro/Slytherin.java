package ru.skypro;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String fullName, int powerOfMagic, int distanceOfTransgression, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public void studentFacultyQualities() {
        studentGeneralQualities();
        System.out.print("cunning= " + cunning + ", determination= " + determination);
        System.out.print(", ambition= " + ambition + ", resourcefulness =" + resourcefulness);
        System.out.println(", thirstForPower= " + thirstForPower);
    }

    public void compareStudents(Slytherin student) {
        compareCunning(student);
        compareDetermination(student);
        compareAmbition(student);
        compareResourcefulness(student);
        compareThirstForPower(student);
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    private void compareThirstForPower(Slytherin student) {
        if (thirstForPower > student.getThirstForPower()) {
            System.out.println(this + " has more thirst for power than " + student);
        } else if (thirstForPower < student.getThirstForPower()) {
            System.out.println(student + " is more thirst for power than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same thirst for power");
        }
    }

    private void compareResourcefulness(Slytherin student) {
        if (resourcefulness > student.getResourcefulness()) {
            System.out.println(this + " is more resourceful than " + student);
        } else if (resourcefulness < student.getResourcefulness()) {
            System.out.println(student + " is more resourceful than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same resourceful");
        }
    }

    private void compareAmbition(Slytherin student) {
        if (ambition > student.getAmbition()) {
            System.out.println(this + " is more ambitious than " + student);
        } else if (ambition < student.getAmbition()) {
            System.out.println(student + " is more ambitious than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same ambitious");
        }
    }

    private void compareDetermination(Slytherin student) {
        if (determination > student.getDetermination()) {
            System.out.println(this + " is more determined than " + student);
        } else if (determination < student.getDetermination()) {
            System.out.println(student + " is more determined than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same determined");
        }
    }

    private void compareCunning(Slytherin student) {
        if (cunning > student.getCunning()) {
            System.out.println(this + " is more cunning than " + student);
        } else if (cunning < student.getCunning()) {
            System.out.println(student + " is more cunning than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same cunning");
        }
    }
}
