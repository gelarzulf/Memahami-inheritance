public class Bangun_Datar {
   protected String name;
   protected double luas;
   protected double keliling;

   public double getLuas() {
       return this.luas;
   }

   public double getKeliling() {
       return this.keliling;
   }

   public void setNama(String name) {
       this.name = name;
   }

   public void getInfo(){
       System.out.println("Name: " + this.name);
       System.out.println("Luas: " + this.luas);
       System.out.println("Keliling: " + this.keliling);
   }
}