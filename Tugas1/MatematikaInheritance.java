package Tugas1;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 resultAkhir = new Matematika2();
        System.out.println("Hasil Pertambahan 10 + 2 = "+resultAkhir.pertambahan(10,2));
        System.out.println("Hasil Pengurangan 10 - 2 = "+resultAkhir.pengurangan(10,2));
        System.out.println("Hasil Pembagian 10 / 2 = "+resultAkhir.pembagian(10,2));
        System.out.println("Hasil Perkalian 10 x 2 = "+resultAkhir.perkalian(10,2));
        System.out.println("Hasil Modulus 10 % 2 = "+resultAkhir.modulus(10, 2));
    }
}
