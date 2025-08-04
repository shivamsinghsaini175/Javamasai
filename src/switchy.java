public class switchy {

    public static void main(String[] args) {
         int i =12;
        do {
            System.out.println("boxer");
            i++;
        }while(i<20);
         switch(i)

         {
             case 1:
                 System.out.println("one");
                 break;
             case 20:
                 System.out.println("twenty");
                 break;

             case 10:
                 System.out.println("ten");
                 break;
             case 15:
                 System.out.println("fifteen");
                 break;
             default:
                 System.out.println("boxer");
         }
    }
}