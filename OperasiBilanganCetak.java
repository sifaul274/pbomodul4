package praktikum4;
public class OperasiBilanganCetak {
    private static void cetakSemua(OperasiBilangan[]OB, double a, double b){
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilangan[] arr1 = new OperasiBilangan[4];
        cetakSemua(arr1, 10.5, 0.5);
    }
}