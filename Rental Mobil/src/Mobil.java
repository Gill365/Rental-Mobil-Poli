public class Mobil {
    public String noPlatMobil;
    public String merk;
    public int jam;
    public int biayaSewaPerjam;

    public Mobil(String noPlatMobil, String merk, int jam, int biayaSewaPerjam){
        this.noPlatMobil = noPlatMobil;
        this.merk = merk;
        this.jam= jam;
        this.biayaSewaPerjam = biayaSewaPerjam;
    }

    public void tampilData(){
        System.out.println("NO PLAT MOBIL = "+ noPlatMobil);
        System.out.println("MERK = "+ merk);
        System.out.println("ESTIMASI SEWA = "+jam+" JAM");
        System.out.println("BIAYA SEWA PERJAM = "+ biayaSewaPerjam);
        System.out.println("***************************");
    }
}
