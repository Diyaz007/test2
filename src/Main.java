public class Main {
    public static void main(String[] args) {
        PepeRonni pepeRonni = new PepeRonni(300,280,true);
        pepeRonni.InformationOfPizza();
        System.out.println(pepeRonni);
        Margarita margarita = new Margarita(250,400,false);
        margarita.InformationOfPizza();
        System.out.println(margarita);
        LaFinta laFinta = new LaFinta(460,300,true);
        margarita.InformationOfPizza();
        System.out.println(laFinta);
    }
}
