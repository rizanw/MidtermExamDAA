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
        
        if(p == null) return true;
        
        if(Math.abs(tinggi(p.kiri)-tinggi(p.kanan)) <= 1 && adalahTinggiSeimbang(p.kiri) && adalahTinggiSeimbang(p.kanan)) return true;
        
        return false;
        
    }
    
    // 6. sisipkanTinggiSeimbang() [20 points]
    public static PohonAVL sisipkanTinggiSeimbang (int n, PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
        
        if(p == null) return (new PohonAVL(n));
        
        if(n < p.nilai) {
            p.kiri = sisipkanTinggiSeimbang(n, p.kiri);
        }
        else if(n > p.nilai) p.kanan = sisipkanTinggiSeimbang(n, p.kanan);
        else return p;
        
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
        if(tinggi(p.kiri) <= (tinggi(p.kanan)+1)) return p;
        else{
            PohonAVL ki = p.kiri;
            PohonAVL ka = p.kanan;
            PohonAVL kiki = ki.kiri;
            PohonAVL kika = ki.kanan;
            if(tinggi(kiki) > tinggi(ka))
                return sisipkanTinggiSeimbang(0, p)
        }
    }

    private static PohonAVL seimbangkanKembaliKanan(PohonAVL p) {
	// Write your codes in here
        //...
        // Write your codes in here
    }

}