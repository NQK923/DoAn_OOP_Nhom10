
package Model;

import java.util.ArrayList;

public class DS_HoaDon {
	public ArrayList<HoaDon> danhSachHoa;
	private String luaChon;

	public DS_HoaDon() {
		this.danhSachHoa = new ArrayList<HoaDon>();
		this.luaChon = "";
	}

	public DS_HoaDon(ArrayList<HoaDon> danhSachHoa) {
		this.danhSachHoa = danhSachHoa;
	}

	public ArrayList<HoaDon> getDanhSachHoa() {
		return danhSachHoa;
	}

	public void setDanhSachHoa(ArrayList<HoaDon> danhSachHoa) {
		this.danhSachHoa = danhSachHoa;
	}

	public void themHoa(HoaDon hoaDon) {
		this.danhSachHoa.add(hoaDon);
	}

	public void xoaHoa(int index) {
		this.danhSachHoa.remove(index);
	}

	public void updateHoaDon(HoaDon hoaDon) {
		this.danhSachHoa.remove(hoaDon);
		this.danhSachHoa.add(hoaDon);
	}

	public void InDanhSach() {
		for (HoaDon hoaDon : danhSachHoa) {
			System.out.println(hoaDon);
			System.out.println("\n");
		}
	}

	public String getLuaChon() {
		return luaChon;
	}

	public int kiemHang(String hk) {
		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(hk)) {
				return hoaDon.getSoLuong();
			}
		}
		return 0;
	}

	public String kiemHang_ten(String hk) {
		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(hk)) {
				return hoaDon.getTenHoa();
			}
		}
		return null;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai_2(String hd) {
		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(hd)) {
				return true;
			}
		}
		return false;
	}

	public int viTri(String hd) {
		int index = 0;
		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(hd)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public HoaDon infoHoaDon(String id) {

		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(id)) {
				return hoaDon;
			}
		}
		return null;
	}

	public String kiemTraTonTai(HoaDon hd) {
		for (HoaDon hoaDon : danhSachHoa) {
			if (hoaDon.getMaHoa().equals(hd.getMaHoa()) && hoaDon.getTenHoa().equals(hd.getTenHoa())
					&& hoaDon.getMauHoa().equals(hd.getMauHoa()) && hoaDon.getSoCanh() == hd.getSoCanh()) {
				return hd.getMaHoa();
			}
		}
		return "";
	}

	public boolean kiemTraTonTai_1(HoaDon hd) {
		for (HoaDon hoaDon : danhSachHoa) {
			if ((hoaDon.getMaHoa()).equals(hd.getMaHoa())) {
				return true;
			}
		}
		return false;
	}

}