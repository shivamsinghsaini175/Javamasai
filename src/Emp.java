public class Emp extends Person {

    private int empCode;
    private String  designation;
    private float salary;


    public Emp(String name, int age, Address address, int empCode, String designation, float salary) {
        super(name, age, address);
        this.empCode = empCode;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp {" + super.toString()  +
                " , empCode=" + empCode +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                "} ";
    }

    void applyForLeave(){
        System.out.println(getName()+"  is on leave");
    }
}
