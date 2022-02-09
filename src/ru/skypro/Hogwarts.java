package ru.skypro;

public abstract class Hogwarts {

    private String fullName;
    private int powerOfMagic;
    private int distanceOfTransgression;

    public Hogwarts(String fullName, int powerOfMagic, int distanceOfTransgression) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public abstract void studentFacultyQualities();

    public void studentGeneralQualities() {
        System.out.print("PowerOfMagic= " + powerOfMagic);
        System.out.print(", distanceOfTransgression= " + distanceOfTransgression + "; ");
    }

    public void compareStudentsByBasicParam(Hogwarts student) {
        comparePowerOfMagic(student);
        compareDistanceOfTransgression(student);
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    @Override
    public String toString() {
        return fullName;
    }

    private void compareDistanceOfTransgression(Hogwarts student) {
        if (distanceOfTransgression > student.getDistanceOfTransgression()) {
            System.out.println(this + " has more distance of transgression than " + student);
        } else if (distanceOfTransgression < student.getDistanceOfTransgression()) {
            System.out.println(student + " has more distance of transgression than " + this);
        } else {
            System.out.println(this + " and " + student + " have the same distance of transgression");
        }
    }

    private void comparePowerOfMagic(Hogwarts student) {
        if (powerOfMagic > student.getPowerOfMagic()) {
            System.out.println(this + " has more power of magic than " + student);
        } else if (powerOfMagic < student.getPowerOfMagic()) {
            System.out.println(student + " has more power of magic than " + this);
        } else {
            System.out.println(this + " and " + student + " has the same power of magic");
        }
    }
}
