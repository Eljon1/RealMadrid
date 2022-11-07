public class Studenti {
    private String emri;

    Studenti(){
        this.emri = "I panjohuri";
    }
    Studenti(String emri){
        this.emri = emri;
    }

    void  setEmri(String emri){
        this.emri=emri;
    }

    String getEmri(){
        return emri;
    }
}