package Zakk.EC_VubirInvestuvanna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pruvatanna extends JFrame {

	private static final long serialVersionUID = 1L;

	public Pruvatanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel l_komentar = new JLabel("Рекомендаційна експертна система");
		l_komentar.setForeground(new Color(240, 248, 255));
		l_komentar.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(46, 51, 541, 66);
		getContentPane().add(l_komentar);
		l_komentar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Oputuvanna("Інструменти інвестування");
				setVisible(false);
			}
		});
		
		JLabel l_komentar1 = new JLabel("для вибору інструментів інвестування");
		l_komentar1.setForeground(new Color(240, 248, 255));
		l_komentar1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(46, 105, 541, 66);
		getContentPane().add(l_komentar1);
		l_komentar1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Oputuvanna("Інструменти інвестування");
				setVisible(false);
			}
		});
		
		
		JLabel l_fon = new JLabel("");
		l_fon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Oputuvanna("Інструменти інвестування");
				setVisible(false);
			}
		});
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\fon_pruvitanna.jpeg"));
		l_fon.setBounds(0, 0, 794, 565);
		getContentPane().add(l_fon);

		
		
		setVisible(true);
	}
}
