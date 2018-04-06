package Zakk.EC_VubirInvestuvanna;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Oputuvanna1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private String s_putanna8 = "";
	private String s_putanna9 = "";
	private String s_putanna10 = "";
	private String s_putanna11 = "";
	private String s_putanna12 = "";
	private String s_putanna13 = "";
	private String s_putanna14 = "";

	private int i_putanna8 = 0;

	private JLabel l_putanna14;

	private JTextField tF_ch_putanna8;

	private Choice ch_putanna9;
	private Choice ch_putanna10;
	private Choice ch_putanna11;
	private Choice ch_putanna12;
	private Choice ch_putanna13;
	private Choice ch_putanna14;

	public Oputuvanna1(String s, final int i_putanna0, final int i_putanna1, final int i_putanna2, final int i_putanna3,
			final int i_putanna4, final int i_putanna5, final String s_ch_putanna6) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_komentar = new JLabel("Для отримання індивідуальних рекомендацій");
		l_komentar.setForeground(new Color(240, 248, 255));
		l_komentar.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(19, 13, 763, 45);
		getContentPane().add(l_komentar);

		JLabel l_komentar1 = new JLabel("вкажіть персональні дані");
		l_komentar1.setForeground(new Color(240, 248, 255));
		l_komentar1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		l_komentar1.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar1.setBounds(14, 56, 763, 45);
		getContentPane().add(l_komentar1);

		JLabel l_kartunka = new JLabel(" ");
		l_kartunka.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\kartunka_oputuvanna.png"));
		l_kartunka.setBounds(662, 101, 115, 191);
		getContentPane().add(l_kartunka);

		JLabel l_kartunka1 = new JLabel(" ");
		l_kartunka1.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\kartunka_oputuvanna1.png"));
		l_kartunka1.setBounds(662, 305, 115, 191);
		getContentPane().add(l_kartunka1);

		JLabel l_putanna8 = new JLabel("Кількість коштів, що бажаєте інвестувати ?   $");
		l_putanna8.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna8.setForeground(new Color(240, 248, 255));
		l_putanna8.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna8.setBounds(10, 114, 468, 45);
		getContentPane().add(l_putanna8);

		JLabel l_putanna9 = new JLabel("Як Ви ставитесь до ризику ?");
		l_putanna9.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna9.setForeground(new Color(240, 248, 255));
		l_putanna9.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna9.setBounds(10, 172, 471, 45);
		getContentPane().add(l_putanna9);

		JLabel l_putanna11 = new JLabel("В якій державі Ви плануєте вкладати кошти ?");
		l_putanna11.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna11.setForeground(new Color(240, 248, 255));
		l_putanna11.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna11.setBounds(10, 288, 471, 45);
		getContentPane().add(l_putanna11);

		JLabel l_putanna12 = new JLabel("Оберіть вид бізнесу ?");
		l_putanna12.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna12.setForeground(new Color(240, 248, 255));
		l_putanna12.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna12.setBounds(10, 346, 471, 45);
		getContentPane().add(l_putanna12);

		JLabel l_putanna13 = new JLabel("Яка у Вас освіта ?");
		l_putanna13.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna13.setForeground(new Color(240, 248, 255));
		l_putanna13.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna13.setBounds(10, 404, 471, 45);
		getContentPane().add(l_putanna13);

		if (i_putanna0 == 1) {
			l_putanna14 = new JLabel("Бажаєте завершити попереднє інвестування ?");
		} else {
			l_putanna14 = new JLabel("Чи є у Вас наставник ?");
		}
		l_putanna14.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna14.setForeground(new Color(240, 248, 255));
		l_putanna14.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna14.setBounds(10, 462, 471, 45);
		getContentPane().add(l_putanna14);

		JLabel l_putanna10 = new JLabel("Як швидко Ви очікуєте отримати прибуток ?");
		l_putanna10.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna10.setForeground(new Color(240, 248, 255));
		l_putanna10.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna10.setBounds(10, 230, 471, 45);
		getContentPane().add(l_putanna10);

		tF_ch_putanna8 = new JTextField();
		tF_ch_putanna8.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tF_ch_putanna8.setBounds(484, 128, 163, 22);
		getContentPane().add(tF_ch_putanna8);
		tF_ch_putanna8.setColumns(10);

		ch_putanna9 = new Choice();
		ch_putanna9.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna9.setBackground(Color.WHITE);
		ch_putanna9.setBounds(484, 182, 163, 24);
		getContentPane().add(ch_putanna9);
		ch_putanna9.add("Готовий ризикувати");
		ch_putanna9.add("Очікую складнощі");
		ch_putanna9.add("Мінімізувати різик");

		ch_putanna10 = new Choice();
		ch_putanna10.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna10.setBackground(Color.WHITE);
		ch_putanna10.setBounds(484, 240, 163, 24);
		getContentPane().add(ch_putanna10);
		ch_putanna10.add("до 1 року");
		ch_putanna10.add("від 1 до 3 років");
		ch_putanna10.add("від 3 до 5 років");
		ch_putanna10.add("від 5 до 10 років");
		ch_putanna10.add("більше 10 років");

		ch_putanna11 = new Choice();
		ch_putanna11.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna11.setBackground(Color.WHITE);
		ch_putanna11.setBounds(484, 298, 163, 24);
		getContentPane().add(ch_putanna11);
		ch_putanna11.add("Україна");
		ch_putanna11.add("СНГ");
		ch_putanna11.add("Європа");
		ch_putanna11.add("Америка");
		ch_putanna11.add("Азія");
		ch_putanna11.add("Африка");
		ch_putanna11.add("Австралія та острова");

		ch_putanna12 = new Choice();
		ch_putanna12.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna12.setBackground(Color.WHITE);
		ch_putanna12.setBounds(484, 354, 163, 24);
		getContentPane().add(ch_putanna12);
		ch_putanna12.add("Пасивний");
		ch_putanna12.add("Активний");

		ch_putanna13 = new Choice();
		ch_putanna13.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna13.setBackground(Color.WHITE);
		ch_putanna13.setBounds(484, 412, 163, 24);
		getContentPane().add(ch_putanna13);
		ch_putanna13.add("Вища економічна");
		ch_putanna13.add("Вища юридична");
		ch_putanna13.add("Вища технічна");
		ch_putanna13.add("Вища медична");
		ch_putanna13.add("Вища педагогічна");
		ch_putanna13.add("Вища аграрна");
		ch_putanna13.add("Не закінчена вища");
		ch_putanna13.add("Молодший спеціаліст");
		ch_putanna13.add("Середня освіта");

		ch_putanna14 = new Choice();
		ch_putanna14.setBackground(Color.WHITE);
		ch_putanna14.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna14.setBounds(484, 472, 163, 24);
		getContentPane().add(ch_putanna14);
		ch_putanna14.add("Так");
		ch_putanna14.add("Ні");

		JLabel l_prodovgutu = new JLabel("Продовжити опитування");
		l_prodovgutu.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {

				s_putanna8 = tF_ch_putanna8.getText();
				try {
					i_putanna8 = Integer.parseInt(s_putanna8);
					
					s_putanna9 = ch_putanna9.getSelectedItem();
					s_putanna10 = ch_putanna10.getSelectedItem();
					s_putanna11 = ch_putanna11.getSelectedItem();
					s_putanna12 = ch_putanna12.getSelectedItem();
					s_putanna13 = ch_putanna13.getSelectedItem();
					s_putanna14 = ch_putanna14.getSelectedItem();

					if(i_putanna8 >= 20000) {
						if(s_putanna9.equals("Готовий ризикувати")) {
							if(s_putanna10.equals("до 1 року")||s_putanna10.equals("від 1 до 3 років")) {
								new KincevuyVubir(8,9);
							}else {
								new Rezultatu("Інструменти інвестування",5);
							}
						}else {
							new KincevuyVubir(1,4);
						}
					}else {
						if(s_putanna10.equals("до 1 року")||s_putanna10.equals("від 1 до 3 років")) {
							new Rezultatu("Інструменти інвестування",2);
						}else {
							if(i_putanna3 == 1) {
								new Rezultatu("Інструменти інвестування",6);
							}else {
								new KincevuyVubir(3,7);
							}
						}							
					}
										
//					new Rezultatu("Інструменти інвестування", i_putanna0, i_putanna1, i_putanna2, i_putanna3,
//							i_putanna4, i_putanna5, s_ch_putanna6, i_putanna8, s_putanna9, s_putanna10, s_putanna11,
//							s_putanna12, s_putanna13, s_putanna14);
					
					setVisible(false);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Неправильно введена кількість коштів");
				}

			}
		});
		l_prodovgutu.setHorizontalAlignment(SwingConstants.CENTER);
		l_prodovgutu.setForeground(new Color(255, 255, 153));
		l_prodovgutu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		l_prodovgutu.setBounds(14, 517, 763, 45);
		getContentPane().add(l_prodovgutu);

		JLabel l_fon = new JLabel("");
		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\fon_oputuvanna.jpg"));
		l_fon.setBounds(0, 0, 794, 565);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
