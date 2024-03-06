public class App {

    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7, "lingkaran 1");
        lingkaran1.getInfo();

        System.out.println("\t");
        Persegi persegiA = new Persegi("Persegi A", 5);
        persegiA.getInfo();
        
        System.out.println("\t");
        Segitiga_Sama_Kaki segitigaSamaKaki = new Segitiga_Sama_Kaki("Segitiga Sama Kaki B", 5, 3);
        segitigaSamaKaki.getInfo();

        System.out.println("\t");
        Segitiga_Sama_Sisi segitigaSamaSisi1 = new Segitiga_Sama_Sisi("Segitiga Sama Sisi C", 12);
        segitigaSamaSisi1.getInfo();

        System.out.println("\t");
        Segitiga_Siku_Siku segitigaSikuSiku1 = new Segitiga_Siku_Siku("Segitiga Siku Siku D", 5, 3);
        segitigaSikuSiku1.getInfo();

        System.out.println("\t");
        Segitiga_Sembarang segitigaSembarang1 = new Segitiga_Sembarang("Segitiga Sembarang Normal E", 16, 12, 10, 30);
        segitigaSembarang1.getInfo();
    }
}