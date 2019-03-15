package pohon;

import uts.ListKu;
import uts.ListKuFungsi;

public class DAA1 extends Pohon {

    // Binary Search Tree (BST)
    // 1. adalahBST() [20 points]
    public static boolean adalahBST (Pohon p) {
        // Write your codes in here
        //...
        // Write your codes in here
        return adalahBST(p, Integer.MIN_VALUE, Integer.MAX_VALUE, 1);
        
    }

    // Fungsi bantuan untuk adalahBST
    // Mendapatkan nilai boolean untuk mengetahui jika p adalah BST (Binary
    // Search Tree) di mana nilainya adalah di antara
    // jangkauan batasBawah dan batasAtas
    private static boolean adalahBST (Pohon p, int batasBawah, int batasAtas, int i) {
        // Write your codes in here
        //...
        // Write your codes in here     
        if (p == null)
            return true;
        System.out.println(i + " " + p.nilai + " " + batasBawah + " " + batasAtas);
        i+=1;
        
        if(p.nilai < batasBawah || p.nilai > batasAtas)
            return false;
        
        return(adalahBST(p.kiri, batasBawah, p.nilai-1, i) && adalahBST(p.kanan, p.nilai+1, batasAtas, i));
    }

    // 2. cetakMenurun() [10 points]
    public static void cetakMenurun (Pohon p) {
        // Write your codes in here
        //...
        // Write your codes in here
        if(p == null) return;
        
        cetakMenurun(p.kanan);
        System.out.print(" " + p.nilai);
        cetakMenurun(p.kiri);
    }

    // 3. maks() [10 points]   
    /**
     * Anda harus:
     * - menangani pohon kosong
     * - tidak pernah melihat pada sisi kiri
     * - tidak pernah membandingkan nilai, yaitu nilai p dan sisi kanan, karena memang
     *  tidak diperlukan jika ini adalah BST.
     * - mengembalikan nilai sisi kanan begitu ketemu
     *
     * @param p adalah pohon yang dicari nilai maksimumnya
     * @return nilai maksimum dari pohon p
     */
    public static int maks (Pohon p) {
        // Write your codes in here
        //...
        // Write your codes in here
        
        if(p.kanan == null){
            return p.nilai;
        }else{
            return maks(p.kanan);
        }
    }

    // 4. hapus() [10 points]
    /**
     * Hapus nilai n dari pohon p, jika n ada dan dapatkan Pohon baru.
     * Jika n tidak ada, pohon aslinya yang akan didapat
     */
    public static Pohon hapus (Pohon p, int n) {
        // Write your codes in here
        //...
        // Write your codes in here
    }

}