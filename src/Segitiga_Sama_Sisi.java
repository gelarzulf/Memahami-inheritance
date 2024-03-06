public class Segitiga_Sama_Sisi extends Segitiga{
    protected double sisi;
    protected double tinggi;

    public Segitiga_Sama_Sisi(String name, double sisi) {
        super.setNama(name);
        
        this.sisi = sisi;
        setTinggi();

        super.setSegitiga(this.sisi, this.tinggi, this.sisi, this.sisi, this.sisi);
        super.hitungLuas();
        super.hitungKeliling();

    }

    private void setTinggi() {
        this.tinggi = Math.round((Math.sqrt(3)/2) * this.sisi * 100.0) / 100.0;
    }
}