package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika nizar = new Matematika(2,4);
        
        System.out.println("Hasil penjumlahan: "+nizar.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+nizar.setPengurangan());
        System.out.println("Hasil perkalian: "+nizar.setPerkalian());
        System.out.println("Hasil pembagian: "+nizar.setPembagian());
    }
    
}