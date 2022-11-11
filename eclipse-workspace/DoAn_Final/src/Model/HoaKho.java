package Model;

public class HoaKho {
	protected String tenHoa;
	protected String maHoa;
	protected String mauHoa;
	protected boolean loaiHoa;
	private int soLuong;

	public HoaKho() {

	}

	public HoaKho(String tenHoa, String maHoa, String mauHoa, boolean loaiHoa, int soLuong) {
		this.tenHoa = tenHoa;
		this.maHoa = maHoa;
		this.mauHoa = mauHoa;
		this.loaiHoa = loaiHoa;
		this.soLuong = soLuong;
	}

	public String getTenHoa() {
		return tenHoa;
	}

	public void setTenHoa(String tenHoa) {
		this.tenHoa = tenHoa;
	}

	public String getMaHoa() {
		return maHoa;
	}

	public void setMaHoa(String maHoa) {
		this.maHoa = maHoa;
	}

	public String getMauHoa() {
		return mauHoa;
	}

	public void setMauHoa(String mauHoa) {
		this.mauHoa = mauHoa;
	}

	public boolean getLoaiHoa() {
		return loaiHoa;
	}

	public void setLoaiHoa(boolean loaiHoa) {
		this.loaiHoa = loaiHoa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "HoaKho [tenHoa=" + tenHoa + ", maHoa=" + maHoa + ", mauHoa=" + mauHoa + "loaiHoa=" + loaiHoa
				+ ", soLuong=" + soLuong + "]";
	}

}
