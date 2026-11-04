public class AnggotaReguler {
    public String id;
    public String nama;
    public Mobil[] mob;


    public AnggotaReguler(String id, String nama,Mobil[] mob){
        this.id = id;
        this.nama = nama;
        this.mob = mob;
    }
    public double hitungBiayaPendaftaran(){
        return 100000;
    }

    public double hitungBiayaSewa(){
        double total  = 0;
        if (mob == null){
            return total;
        }

        for (Mobil m : mob){
            if (m != null){
                total += m.jam * m.biayaSewaPerjam;
            }
        }
        return total;
    }


    public void tampilData(){
        System.out.println("ID ANGGOTA = "+ id);
        System.out.println("NAMA ANGGOTA = "+ nama);
        System.out.println("MOBIL DI SEWA : ");

        if (mob != null){
            for (Mobil mobil : mob){
                if (mobil !=null){
                    mobil.tampilData();
                }
            }
        }
        System.out.println("BIAYA PENDAFTARAN = RP."+hitungBiayaPendaftaran());
        System.out.println("BIAYA SEWA = RP."+hitungBiayaSewa());
    }
}
