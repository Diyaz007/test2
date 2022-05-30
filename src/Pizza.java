public class Pizza {
    private int price;
    private double weight;
    private static int counterPizza;


    public int Counter(){
        int counter2 = counterPizza++;
        return counter2;
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }


    public void cook(){
        System.out.println("Пицца готовится");
    }
    public void cookEnd(){
        System.out.println("Пицца готова");
    }
    public void deliver(){
        System.out.println("Пицца доставляется");
        System.out.println("------------------------");
    }
    public void preparingPizza(){
        System.out.println("-----------------------");
        System.out.println("Готовится пицца №"+counterPizza);
    }
    public void InformationOfPizza(){
        preparingPizza();
        cook();
        cookEnd();
        deliver();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
