public class App{
    static void main (String [] args){
        bujurSangkar persegi = new bujurSangkar("Kotak", 5);
        lingkaran bulat = new lingkaran("Bunderan", 5);
        persegi.info();
        persegi.luas();
        bulat.info();
        bulat.luas();
    }
}
abstract class bidangDuaDimensi{
    protected String nama;
    public void info(){
        System.out.println("Nama: " + nama);
    }
    public abstract void luas();
}
class bujurSangkar extends bidangDuaDimensi{
    protected double sisi;
    public bujurSangkar(String x, double y){
        this.nama = x;
        this.sisi = y;
    }
    @Override
    public void luas(){
        System.out.printf("Luas: %.2f\n",Math.pow(sisi,2));
    }
}
class lingkaran extends bidangDuaDimensi{
    protected double jari;
    public lingkaran (String x, double y){
        this.nama = x;
        this.jari = y;
    }
    @Override
    public void luas(){
        System.out.printf("Luas: %.2f\n", Math.PI*Math.pow(jari,2));
    }
}