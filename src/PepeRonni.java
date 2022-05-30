public class PepeRonni extends Pizza{
    private boolean spicy;


    @Override
    public String toString() {
        String PepeRonny;
        if(spicy){
            PepeRonny = "Этикетка"+
                    "\n------------------------"+
                    "\nПицца: PepeRonni" +
                    "\nВес: "+getWeight()+" грам"+
                    "\nЦена: "+getPrice()+" сом"+
                    "\nОстрый: Да";
        }
        else {
            PepeRonny = "Этикетка"+
                    "\n------------------------"+
                    "\nПицца: PepeRonni" +
                    "\nВес: "+getWeight()+" грам"+
                    "\nЦена: "+getPrice()+" сом"+
                    "\nОстрый: Нет ";
        }
        return PepeRonny;
    }

    public PepeRonni(int price, double weight, boolean spicy) {
        super(price, weight);
        this.spicy = spicy;
        Counter();
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

}
