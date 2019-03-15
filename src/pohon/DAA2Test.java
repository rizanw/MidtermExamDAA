package pohon;

class DAA2Test extends DAA2 {
    public static void main (String args[]) {
	PohonAVL p = new PohonAVL();

	p = sisipkanTinggiSeimbang(10, p);
	System.out.println("sisipkanTinggiSeimbang 10:");
	System.out.print(p);
	System.out.println();

	p = sisipkanTinggiSeimbang(5, p);
	System.out.println("sisipkanTinggiSeimbang 5:");
	System.out.print(p);
	System.out.println();

	p = sisipkanTinggiSeimbang(6, p);
	System.out.println("sisipkanTinggiSeimbang 6:");
	System.out.print(p);
	System.out.println();

	p = sisipkanTinggiSeimbang(7, p);
	System.out.println("sisipkanTinggiSeimbang 7:");
	System.out.print(p);
	System.out.println();
        
        if (adalahTinggiSeimbang(p)) {
            System.out.println("p adalah AVL tree: memiliki tinggi seimbang");
        }

	p = hapusTinggiSeimbang(p, 5);
	System.out.println("hapusTinggiSeimbang 5:");
	System.out.print(p);
	System.out.println();
        
        if (adalahTinggiSeimbang(p)) {
            System.out.println("p adalah AVL tree: memiliki tinggi seimbang");
        }

	p = hapusTinggiSeimbang(p, 10);
	System.out.println("hapusTinggiSeimbang 10:");
	System.out.print(p);
	System.out.println();

	p = hapusTinggiSeimbang(p, 6);
	System.out.println("hapusTinggiSeimbang 6:");
	System.out.print(p);
	System.out.println();

	p = hapusTinggiSeimbang(p, 7);
	System.out.println("hapusTinggiSeimbang 7:");
	System.out.print(p);
	System.out.println();
    }
}