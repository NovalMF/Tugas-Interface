/**
*
* @ Noval Muhamad Faisal
*/

	public interface Interface {
		public String hewan = "kucing";
		public String suara = "meong";

	/* implementasi variabel interface */
	public class implementasi implements Interface {
		public static void main (String[] args) {
			implementasi a = new implementasi();
			a.hewan;
			a.suara;
	}
}

	/* interface yang tidak dapat di inisiasi */
	public static void main (String[] args) {
		Interface in = new Interface();
	}

	/* class abstrak yang dapat mengimplement interface secara bebas */
	public abstract class abstrak implements Interface {
		protected String getHewan () {
			return this.hewan;
		}
	}
}