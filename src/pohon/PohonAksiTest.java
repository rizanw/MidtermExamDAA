package pohon;
class PohonAksiTest extends DAA1 { 
    public static void main (String args[]) {
        // ==========
        // Pohon.java
        // ==========
        // pohon1 -> pohon kosong
        System.out.println("Buat pohon1 -> pohon baru = kosong");
        Pohon pohon1 = new Pohon();
        // nilai()
        System.out.println("Nilai dari pohon1 adalah " + pohon1.nilai);
        System.out.println("pohon1: " + pohon1);
        // pohon1 -> adalahKosong()
        System.out.println("Cek jika pohon1 adalah pohon kosong");
        if (pohon1.adalahKosong()) {
            System.out.println("pohon1 adalah pohon kosong");
        } else {
            System.out.println("pohon1 bukan pohon kosong");
        }
        // pohon2 -> 9
        System.out.println("Buat pohon2 -> pohon baru dengan akar bernilai 9");
        Pohon pohon2 = new Pohon(9);
        System.out.println("Nilai dari pohon2 adalah " + pohon2.nilai);
        System.out.println("pohon2: " + pohon2);
        // pohon2 -> adalahKosong()
        System.out.println("Cek jika pohon2 adalah pohon kosong");
        if (pohon2.adalahKosong()) {
            System.out.println("pohon2 adalah pohon kosong");
        } else {
            System.out.println("pohon2 bukan pohon kosong");
        }
        // pohon3 -> 12
        System.out.println("Buat pohon3 -> pohon baru dengan akar bernilai 12");
        Pohon pohon3 = new Pohon(12);
        System.out.println("Nilai dari pohon3 adalah " + pohon3.nilai);
        System.out.println("pohon3: " + pohon3);
        // pohon4 -> 15
        System.out.println("Buat pohon4 -> pohon baru dengan akar bernilai 15");
        Pohon pohon4 = new Pohon(15);
        System.out.println("pohon4: " + pohon4);
        // pohon5 -> akar bernilai 13 dengan cabang kiri pohon3 (12) dan cabang 
        // kanan pohon4 (15)
        System.out.println("Buat pohon5 -> pohon baru dengan akar bernilai 13");
        System.out.println("dengan cabang kiri pohon3 (12) & cabang kanan pohon4 (15)");
        Pohon pohon5 = new Pohon(13, pohon3, pohon4);
        System.out.println("Nilai dari pohon5 adalah " + pohon5.nilai);
        System.out.println("pohon5:");
        System.out.println(pohon5);
        // kiri
        System.out.println("Cabang kiri dari pohon5 adalah:" + pohon5.kiri);
        // kanan
        System.out.println("Cabang kanan dari pohon5 adalah:" + pohon5.kanan);
        // pohon6 -> 15
        System.out.println("Buat pohon6 -> pohon baru dengan akar bernilai 15");
        Pohon pohon6 = new Pohon(15);
        System.out.println("pohon6: " + pohon6);
        // Bandingkan antara pohon4 yang bernilai 15 dengan pohon6 yang juga bernilai 15
        if (pohon4.equals(pohon6)) {
            System.out.println("pohon4 sama nilainya dengan pohon6");
        } else {
            System.out.println("pohon4 tidak sama nilainya dengan pohon6");
        }
        // ==============
        // PohonAksi.java
        // ==============
        // tinggi()
        System.out.println("Tinggi dari pohon5 adalah " + PohonAksi.tinggi(pohon5));
        // tigaKali()
        System.out.println("tigaKali() dari pohon5 adalah:");
        System.out.println(PohonAksi.tigaKali(pohon5));
        // inorder
        System.out.println("inorder() dari pohon5 adalah:" + PohonAksi.inorder(pohon5));
        // cetak()
        System.out.println("cetak() dari pohon5 adalah:");
        PohonAksi.cetak(pohon5);
        System.out.println();
    }
}