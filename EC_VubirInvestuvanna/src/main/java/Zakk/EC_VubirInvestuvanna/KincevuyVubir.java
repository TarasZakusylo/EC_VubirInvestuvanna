package Zakk.EC_VubirInvestuvanna;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class KincevuyVubir extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_NazvaVusnovku1 = "Цінні папери";
	String s_NazvaVusnovku2 = "Валюту";
	String s_NazvaVusnovku3 = "Депозити";
	String s_NazvaVusnovku4 = "Нерухомість";
	String s_NazvaVusnovku5 = "Деривативи";
	String s_NazvaVusnovku6 = "Товарні цінності";
	String s_NazvaVusnovku7 = "Фінансові інструменти";
	String s_NazvaVusnovku8 = "Start-up";
	String s_NazvaVusnovku9 = "Бізнес";

	String s_putanna1 = "Інвестиції";
	String s_putanna2 = "Інвестиції";

	int i_rezultat1 = 0;
	int i_rezultat2 = 0;

	public KincevuyVubir(int i_putanna1, int i_putanna2) {

		setSize(800, 492);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel label_1 = new JLabel("Оберіть напрям подальшого руху");
		label_1.setForeground(new Color(0, 191, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		label_1.setBounds(12, 13, 770, 64);
		getContentPane().add(label_1);

		switch (i_putanna1) {
		case 1:
			s_putanna1 = s_NazvaVusnovku1;
			i_rezultat1 = 1;
			break;
		case 2:
			s_putanna1 = s_NazvaVusnovku2;
			i_rezultat1 = 2;
			break;
		case 3:
			s_putanna1 = s_NazvaVusnovku3;
			i_rezultat1 = 3;
			break;
		case 4:
			s_putanna1 = s_NazvaVusnovku4;
			i_rezultat1 = 4;
			break;
		case 5:
			s_putanna1 = s_NazvaVusnovku5;
			i_rezultat1 = 5;
			break;
		case 6:
			s_putanna1 = s_NazvaVusnovku6;
			i_rezultat1 = 6;
			break;
		case 7:
			s_putanna1 = s_NazvaVusnovku7;
			i_rezultat1 = 7;
			break;
		case 8:
			s_putanna1 = s_NazvaVusnovku8;
			i_rezultat1 = 8;
			break;
		case 9:
			s_putanna1 = s_NazvaVusnovku9;
			i_rezultat1 = 9;
			break;
		}

		switch (i_putanna2) {
		case 1:
			s_putanna2 = s_NazvaVusnovku1;
			i_rezultat2 = 1;
			break;
		case 2:
			s_putanna2 = s_NazvaVusnovku2;
			i_rezultat2 = 2;
			break;
		case 3:
			s_putanna2 = s_NazvaVusnovku3;
			i_rezultat2 = 3;
			break;
		case 4:
			s_putanna2 = s_NazvaVusnovku4;
			i_rezultat2 = 4;
			break;
		case 5:
			s_putanna2 = s_NazvaVusnovku5;
			i_rezultat2 = 5;
			break;
		case 6:
			s_putanna2 = s_NazvaVusnovku6;
			i_rezultat2 = 6;
			break;
		case 7:
			s_putanna2 = s_NazvaVusnovku7;
			i_rezultat2 = 7;
			break;
		case 8:
			s_putanna2 = s_NazvaVusnovku8;
			i_rezultat2 = 8;
			break;
		case 9:
			s_putanna2 = s_NazvaVusnovku9;
			i_rezultat2 = 9;
			break;
		}

		JLabel l_variant1 = new JLabel();
		l_variant1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Rezultatu("Інструменти інвестування", i_rezultat1);
				setVisible(false);
			}
		});
		l_variant1.setHorizontalAlignment(SwingConstants.CENTER);
		l_variant1.setForeground(new Color(255, 215, 0));
		l_variant1.setFont(new Font("Times New Roman", Font.BOLD, 35));
		l_variant1.setBounds(399, 327, 383, 52);
		getContentPane().add(l_variant1);
		l_variant1.setText(s_putanna1);

		JLabel l_variant2 = new JLabel();
		l_variant2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Rezultatu("Інструменти інвестування", i_rezultat2);
				setVisible(false);
			}
		});
		l_variant2.setHorizontalAlignment(SwingConstants.CENTER);
		l_variant2.setForeground(new Color(255, 215, 0));
		l_variant2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		l_variant2.setBounds(399, 392, 383, 52);
		getContentPane().add(l_variant2);
		l_variant2.setText(s_putanna2);

		JLabel l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("res/fon/kartunka_kincevuyVubir.jpg"));
		l_fon.setBounds(0, 0, 794, 459);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
