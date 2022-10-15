package Day46.StudentReg;

public class Registration {
    String StudentName;
    Months months;

    public Registration(String studentName, Months months) {
        this.StudentName = studentName;
        this.months = months;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "StudentName='" + StudentName + '\'' +
                ", months=" + months +
                '}';
    }
}
