package pohon;

// Pohon AVL = Pohon Tinggi Seimbang

class DAA2 extends DAA1 {

    // tinggi()
    public static int tinggi (PohonAVL p) {
	return p.tinggi();
    }

    // 5. adalahTinggiSeimbang() [10 points]
    public static boolean adalahTinggiSeimbang (PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
    }
    
    // 6. sisipkanTinggiSeimbang() [20 points]
    public static PohonAVL sisipkanTinggiSeimbang (int n, PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
    }
    
    // 7. hapusTinggiSeimbang() [20 points]
    public static PohonAVL hapusTinggiSeimbang (PohonAVL p, int n) {
	// Write your codes in here
        //...
        // Write your codes in here
    }

    // seimbangkanKembaliKiri dipanggil jika cabang kiri dari p mungkin tumbuh
    // lebih tinggi 1 level (notch)
    // Jika ia memang lebih tinggi 2 level (notch) daripada cabang kanan, maka
    // dapatkan p versi tinggi-seimbang menggunakan rotasi tunggal atau ganda.
    // Cabang-cabang dari p diasumsikan sudah dalam keadaan tinggi-seimbang dan
    // tidak perlu mengerjakan apa-apa untuk membuat mereka seimbang.
    private static PohonAVL seimbangkanKembaliKiri (PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
    }

    private static PohonAVL seimbangkanKembaliKanan(PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
    }

}