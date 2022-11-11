package Model;

public class HoaDa extends HoaKho {
	int soHoaCon;

	public int getSoHoaCon() {
		return soHoaCon;
	}

	public void setSoHoaCon(int soHoaCon) {
		this.soHoaCon = soHoaCon;
	}

	public HoaDa() {
	}

	public HoaDa(String tenHoa, String maHoa, String mauHoa, boolean loaiHoa, int soLuong, int soHoaCon) {
		super(tenHoa, maHoa, mauHoa, loaiHoa, soLuong);
		this.soHoaCon = soHoaCon;
	}
}
