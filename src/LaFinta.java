public class LaFinta extends Pizza{
    private boolean withMushrooms;

    @Override
    public String toString() {
        String LaFinta;
        if(withMushrooms){
             LaFinta = "Этикетка"+
                     "\n------------------------"+
                     "\nПицца: LaFinta" +
                     "\nВес: "+getWeight()+" грам"+
                     "\nЦена: "+getPrice()+" сом"+
                     "\nС грибами: Да";
        }
        else {
            LaFinta = "Этикетка"+
                    "\n------------------------"+
                    "\nПицца: LaFinta" +
                    "\nВес: "+getWeight()+" грам"+
                    "\nЦена: "+getPrice()+" сом"+
                    "\nС грибами: Нет ";
        }
        return LaFinta;
    }

    public LaFinta(int price, double weight, boolean withMushrooms) {
        super(price, weight);
        this.withMushrooms = withMushrooms;
        Counter();
    }

    public boolean isWithMushrooms() {
        return withMushrooms;
    }

    public void setWithMushrooms(boolean withMushrooms) {
        this.withMushrooms = withMushrooms;
    }
}
