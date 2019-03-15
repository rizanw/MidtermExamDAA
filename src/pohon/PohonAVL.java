package pohon;

/**
 * Kelas PohonAVL dikembangkan kelas Pohon, dengan menambahkan variabel "tinggi"
 * untuk mewujudkan operasi keseimbangan tinggi (height-balanced) secara efisien 
 */
class PohonAVL extends Pohon {
    protected final boolean kosong;
    protected final int nilai;
    protected final PohonAVL kiri, kanan;
    protected final int tinggi;

    /**
     * Buat Pohon baru, di mana nilai akarnya adalah n, cabang pohon ke kiri
     * adalah kiri, cabang pohon ke kanan adalah kanan 
     */
    public PohonAVL(int n, PohonAVL kiri, PohonAVL kanan) {
        this.kosong = false;
        this.nilai = n;
        this.kiri = kiri;
        this.kanan = kanan;
	this.tinggi = 1 + Math.max(kiri.tinggi(), kanan.tinggi());
    }
    
    /**
     * Buat Pohon kosong
     */
    public PohonAVL() {
        this.kosong = true;
        this.nilai = 0;
        this.kiri = null;
        this.kanan = null;
	this.tinggi = 0;
    }
    
    public PohonAVL(int n) {
        this.kosong = false;
        this.nilai = n;
        this.kiri = new PohonAVL();
        this.kanan = new PohonAVL();
	this.tinggi = 1;
    }
    
    /**
     * Mengembalikan nilai true jika pohon ini kosong (nilainya nil)
     */
    public boolean adalahKosong() {
        return kosong;
    }
    
    /**
     * Dapatkan nilai akar dari pohon ini
     */
    public int nilai() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                          "Mencoba untuk mengakses akar dari pohon kosong");
        }
        return nilai;
    }
    
    /**
     * Dapatkan cabang ke kiri dari simpul (node) ini
     */
    public PohonAVL kiri() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                          "Mencoba untuk mengakses cabang dari pohon kosong");
        }
        return kiri;
    }
    
    /**
     * Dapatkan cabang ke kanan dari simpul (node) ini
     */
    public PohonAVL kanan() {
        if (adalahKosong()) {
            throw new IllegalStateException(
                         "Mencoba untuk mengakses cabang dari pohon kosong");
        }
        return kanan;
    }
    
    int tinggi() {
	return tinggi;
    }

    /**
     * Buat String dalam baris jamak untuk menampilkan pohon ini. Formatnya adalah sbb;   
<code>
10
   |
   |- 14
   |   |
   |   |- 17
   |   |
   |   |- 13
   |       |
   |       | - [kosong]
   |       |
   |       |- 12
   |
   |- 6
</code>
     * Di mana anak pohon paling bawah adalah cabang pohon kiri dan anak pohon paling atas
     * adalah cabang pohon kanan Jika kedua anak pohon adalah pohon kosong (nil) maka 
     * mereka tidak akan dicetak. Jika hanya satu anak pohon yang kosong, maka mereka akan
     * dicetak sehingga dapat diketahui mana yang anak pohon kanan, mana yang anak
     * pohon kiri.
     * @param pohon Obyek pohon yang boleh jadi tidak boleh null
     * @return String yang berisi pohon yang terformat
     */
    @Override public String toString() {
        return PohonAksi.toString(this);
    }

    @Override public boolean equals(Object o) {
	Pohon p = (Pohon) o;
	if (kosong)
	    return p.kosong;
	else
	    return !p.kosong && nilai == p.nilai &&
		   kiri.equals(p.kiri) && kanan.equals(p.kanan);
    }
    
}