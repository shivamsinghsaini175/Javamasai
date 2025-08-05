public class Employee {

    private String employeeName;
    private String employeeDesignation;
    int employeeSalary;
    String employeeDob;
    private Address employeeAddress;


    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public Employee() {
    }

    public Employee(String employeeName, Address employeeAddress, String employeeDob, int employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeDob = employeeDob;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(String employeeDob) {
        this.employeeDob = employeeDob;
    }

//    public String getEmployeeAddress() {
//        return employeeAddress;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDob=" + employeeDob +
                ", employeeAddress='" + employeeAddress.toString()+ '\'' +
                '}';
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }


}
