
package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.DS_HoaKho_Controller;
import Model.DS_HoaDa;
import Model.DS_HoaDon;
import Model.HoaDa;
import Model.HoaDon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import View.DanhSachHoa;

/**
 *
 * @author HP
 */
public class Xoa extends javax.swing.JFrame {

	/**
	 * Creates new form xoa
	 */
	public Xoa() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		tenSP_Field = new javax.swing.JTextField();
		maSP_Field = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jToggleButton1 = new javax.swing.JToggleButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		this.model = new DS_HoaDon();
		this.model_2 = new DS_HoaDa();
		this.viewDS = new DanhSachHoa();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));

		jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Xóa Sản phẩm");

		tenSP_Field.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Loại hoa");

		jToggleButton1.setBackground(new java.awt.Color(51, 0, 51));
		jToggleButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
		jToggleButton1.setText("Xóa");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("Tên Sản Phẩm");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("Mã sản phảm");

		jPanel2.setBackground(new java.awt.Color(51, 0, 51));

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/red-home-icon.png"))); // NOI18N
		jLabel5.setText("Home");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}
		});

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/list1.png"))); // NOI18N
		jLabel6.setText("Danh sách");
		jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel6MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(jLabel5)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jLabel6)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		hoaDon_RadioButton = new JRadioButton("New radio button");

		hoaDa_RadioButton = new JRadioButton("New radio button");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(227).addComponent(jLabel1,
								GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(290).addComponent(jLabel2))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(285).addComponent(jToggleButton1))
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(jPanel1Layout
								.createSequentialGroup().addGap(201)
								.addComponent(hoaDon_RadioButton, GroupLayout.PREFERRED_SIZE, 103,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(hoaDa_RadioButton, GroupLayout.PREFERRED_SIZE, 103,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING,
										jPanel1Layout.createSequentialGroup().addGap(196)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(jLabel3).addComponent(jLabel4))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
														.addComponent(maSP_Field, GroupLayout.PREFERRED_SIZE, 197,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(tenSP_Field, GroupLayout.PREFERRED_SIZE, 197,
																GroupLayout.PREFERRED_SIZE)))))
				.addContainerGap(183, Short.MAX_VALUE))
				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(19).addComponent(jLabel1).addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(tenSP_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3))
				.addGap(18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(maSP_Field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4))
				.addGap(12).addComponent(jLabel2).addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(hoaDon_RadioButton)
						.addComponent(hoaDa_RadioButton))
				.addGap(18).addComponent(jToggleButton1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(158, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextField3ActionPerformed

	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
		TrangChinh x = new TrangChinh();
		x.setVisible(true);
		x.pack();
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(false);
	}// GEN-LAST:event_jLabel5MouseClicked

	private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MouseClicked
		DanhSachHoa x = new DanhSachHoa();
		x.setVisible(true);
		this.viewDS.hienDanhSach();
		x.pack();
		x.setLocationRelativeTo(null);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// GEN-LAST:event_jLabel6MouseClicked

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
			java.util.logging.Logger.getLogger(Xoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Xoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Xoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Xoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Xoa().setVisible(true);
			}
		});
	}

	public void thucHienXoa() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn xóa hoa đã chọn?");
		if (luaChon == JOptionPane.YES_OPTION) {

			String textLoaihoa = maSP_Field.getText();
			if (hoaDon_RadioButton.isSelected()) {
				this.model.xoaHoa(this.model.viTri(textLoaihoa));
			} else {
				this.model_2.xoaHoa(this.model_2.viTri(textLoaihoa));
			}
			this.controller.thongBaoXoaThanhCong();
		}

	}

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JTextField tenSP_Field;
	private javax.swing.JTextField maSP_Field;
	private javax.swing.JToggleButton jToggleButton1;
	private DS_HoaKho_Controller controller;
	private DS_HoaDon model;
	private DS_HoaDa model_2;
	private DanhSachHoa viewDS;
	private JRadioButton hoaDon_RadioButton;
	private JRadioButton hoaDa_RadioButton;
	// End of variables declaration//GEN-END:variables
}
