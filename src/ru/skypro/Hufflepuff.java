package ru.skypro;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int powerOfMagic, int distanceOfTransgression, int diligence, int loyalty, int honesty) {
        super(fullName, powerOfMagic, distanceOfTransgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void studentFacultyQualities() {
        studentGeneralQualities();
        System.out.println("diligence= " + diligence + ", loyalty= " + loyalty + ", honesty= " + honesty);
    }

    public void compareStudents(Hufflepuff student) {
        compareDiligence(student);
        compareLoyalty(student);
        compareHonesty(student);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private void compareHonesty(Hufflepuff student) {
        if (honesty > student.getHonesty()) {
            System.out.println(this + " is more honest than " + student);
        } else if (honesty < student.getHonesty()) {
            System.out.println(student + " is more honest than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same honest");
        }
    }

    private void compareLoyalty(Hufflepuff student) {
        if (loyalty > student.getLoyalty()) {
            System.out.println(this + " is more loyal than " + student);
        } else if (loyalty < student.getLoyalty()) {
            System.out.println(student + " is more loyal than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same loyal");
        }
    }

    private void compareDiligence(Hufflepuff student) {
        if (diligence > student.getDiligence()) {
            System.out.println(this + " is more hardworking than " + student);
        } else if (diligence < student.getDiligence()) {
            System.out.println(student + " is more hardworking than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same hardworking");
        }
    }
}
