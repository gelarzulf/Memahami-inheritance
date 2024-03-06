public class Segitiga_Sama_Kaki extends Segitiga {
    protected double sisi;
    protected double alas;
    protected double tinggi;
    
    public Segitiga_Sama_Kaki(String name, double sisi, double alas) {
        super.setNama(name);
        this.alas = alas;
        this.sisi = sisi;

        setTinggi();
        super.setSegitiga(this.alas, this.tinggi, this.sisi, this.sisi, this.alas);

        super.hitungKeliling();
        super.hitungLuas();
    }

    private void setTinggi() {
        this.tinggi = Math.round(Math.sqrt(Math.pow(this.sisi, 2) - Math.pow((0.5 * this.alas), 2)) * 100.0)/ 100.0;
    }
}