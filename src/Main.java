public class Main {

    public static void main(String[] args) {
       //  Employee e1= new Employee();
        Address arr=new Address("jammu","jandk",181132);
        Employee e2= new Employee("shivam",arr,"14122003",120000,"dev");


        Employee e3=new Employee();

        System.out.println(e2.toString());
       // System.out.println(arr.toString());

    }
}
