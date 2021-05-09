package praktikum4;
public class OperasiPembagian extends OperasiBilangan{
    @Override
    protected void set_C(){
        this.c = this.a / this.b;
    }
    @Override
    protected void tampil(){
        System.out.println("Operasi Pembagian:");
        System.out.println("Nilai A = " + this.get_A());
        System.out.println("Nilai B = " + this.get_B());
        System.out.println("Nilai A / B = " + this.get_C());
        System.out.println("");
    }
}