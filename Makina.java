public class Makina {
    private String ngjyra;
    private double shpejtesia;
    Makina(){
        this("kuqe", 200); // kur thirret nje konstruktor brenda te njetes klase
        System.out.println("Konstruktori Makina");
    }
    Makina(String ngjyra, double shpejtesia){
        this(253, "Vjollce"); //therret makina 3
        System.out.println("Konstruktori Makina 2");
        this.ngjyra = ngjyra;
        this.shpejtesia = shpejtesia;
    }
    Makina(double shpejtesia, String ngjyra){
        System.out.println("Konstruktori Makina 3");
    }
    String getNgjyra(){
        return ngjyra;
    }
    double getShpejtesia(){
        return shpejtesia;
    }
    void setNgjyra(String ngjyra){
        this.ngjyra=ngjyra;
    }
    void setShpejtesia(double shpejtesia){
        this.shpejtesia=shpejtesia;
    }
}