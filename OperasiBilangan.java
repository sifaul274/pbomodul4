package praktikum4;
public class OperasiBilangan {
    protected double a, b, c;
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
    }
    protected double get_A(){
        return this.a;
    }
    protected double get_B(){
        return this.b;
    }
    protected double get_C(){
        return this.c;
    }
    protected void tampil(){
        System.out.println("Operasi Bilangan");
    }
}