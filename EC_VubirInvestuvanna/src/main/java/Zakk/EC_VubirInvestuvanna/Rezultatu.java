package Zakk.EC_VubirInvestuvanna;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Rezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_Recomendacia = "У Вас уже був досвід інвестування ?(якщо зараз є інвестором, "
			+ "то чи бажає він завершити інвестування чи перепрофілювати кошти) (чи є у Вас наставник)\r" + 
			"Кількість коштів, що Ви бажаєте інвестувати ?\r" + 
			"Ви займались колись волонтерством, соц. допомогою ?\r" + 
			"Як Ви ставитесь до ризику ?\r" + 
			"Яка у Вас освіта ?\r" + 
			"Як швидко Ви очікуєте отримати прибуток ?\r" + 
			"" ;
	
	public Rezultatu(String s, int i_putanna0, int i_putanna1, int i_putanna2, int i_putanna3, int i_putanna4,
			int i_putanna5, String s_ch_putanna6, int i_putanna8, String s_putanna9, String s_putanna10,
			String s_putanna11, String s_putanna12, String s_putanna13, String s_putanna14) {

		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
	
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
		l_komentar1.setBounds(59, 39, 691, 53);
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
		scrollPane.setBorder(new LineBorder(new Color(0,0,0,0)));
		scrollPane.setBackground(new Color(255, 255, 255));
		
		JTextPane textPane_resultat = new JTextPane();
		scrollPane.setViewportView(textPane_resultat);
		textPane_resultat.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		textPane_resultat.setText(s_Recomendacia);
		
		JLabel l_fon = new JLabel("");
		l_fon.setBackground(Color.YELLOW);
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Записати.PNG"));
		l_fon.setBounds(0, 0, 794, 565);
		getContentPane().add(l_fon);
		
		setVisible(true);
	}
}
