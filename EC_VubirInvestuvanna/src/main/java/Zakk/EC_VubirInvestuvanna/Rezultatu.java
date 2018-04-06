package Zakk.EC_VubirInvestuvanna;

import java.awt.Color;
import java.awt.Font;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Rezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_RecomendaciaBaza = "";

	String s_NazvaVusnovku1 = "Інвестуйте в цінні папери";
	String s_NazvaVusnovku2 = "Інвестуйте у валюту";
	String s_NazvaVusnovku3 = "Займіться депозитами";
	String s_NazvaVusnovku4 = "Вкладайте у нерухомість";
	String s_NazvaVusnovku5 = "Інвестуйте в деривативи";
	String s_NazvaVusnovku6 = "Вкладайте у товарні цінності";
	String s_NazvaVusnovku7 = "Вкладайте у фінансові інструменти";
	String s_NazvaVusnovku8 = "Інвестуйте у Start-up";
	String s_NazvaVusnovku9 = "Інвестуйте у бізнес";

	String s_putanna1 = "";
	
	static Scanner scn;

	public Rezultatu(String s, int i_rezultat) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		switch (i_rezultat) {
		case 1:
			s_putanna1 = s_NazvaVusnovku1;
			i_rezultat = 1;
			break;
		case 2:
			s_putanna1 = s_NazvaVusnovku2;
			i_rezultat = 2;
			break;
		case 3:
			s_putanna1 = s_NazvaVusnovku3;
			i_rezultat = 3;
			break;
		case 4:
			s_putanna1 = s_NazvaVusnovku4;
			i_rezultat = 4; 
			break;
		case 5:
			s_putanna1 = s_NazvaVusnovku5;
			i_rezultat = 5;
			break;
		case 6:
			s_putanna1 = s_NazvaVusnovku6;
			i_rezultat = 6;
			break;
		case 7:
			s_putanna1 = s_NazvaVusnovku7;
			i_rezultat = 7;
			break;
		case 8:
			s_putanna1 = s_NazvaVusnovku8;
			i_rezultat = 8;
			break;
		case 9:
			s_putanna1 = s_NazvaVusnovku9;
			i_rezultat = 9;
			break;
		}
		
		try (FileReader reader = new FileReader("res//rekomendacia//"+i_rezultat+".txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				s_RecomendaciaBaza = s_RecomendaciaBaza + ((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "ПОМИЛКА. Система завантажена не повністю.");
		}

		JLabel l_komentar = new JLabel("Рекомендаційна експертна система");
		l_komentar.setBackground(Color.WHITE);
		l_komentar.setForeground(Color.BLACK);
		l_komentar.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(49, 0, 691, 53);
		getContentPane().add(l_komentar);

		JLabel l_komentar1 = new JLabel("для вибору інструментів інвестування");
		l_komentar1.setForeground(Color.BLACK);
		l_komentar1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(39, 39, 711, 53);
		getContentPane().add(l_komentar1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\currency – копія.png"));
		label.setBounds(0, 389, 258, 176);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\monety – копія.png"));
		label_1.setBounds(667, 389, 127, 186);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\monety_11-320 – копія.png"));
		label_2.setBounds(509, 417, 231, 135);
		getContentPane().add(label_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 88, 734, 311);
		getContentPane().add(scrollPane);
		scrollPane.setBorder(new LineBorder(new Color(0, 0, 0, 0)));
		scrollPane.setBackground(new Color(255, 255, 255));

		JTextPane textPane_resultat = new JTextPane();
		scrollPane.setViewportView(textPane_resultat);
		textPane_resultat.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		textPane_resultat.setText(s_RecomendaciaBaza);
		
		JLabel l_NazvaVusnovku = new JLabel("");
		l_NazvaVusnovku.setHorizontalAlignment(SwingConstants.CENTER);
		l_NazvaVusnovku.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_NazvaVusnovku.setBounds(184, 430, 428, 39);
		getContentPane().add(l_NazvaVusnovku);
		l_NazvaVusnovku.setText(s_putanna1);

		JLabel l_fon = new JLabel("");
		l_fon.setBackground(Color.YELLOW);
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Записати.PNG"));
		l_fon.setBounds(0, 0, 794, 565);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
