package Model;

import java.util.ArrayList;

public class DS_TaiKhoan {
private ArrayList<TaiKhoan> danhSachTaiKhoan;

public DS_TaiKhoan() {
	super();
}

public DS_TaiKhoan(ArrayList<TaiKhoan> danhSachTaiKhoan) {
	super();
	this.danhSachTaiKhoan = danhSachTaiKhoan;
}

public ArrayList<TaiKhoan> getDanhSachTaiKhoan() {
	return danhSachTaiKhoan;
}

public void setDanhSachTaiKhoan(ArrayList<TaiKhoan> danhSachTaiKhoan) {
	this.danhSachTaiKhoan = danhSachTaiKhoan;
}

}
