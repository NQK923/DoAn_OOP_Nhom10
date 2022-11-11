
package View;

import View.DanhSachHoa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import Controller.DS_HoaKho_Controller;
import Model.DS_HoaDa;
import Model.DS_HoaDon;
import Model.HoaDa;
import Model.HoaDon;

/**
 *
 * @author HP
 */
public class Nhap extends javax.swing.JFrame {
	public Nhap() {
		initComponents();
	}

	private void initComponents() {
		this.controller = new DS_HoaKho_Controller(null, null, null, null, null, null, null, null, null, null);
		Action action = new DS_HoaKho_Controller(null, null, null, null, null, null, null, this, null, null);
		this.model = new DS_HoaDon();
		this.model_2 = new DS_HoaDa();
		this.viewDS = new DanhSachHoa();
		jPanel3 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		tenSP_Field = new javax.swing.JTextField();
		maSP_Field = new javax.swing.JTextField();
		soHoaCon_Field = new javax.swing.JTextField();
		soCanhHoa_Field = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		soLuong_Field = new javax.swing.JTextField();
		mauHoa_Field = new javax.swing.JTextField();
		nhap_Button = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		textField_phieuNhap = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Nhập thông tin");

		jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Tên sản phẩm");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Mã sản phẩm");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Màu");

		jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("Số lượng");

		maSP_Field.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("Loại Hoa");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(255, 255, 255));
		jLabel7.setText("Số cánh hoa");

		jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Số hoa con");

		soLuong_Field.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		mauHoa_Field.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		nhap_Button.addActionListener(action);
		nhap_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

			}
		});
		nhap_Button.setBackground(new java.awt.Color(51, 0, 51));
		nhap_Button.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		nhap_Button.setForeground(new java.awt.Color(255, 255, 255));
		nhap_Button.setText("Nhập");
		jPanel1.add(nhap_Button);

		jPanel4.setBackground(new java.awt.Color(51, 0, 51));

		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/red-home-icon.png"))); // NOI18N
		jLabel9.setText("Home");
		jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel9MouseClicked(evt);
			}
		});

		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/list1.png"))); // NOI18N
		jLabel12.setText("Danh sách");
		jLabel12.setToolTipText("");
		jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel12MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel12)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9).addComponent(jLabel12))
						.addGap(0, 0, Short.MAX_VALUE)));

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/flw.png"))); // NOI18N

		jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("Phiếu nhập");

		this.hoaDon_RadioButton = new JRadioButton("Hoa Đơn");
		hoaDon_RadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hoaDon_RadioButton.setBounds(774, 155, 103, 21);
		this.hoaDa_RadioButton = new JRadioButton("Hoa Đa");
		hoaDa_RadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hoaDa_RadioButton.setBounds(884, 155, 103, 21);

		ButtonGroup btn_loaiHoa = new ButtonGroup();
		btn_loaiHoa.add(hoaDon_RadioButton);
		btn_loaiHoa.add(hoaDa_RadioButton);

		jScrollPane1 = new JScrollPane();

		javax.swing.GroupLayout gl_soLuong_Field = new javax.swing.GroupLayout(jPanel1);
		gl_soLuong_Field.setHorizontalGroup(gl_soLuong_Field.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 2600, Short.MAX_VALUE)
				.addGroup(gl_soLuong_Field.createSequentialGroup().addGroup(gl_soLuong_Field
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_soLuong_Field.createSequentialGroup().addGroup(gl_soLuong_Field
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_soLuong_Field.createSequentialGroup().addContainerGap(159, Short.MAX_VALUE)
										.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_soLuong_Field.createSequentialGroup().addGap(160)
														.addGroup(gl_soLuong_Field
																.createParallelGroup(Alignment.LEADING)
																.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 90,
																		GroupLayout.PREFERRED_SIZE)
																.addGroup(gl_soLuong_Field.createSequentialGroup()
																		.addComponent(jLabel7)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(soCanhHoa_Field,
																				GroupLayout.PREFERRED_SIZE, 53,
																				GroupLayout.PREFERRED_SIZE))
																.addComponent(jLabel2)))
												.addGroup(gl_soLuong_Field.createSequentialGroup().addGap(159)
														.addGroup(gl_soLuong_Field
																.createParallelGroup(Alignment.TRAILING)
																.addGroup(gl_soLuong_Field
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_soLuong_Field
																				.createSequentialGroup().addGap(6)
																				.addComponent(jLabel6))
																		.addGroup(gl_soLuong_Field
																				.createParallelGroup(Alignment.LEADING,
																						false)
																				.addComponent(tenSP_Field)
																				.addComponent(maSP_Field,
																						GroupLayout.DEFAULT_SIZE, 217,
																						Short.MAX_VALUE)))
																.addGroup(gl_soLuong_Field.createSequentialGroup()
																		.addGroup(gl_soLuong_Field
																				.createParallelGroup(Alignment.LEADING)
																				.addComponent(jLabel5)
																				.addComponent(jLabel4)
																				.addGroup(gl_soLuong_Field
																						.createSequentialGroup()
																						.addGap(18).addComponent(
																								hoaDon_RadioButton,
																								GroupLayout.PREFERRED_SIZE,
																								103,
																								GroupLayout.PREFERRED_SIZE)))
																		.addGap(5)
																		.addGroup(gl_soLuong_Field
																				.createParallelGroup(Alignment.LEADING)
																				.addGroup(gl_soLuong_Field
																						.createSequentialGroup()
																						.addGroup(gl_soLuong_Field
																								.createParallelGroup(
																										Alignment.LEADING)
																								.addComponent(
																										nhap_Button)
																								.addGroup(
																										gl_soLuong_Field
																												.createSequentialGroup()
																												.addGap(78)
																												.addGroup(
																														gl_soLuong_Field
																																.createParallelGroup(
																																		Alignment.TRAILING)
																																.addComponent(
																																		hoaDa_RadioButton,
																																		GroupLayout.PREFERRED_SIZE,
																																		103,
																																		GroupLayout.PREFERRED_SIZE)
																																.addGroup(
																																		gl_soLuong_Field
																																				.createSequentialGroup()
																																				.addComponent(
																																						jLabel8)
																																				.addPreferredGap(
																																						ComponentPlacement.RELATED)
																																				.addComponent(
																																						soHoaCon_Field,
																																						GroupLayout.PREFERRED_SIZE,
																																						50,
																																						GroupLayout.PREFERRED_SIZE)))))
																						.addGap(35))
																				.addComponent(mauHoa_Field,
																						Alignment.TRAILING,
																						GroupLayout.PREFERRED_SIZE, 218,
																						GroupLayout.PREFERRED_SIZE)))
																.addComponent(soLuong_Field, GroupLayout.PREFERRED_SIZE,
																		218, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_soLuong_Field.createSequentialGroup().addGap(172)
														.addComponent(jLabel11)))
										.addGap(67))
								.addGroup(gl_soLuong_Field.createSequentialGroup().addGap(146)
										.addComponent(textField_phieuNhap, GroupLayout.PREFERRED_SIZE, 412,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(
								gl_soLuong_Field.createSequentialGroup().addGap(263).addComponent(jLabel1).addGap(230)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 713, GroupLayout.PREFERRED_SIZE)
						.addGap(1008).addComponent(jLabel10)));
		gl_soLuong_Field.setVerticalGroup(gl_soLuong_Field.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_soLuong_Field.createSequentialGroup().addComponent(
						jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(50)
						.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.LEADING).addGroup(gl_soLuong_Field
								.createSequentialGroup().addComponent(jLabel1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE).addComponent(jLabel2)
										.addComponent(tenSP_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE).addComponent(jLabel3)
										.addComponent(maSP_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(jLabel6)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE)
										.addComponent(hoaDon_RadioButton).addComponent(hoaDa_RadioButton))
								.addGap(5)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE).addComponent(jLabel7)
										.addComponent(jLabel8)
										.addComponent(soCanhHoa_Field, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(soHoaCon_Field, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE)
										.addComponent(soLuong_Field, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel5))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_soLuong_Field.createParallelGroup(Alignment.BASELINE)
										.addComponent(mauHoa_Field, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4))
								.addGap(18).addComponent(nhap_Button).addGap(79).addComponent(jLabel11)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_phieuNhap, GroupLayout.PREFERRED_SIZE, 63,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
								.addComponent(jLabel10)).addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 472,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setBackground(new Color(51, 0, 102));
		jScrollPane1.setViewportView(table);
		jPanel1.setLayout(gl_soLuong_Field);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "T\u00EAn", "M\u00E3 hoa",
				"Lo\u1EA1i hoa", "S\u1ED1 l\u01B0\u1EE3ng", "M\u00E0u", "S\u1ED1 c\u00E1nh hoa", "S\u1ED1 hoa con" }));
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(14, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel9MouseClicked
		NguoiDung x = new NguoiDung();
		x.setVisible(true);
		x.pack();
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
	}// GEN-LAST:event_jLabel9MouseClicked

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField2ActionPerformed

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField5ActionPerformed

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField6ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField6ActionPerformed

	private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel12MouseClicked
		DanhSachHoa x = new DanhSachHoa();
		x.setVisible(true);
		this.viewDS.hienDanhSach();
		SuaThongTin y = new SuaThongTin();
		y.setVisible(true);
		x.setVisible(true);
		x.pack();
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// GEN-LAST:event_jLabel12MouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Nhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Nhap().setVisible(true);
			}
		});
	}

	public void themHoaKho() {
		df = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		String tenHoa = this.tenSP_Field.getText();
		String maHoa = this.maSP_Field.getText();
		String mauHoa = this.mauHoa_Field.getText();
		int soLuong = Integer.valueOf(this.soLuong_Field.getText());
		boolean loaiHoa = true;
		if (this.hoaDon_RadioButton.isSelected()) {
			loaiHoa = true;
			int soCanhHoa = Integer.valueOf(this.soCanhHoa_Field.getText());
			HoaDon hd = new HoaDon(tenHoa, maHoa, mauHoa, loaiHoa, soLuong, soCanhHoa);
			this.themHoaDonvaoBang(hd);
			this.textField_phieuNhap.setText(df.format(System.currentTimeMillis()) + " Nhập: " + soLuong_Field.getText()
					+ " " + tenHoa + " Mã hoa: " + maHoa + " Loại hoa: Đơn\n");
		} else {
			loaiHoa = false;
			int soHoaCon = Integer.valueOf(this.soHoaCon_Field.getText());
			HoaDa hda = new HoaDa(tenHoa, maHoa, mauHoa, loaiHoa, soLuong, soHoaCon);
			this.themHoaDavaoBang(hda);
			this.textField_phieuNhap.setText(df.format(System.currentTimeMillis()) + " Nhập: " + soLuong_Field.getText()
					+ " " + tenHoa + " Mã hoa: " + maHoa + " Loại hoa: Đa\n");
		}

	}

	public void themHoaDonvaoBang(HoaDon hd) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!model.kiemTraTonTai_1(hd)) {
			this.model.themHoa(hd);
			model_table.addRow(new Object[] { hd.getTenHoa(), hd.getMaHoa(), "Hoa đơn", hd.getSoLuong() + "",
					hd.getMauHoa(), hd.getSoCanh() + "", "" });
			this.controller.thongBaoNhapThanhCong();
		} else if (!this.model.kiemTraTonTai(hd).equals("")) {
			for (int i = 0; i < model_table.getRowCount(); i++) {
				String id = model_table.getValueAt(i, 1) + "";
				String loaiHoa = model_table.getValueAt(i, 2) + "";
				if (id.equals(hd.getMaHoa()) && loaiHoa.equals("Hoa đơn")) {
					int slCu = Integer.valueOf(table.getValueAt(i, 3) + "");
					model_table.setValueAt(hd.getSoLuong() + slCu, i, 3);
					HoaDon hd_1 = InfoDon();
					updateHoaDon(hd_1);
					this.controller.thongBaoNhapThemThanhCong();
				}
			}
		} else {
			controller.thongBaoTonTai();
		}
	}

	public void themHoaDavaoBang(HoaDa hda) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model_2.kiemTraTonTai_1(hda)) {
			this.model_2.themHoa(hda);
			model_table.addRow(new Object[] { hda.getTenHoa(), hda.getMaHoa(), "Hoa đa", hda.getSoLuong() + "",
					hda.getMauHoa(), "", hda.getSoHoaCon() + "" });
		} else if (!this.model_2.kiemTraTonTai(hda).equals("")) {
			for (int i = 0; i < model_table.getRowCount(); i++) {
				String id = model_table.getValueAt(i, 1) + "";
				String loaiHoa = model_table.getValueAt(i, 2) + "";
				if (id.equals(hda.getMaHoa()) && loaiHoa.equals("Hoa đơn")) {
					int slCu = Integer.valueOf(table.getValueAt(i, 3) + "");
					model_table.setValueAt(hda.getSoLuong() + slCu, i, 3);
					HoaDa hda_1 = InfoDa();
					updateHoaDa(hda_1);
				}
			}
		} else {
			controller.thongBaoTonTai();
		}
	}

	public void updateHoaDon(HoaDon hd) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		this.model.updateHoaDon(hd);
		for (int i = 0; i < model_table.getRowCount(); i++) {
			String id = model_table.getValueAt(i, 1) + "";
			String loaiHoa = model_table.getValueAt(i, 2) + "";
			if (id.equals(hd.getMaHoa()) && loaiHoa.equals("Hoa đơn")) {
				model_table.setValueAt(hd.getTenHoa(), i, 0);
				model_table.setValueAt(hd.getMaHoa(), i, 1);
				model_table.setValueAt("Hoa đơn", i, 2);
				model_table.setValueAt(hd.getSoLuong(), i, 3);
				model_table.setValueAt(hd.getMauHoa(), i, 4);
				model_table.setValueAt(hd.getSoCanh(), i, 5);
				model_table.setValueAt("", i, 6);
			}
		}
	}

	public void updateHoaDa(HoaDa hda) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		this.model_2.updateHoaDa(hda);
		for (int i = 0; i < model_table.getRowCount(); i++) {
			String id = model_table.getValueAt(i, 1) + "";
			String loaiHoa = model_table.getValueAt(i, 2) + "";
			if (id.equals(hda.getMaHoa()) && loaiHoa.equals("Hoa đa")) {
				model_table.setValueAt(hda.getTenHoa(), i, 0);
				model_table.setValueAt(hda.getMaHoa(), i, 1);
				model_table.setValueAt("Hoa đa", i, 2);
				model_table.setValueAt(hda.getSoLuong(), i, 3);
				model_table.setValueAt(hda.getMauHoa(), i, 4);
				model_table.setValueAt("", i, 5);
				model_table.setValueAt(hda.getSoHoaCon(), i, 6);
			}
		}
	}

	public HoaDon InfoDon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		String tenHoa = model_table.getValueAt(i_row, 0) + "";
		String maHoa = model_table.getValueAt(i_row, 1) + "";
		String mauHoa = model_table.getValueAt(i_row, 4) + "";
		int soLuong = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");
		int soCanhHoa = Integer.valueOf(model_table.getValueAt(i_row, 5) + "");
		HoaDon hd = new HoaDon(tenHoa, maHoa, mauHoa, true, soLuong, soCanhHoa);
		return hd;
	}

	public HoaDa InfoDa() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		String tenHoa = model_table.getValueAt(i_row, 0) + "";
		String maHoa = model_table.getValueAt(i_row, 1) + "";
		String mauHoa = model_table.getValueAt(i_row, 4) + "";
		int soLuong = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");
		int soHoaCon = Integer.valueOf(model_table.getValueAt(i_row, 6) + "");
		HoaDa hda = new HoaDa(tenHoa, maHoa, mauHoa, false, soLuong, soHoaCon);
		return hda;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton nhap_Button;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JTextField tenSP_Field;
	private javax.swing.JTextField maSP_Field;
	private javax.swing.JTextField soHoaCon_Field;
	private javax.swing.JTextField soCanhHoa_Field;
	private javax.swing.JTextField soLuong_Field;
	private javax.swing.JTextField mauHoa_Field;
	private javax.swing.JTextField textField_phieuNhap;
	private DS_HoaKho_Controller controller;
	private DS_HoaDon model;
	private DS_HoaDa model_2;
	private JRadioButton hoaDon_RadioButton;
	private JRadioButton hoaDa_RadioButton;
	private DateFormat df;
	private JScrollPane jScrollPane1;
	private JTable table;
	private DanhSachHoa viewDS;
}
