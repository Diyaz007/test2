public class Margarita extends Pizza{
    private boolean withMeat;

    @Override
    public String toString() {
        String Margarita;
        if(withMeat){
            Margarita = "Этикетка"+
                    "\n------------------------"+
                    "\nПицца: Margarita" +
                    "\nВес: "+getWeight()+" грам"+
                    "\nЦена: "+getPrice()+
                    "\nС мясом: Да";
        }
        else {
            Margarita = "Этикетка"+
                    "\n------------------------"+
                    "\nПицца: Margarita" +
                    "\nВес: "+getWeight()+" грам"+
                    "\nЦена: "+getPrice()+" сом"+
                    "\nС мясом: Нет ";
        }
        return Margarita;
    }

    public Margarita(int price, double weight, boolean withMeat) {
        super(price, weight);
        this.withMeat = withMeat;
        Counter();
    }

    public boolean isWithMeat() {
        return withMeat;
    }

    public void setWithMeat(boolean withMeat) {
        this.withMeat = withMeat;
    }



}
