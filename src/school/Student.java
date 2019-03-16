package school;

public class Student {

    private String name;
    private int studentId;
    private static int numberOfCredits;
    private double gpa;


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }



    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name=aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId=aStudentId;
    }

    public static int getNumberOfCredits() {

        return numberOfCredits;
    }

    public static void setNumberOfCredits(int aNumberOfCredits) {

        numberOfCredits = getNumberOfCredits() + aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    protected void setGpa(double aGpa) {
        gpa=aGpa;
    }


    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        Double qualityScore;

        numberOfCredits = numberOfCredits + courseCredits;
       qualityScore = (gpa * numberOfCredits) + (grade * courseCredits);
       numberOfCredits = numberOfCredits + courseCredits;
       gpa = qualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits < 30) {
            return "Freshman";
        }

        else if ((numberOfCredits >= 30) && (numberOfCredits < 60)) {
            return "Sophomore";
        }

        else if ((numberOfCredits >= 60) && (numberOfCredits < 90)) {
            return "Junior";
        }

        else
            return "Senior";
    }

    //override default toString method
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    // override default equals method
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }
}


