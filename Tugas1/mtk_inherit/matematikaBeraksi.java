package Tugas1.mtk_inherit;

public class matematikaBeraksi {
    public static void main(String[] args) {
        matematika matematika = new matematika();
        
        System.out.println("Pertambahan : 20 + 10 = " + matematika.pertambahan(20,10));
        System.out.println("Pengurangan : 10 - 5 = " + matematika.pengurangan(10,5));
        System.out.println("Perkalian : 10 x 3 = " + matematika.perkalian(10, 3));
        System.out.println("Pembagian : 21 / 2 = " + matematika.pembagian(21, 2));
    }
}
