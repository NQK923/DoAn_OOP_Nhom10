
package Model;

import java.util.ArrayList;

public class DS_HoaDa {
	public ArrayList<HoaDa> danhSachHoa;
	private String luaChon;

	public DS_HoaDa() {
		this.danhSachHoa = new ArrayList<HoaDa>();
		this.luaChon = "";
	}

	public DS_HoaDa(ArrayList<HoaDa> danhSachHoa) {
		this.danhSachHoa = danhSachHoa;
	}

	public ArrayList<HoaDa> getDanhSachHoa() {
		return danhSachHoa;
	}

	public void setDanhSachHoa(ArrayList<HoaDa> danhSachHoa) {
		this.danhSachHoa = danhSachHoa;
	}

	public void themHoa(HoaDa hoaDa) {
		this.danhSachHoa.add(hoaDa);
	}

	public void xoaHoa(int index) {
		this.danhSachHoa.remove(index);
	}

	public void updateHoaDa(HoaDa hoaDa) {
		this.danhSachHoa.remove(hoaDa);
		this.danhSachHoa.add(hoaDa);
	}

	public void InDanhSach() {
		for (HoaDa hoaDa : danhSachHoa) {
			System.out.println(hoaDa);
			System.out.println("\n");
		}
	}

	public String getLuaChon() {
		return luaChon;
	}

	public int kiemHang(String hk) {
		for (HoaDa hoaDa : danhSachHoa) {
			if ((hoaDa.getMaHoa()).equals(hk)) {
				return hoaDa.getSoLuong();
			}
		}
		return 0;
	}

	public String kiemHang_ten(String hk) {
		for (HoaDa hoaDa : danhSachHoa) {
			if ((hoaDa.getMaHoa()).equals(hk)) {
				return hoaDa.getTenHoa();
			}
		}
		return null;
	}

	public void setLuaChon(String luaChon) {
		this.luaChon = luaChon;
	}

	public boolean kiemTraTonTai_2(String hda) {
		for (HoaDa hoaDa : danhSachHoa) {
			if ((hoaDa.getMaHoa()).equals(hda)) {
				return true;
			}
		}
		return false;
	}

	public int viTri(String hda) {
		int index = 0;
		for (HoaDa hoaDa : danhSachHoa) {

			if ((hoaDa.getMaHoa()).equals(hda)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public HoaDa infoHoaDa(String id) {

		for (HoaDa hoaDa : danhSachHoa) {
			if ((hoaDa.getMaHoa()).equals(id)) {
				return hoaDa;
			}

		}
		return null;
	}

	public String kiemTraTonTai(HoaDa hda) {
		for (HoaDa hoaDa : danhSachHoa) {
			if (hoaDa.getMaHoa().equals(hda.getMaHoa()) && hoaDa.getTenHoa().equals(hda.getTenHoa())
					&& hoaDa.getMauHoa().equals(hda.getMauHoa()) && hoaDa.getSoHoaCon() == hda.getSoHoaCon()) {
				return hda.getMaHoa();
			}
		}
		return "";
	}

	public boolean kiemTraTonTai_1(HoaDa hda) {
		for (HoaDa hoaDa : danhSachHoa) {
			if ((hoaDa.getMaHoa()).equals(hda.getMaHoa())) {
				return true;
			}
		}
		return false;
	}

}