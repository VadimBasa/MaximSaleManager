public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }


    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = 1;
        for (int sale : sales) {
            if (sale <= min) {
                min = sale;
            }
        }
        return min;
    }
    public int srednee(){
        int srednee = 0;
        for (int i = 0; i <sales.length ; i++) {
            srednee +=sales[i];
        }
        srednee =srednee- min()- max();
        srednee = srednee / (sales.length -2);
        return srednee;
    }
}