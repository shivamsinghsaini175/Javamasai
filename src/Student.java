public class Student extends Person{

    private int rollNo;
    private String grade;

    public Student(String name, int age, Address address, int rollNo, String grade) {
        super(name, age, address);
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                " , rollNo=" + rollNo +
                ", grade='" + grade +" } " ;
    }
}
