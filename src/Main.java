import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]sales = new int[]{1,3,7,9,3,100,50};

        SalesManager Manager =new SalesManager(sales);
        {
            //System.out.println(Manager.max());
            System.out.println(Manager.srednee());
            //System.out.println(Manager.min());

        }

    }
}
