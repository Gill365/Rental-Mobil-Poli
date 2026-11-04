public class AnggotaPremium extends AnggotaReguler{
    public AnggotaPremium(String id, String nama, Mobil[] mob){
        super(id, nama, mob);
    }

    @Override
    public double hitungBiayaPendaftaran(){
        return super.hitungBiayaPendaftaran()+(super.hitungBiayaPendaftaran() * 0.1);
    }

    @Override
    public double hitungBiayaSewa(){
        return super.hitungBiayaSewa() * 0.95;
    }



}
