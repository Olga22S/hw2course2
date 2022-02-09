package ru.skypro;

public class Ravenclaw extends Hogwarts {

    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int powerOfMagic, int distanceOfTransgression, int smart, int wisdom, int wit, int creativity) {
        super(fullName, powerOfMagic, distanceOfTransgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void studentFacultyQualities() {
        studentGeneralQualities();
        System.out.print("smart= " + smart + ", wisdom= " + wisdom);
        System.out.println(", wit= " + wit + ", creativity= " + creativity);
    }

    public void compareStudents(Ravenclaw student) {
        compareSmart(student);
        compareWisdom(student);
        compareWit(student);
        compareCreativity(student);
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    private void compareCreativity(Ravenclaw student) {
        if (creativity > student.getCreativity()) {
            System.out.println(this + " is more creative than " + student);
        } else if (creativity < student.getCreativity()) {
            System.out.println(student + " is more creative than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same creative");
        }
    }

    private void compareWit(Ravenclaw student) {
        if (wit > student.getWit()) {
            System.out.println(this + " is more witty than " + student);
        } else if (wit < student.getWit()) {
            System.out.println(student + " is more witty than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same witty");
        }
    }

    private void compareWisdom(Ravenclaw student) {
        if (wisdom > student.getWisdom()) {
            System.out.println(this + " is more wiser " + student);
        } else if (wisdom < student.getWisdom()) {
            System.out.println(student + " is more wiser than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same wiser");
        }
    }

    private void compareSmart(Ravenclaw student) {
        if (smart > student.getSmart()) {
            System.out.println(this + " is smarter than " + student);
        } else if (smart < student.getSmart()) {
            System.out.println(student + " is smarte than " + this);
        } else {
            System.out.println(this + " and " + student + " are the same smart");
        }
    }
}
