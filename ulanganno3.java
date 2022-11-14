import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class ulanganno3 {



        int jumkopi = 4;
        static int jumlahtotalpenerima = 1250;

        public static String[] dontbelate = new String[400];

        public static String[] goncanganjiwa = new String[300];

        public static String[] jalankenangan = new String[300];

        public static String[] pahittanparasa = new String[250];

   public static int kopi = dontbelate.length + goncanganjiwa.length + jalankenangan.length + pahittanparasa.length;
   public static int sisa = kopi;


    public static void Printinfopesanankopi() {
        int totaldontbelate = 0;
        int totalsisakopi =0;
        for (int index = 0; index < dontbelate.length; index++) {
            if (dontbelate[index] != null) {
                totaldontbelate++;

            }
        }
        int totalguncanganjiwa = 0;
        for (int index = 0; index < goncanganjiwa.length; index++) {
            if (goncanganjiwa[index] != null) {
                totalguncanganjiwa++;
            }
        }
        int totaljalankenangan = 0;
        for (int index = 0; index < jalankenangan.length; index++) {
            if (jalankenangan[index] != null) {
                totaljalankenangan++;
            }
        }
        int totalpahittanparasa = 0;
        for (int index = 0; index < pahittanparasa.length; index++) {
            if (pahittanparasa[index] != null) {
                totalpahittanparasa++;
            }
        }

        sisa = totalsisakopi - totaldontbelate - totalguncanganjiwa - totaljalankenangan - totalpahittanparasa;
        System.out.println("data hasil penjualan kopi");
        System.out.println("DontBe Late     : " + totaldontbelate + " gelas terjual | " + (dontbelate.length-totaldontbelate) + " gelas tersisa");
        System.out.println("Goncang Jiwa    : " + totalguncanganjiwa + " gelas terjual | " + (goncanganjiwa.length-totalguncanganjiwa) + " gelas tersisa");
        System.out.println("Jalan Kenangan     : " + totaljalankenangan + " gelas terjual | " + (jalankenangan.length-totaljalankenangan) + " gelas tersisa");
        System.out.println("Kopi Pahit Tanpa Rasa : " + totalpahittanparasa + " gelas terjual | " + (pahittanparasa.length-totalpahittanparasa) + " gelas tersisa" );
        totalsisakopi =jumlahtotalpenerima-totaldontbelate-totalguncanganjiwa-totaljalankenangan-totalpahittanparasa;
        System.out.println(" total pembeli dont be late ="+ jumlahtotalpenerima+" | total sisa kopi"+ totalsisakopi);
        System.out.println();

        ArrayList<Integer> penjualan = new ArrayList<>();
        penjualan.add(totaldontbelate);
        penjualan.add(totalguncanganjiwa);
        penjualan.add(totaljalankenangan);
        penjualan.add(totalpahittanparasa);

        Collections.sort(penjualan, Collections.reverseOrder());


        System.out.println("");
        System.out.println("Kopi paling banyak disukai" );

        if (totaldontbelate == penjualan.get(0)) {
            System.out.println("DontBe Late");
        }

        if (totalguncanganjiwa == penjualan.get(0)) {
            System.out.println(" Goncang Jiwa");
        }

        if (totaljalankenangan == penjualan.get(0)) {
            System.out.println("Jalan Kenangan");
        }

        if (totalpahittanparasa == penjualan.get(0)) {
            System.out.println("Pahit Tanpa Rasa");
        }

        System.out.println("");
        System.out.println("Kopi paling tidak disukai pembeli : ");

        if (totaldontbelate == penjualan.get(3)) {
            System.out.println(" DontBe Late");
        }

        if (totalguncanganjiwa== penjualan.get(3)) {
            System.out.println(" Goncang Jiwa");
        }

        if (totaljalankenangan == penjualan.get(3)) {
            System.out.println(" Jalan Kenangan");
        }

        if (totalpahittanparasa == penjualan.get(3)) {
            System.out.println(" Pahit Tanpa Rasa");
        }


    }

    public static void cekindexarray(String[] myarray,String kopi) {
        int indexnow =0;
        for (int index =0; index< myarray.length; index++ ){
            if (myarray[index] != null){
                indexnow =index+1;

            }
        }
        if (indexnow< myarray.length){
            myarray[indexnow]=kopi;

        }
    }
    public static void simpankopi(int angkarandom,String pembeli) {
        switch (angkarandom) {
            case 1:
                cekindexarray(dontbelate, pembeli);
                System.out.println("anda mendapat pesanan kopi dont be latte");
                Printinfopesanankopi();
                break;
            case 2:
                cekindexarray(goncanganjiwa, pembeli);
                System.out.println("anda mendapat pesanan kopi goncangan jiwa ");
                Printinfopesanankopi();
                break;
            case 3:
                cekindexarray(jalankenangan, pembeli);
                System.out.println("anda mendapat pesanan kopi jalan kenangan");
                Printinfopesanankopi();
                break;
            case 4:
                cekindexarray(pahittanparasa, pembeli);
                System.out.println("anda mendapat pesanan kopi pahit tanpa rasa");
                Printinfopesanankopi();
                break;
        }
    }

    public static void inputkopi() {
        Scanner inputdata = new Scanner(System.in);
        while (true) {
            System.out.println(" nama pemesan = ");
            String namapesanan = inputdata.nextLine();
            if (namapesanan.isBlank()) {
                System.out.println("nama pesanan wajib diisi ");
                inputkopi();
            } else {
                Random hasilRandom = new Random();
                int jenisrandom = hasilRandom.nextInt(4) + 1;
                simpankopi(jenisrandom, namapesanan);
            }
        }
    }

    public static void main(String[] args) {
        inputkopi();
    }

}

