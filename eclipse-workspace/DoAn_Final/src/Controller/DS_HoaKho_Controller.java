package Controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JOptionPane;

import View.DangNhap;
import View.DanhSachHoa;
import View.KiemKe;
import View.NguoiDung;
import View.Nhap;
import View.QuanLyMatKhau;
import View.SuaThongTin;
import View.TrangChinh;
import View.Xoa;
import View.Xuat;

public class DS_HoaKho_Controller implements Action {
	public DangNhap view_dangNhap;
	public TrangChinh view_trangChinh;
	public NguoiDung view_nguoiDung;
	public KiemKe view_kiemKe;
	public DanhSachHoa view_danhSachHoa;
	public Xoa view_xoa;
	public Xuat view_xuat;
	public Nhap view_nhap;
	public QuanLyMatKhau view_quanLyMatKhau;
	public SuaThongTin view_suaThongTin;

	public DS_HoaKho_Controller(DangNhap view_dangNhap, TrangChinh view_trangChinh, NguoiDung view_nguoiDung,
			KiemKe view_kiemKe, DanhSachHoa view_danhSachHoa, Xoa view_xoa, Xuat view_xuat, Nhap view_nhap,
			QuanLyMatKhau view_quanLyMatKhau, SuaThongTin view_suaThongTin) {
		super();
		this.view_dangNhap = view_dangNhap;
		this.view_trangChinh = view_trangChinh;
		this.view_nguoiDung = view_nguoiDung;
		this.view_kiemKe = view_kiemKe;
		this.view_danhSachHoa = view_danhSachHoa;
		this.view_xoa = view_xoa;
		this.view_xuat = view_xuat;
		this.view_nhap = view_nhap;
		this.view_quanLyMatKhau = view_quanLyMatKhau;
		this.view_suaThongTin = view_suaThongTin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Xóa")) {
			this.view_xoa.thucHienXoa();
		} else if (actionCommand.equals("Nhập")) {
			this.view_nhap.themHoaKho();

		} else if (actionCommand.equals("Xuất")) {
			this.view_xuat.XuatHang();
		} else if (actionCommand.equals("Chỉnh Sửa")) {
			this.view_suaThongTin.HienThi();
		} else if (actionCommand.equals("Kiểm")) {
			this.view_kiemKe.kiemHang();
		} else if (actionCommand.equals("Đăng nhập ngay")) {
			this.view_dangNhap.kiemTraDangNhap();
		}
		else if (actionCommand.equals("Lưu")) {
			this.view_suaThongTin.suaHoaKho();
		}

	}

	public void thongBaoQuaSL() {
		// JOptionPane.showMessageDialog(view, "Số lượng không đủ để xuất");
	}

	public void thongBaoTonTai() {
		// JOptionPane.showMessageDialog(view, "Mã hoa đã tồn tại");
	}

	public void thongBaoKhongTonTai() {
		// JOptionPane.showMessageDialog(view, "Mã hoa không tồn tại");
	}

	public void thongBaoNhapThanhCong() {
		// JOptionPane.showMessageDialog(view, "Nhập thành công ");
	}

	public void thongBaoNhapThemThanhCong() {
		// JOptionPane.showMessageDialog(view, "Nhập thêm thành công");
	}

	public void thongBaoXuatThanhCong() {
		// JOptionPane.showMessageDialog(view, "Xuất thành công ");
	}

	public void thongBaoXoaThanhCong() {
		// JOptionPane.showMessageDialog(view, "Xóa thành công");
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

}
