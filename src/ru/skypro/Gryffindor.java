package ru.skypro;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int powerOfMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void studentFacultyQualities() {
        studentGeneralQualities();
        System.out.println("nobility= " + nobility + ", honor= " + honor + ", bravery " + bravery);
    }

    public void compareStudents(Gryffindor student) {
        compareNobility(student);
        compareHonor(student);
        compareBravery(student);
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private void compareNobility(Gryffindor student) {
        if (nobility > student.getNobility()) {
            System.out.println(this + " is more noble than " + student);
        } else if (nobility < student.getNobility()) {
            System.out.println(student + " is more noble than " + this);
        } else {
            System.out.println(this + " and " + student + " are same noble");
        }
    }

    private void compareHonor(Gryffindor student) {
        if (honor > student.getHonor()) {
            System.out.println(this + " has more honor than " + student);
        } else if (honor < student.getHonor()) {
            System.out.println(student + " has more honor than " + this);
        } else {
            System.out.println(this + " and " + student + " have the same honor");
        }
    }

    private void compareBravery(Gryffindor student) {
        if (bravery > student.getBravery()) {
            System.out.println(this + " is braver than " + student);
        } else if (bravery < student.getBravery()) {
            System.out.println(student + " is braver than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same brave");
        }
    }
}
