package Model;



public class HoaDon extends HoaKho {
	int soCanh;

	public int getSoCanh() {
		return soCanh;
	}

	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}

	public HoaDon() {

	}

	public HoaDon(String tenHoa, String maHoa, String mauHoa, boolean loaiHoa, int soLuong, int soCanh) {
		super(tenHoa, maHoa, mauHoa, loaiHoa, soLuong);
		this.soCanh = soCanh;
	}
}
