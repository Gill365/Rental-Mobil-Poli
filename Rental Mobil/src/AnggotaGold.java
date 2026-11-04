public class AnggotaGold extends AnggotaReguler{
    public AnggotaGold(String id, String nama, Mobil[] mob){
        super(id,nama,mob);
    }

    @Override
    public double hitungBiayaPendaftaran(){
        return super.hitungBiayaPendaftaran()+(super.hitungBiayaPendaftaran() * 0.2);
    }

    @Override
    public double hitungBiayaSewa(){
        return super.hitungBiayaSewa() * 0.90;
    }
}
