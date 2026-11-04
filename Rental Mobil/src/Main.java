//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mobil mbl01 = new Mobil("AA 6010 F", "Avanza", 5, 220000);
        Mobil mbl02 = new Mobil("AA 4125 EK", "Innova", 5, 300000);
        Mobil mbl03 = new Mobil("AA 4128 EEK", "Xenia", 5, 200000);
        Mobil mobArr[] ={mbl01, mbl02, mbl03};
        AnggotaReguler argl = new AnggotaReguler("R-001", "Nisa", mobArr);
        argl.tampilData();


        System.out.println();
        System.out.println();
        AnggotaReguler aprm = new AnggotaPremium("P-034", "Amrudin Sniper", mobArr);
        aprm.tampilData();

        System.out.println();
        System.out.println();
        AnggotaReguler agld = new AnggotaGold("P-002", "Khtb Rocket Bunny", mobArr);
        agld.tampilData();

    }
}