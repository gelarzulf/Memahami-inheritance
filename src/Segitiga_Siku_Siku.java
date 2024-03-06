public class Segitiga_Siku_Siku extends Segitiga {
    protected double sisiMiring;
    protected double alas;
    protected double tinggi;

    public Segitiga_Siku_Siku(String name, double sisiMiring, double alas) {
        super.setNama(name);
        this.sisiMiring = sisiMiring;
        this.alas = alas;

        setTinggi();
        super.setSegitiga(this.alas, this.tinggi, this.alas, this.sisiMiring, this.sisiMiring);

        super.hitungKeliling();
        super.hitungLuas();
    }

    private void setTinggi() {
        this.tinggi = Math.round(Math.sqrt(Math.pow(this.sisiMiring, 2) - Math.pow(this.alas, 2)) * 100.0) / 100.0;
        // System.out.println("cek tinggi siku siku " + this.tinggi);
    }
}