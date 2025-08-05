
        public class Main {
            public static void main(String[] args) {
                Address a1 =new Address("jammu","j&k",180004 );
                Person p1=new Person("Shivam",22,a1);

                Student s1=new Student(p1.getName(), p1.getAge(),a1,102,"8.2cgpa");

                Emp e3=new Emp(p1.getName(), p1.getAge(),a1,279993,"Ass.Manager",62000);

                System.out.println(s1);
                System.out.println();

                System.out.println(e3);
                System.out.println();


    }
}
