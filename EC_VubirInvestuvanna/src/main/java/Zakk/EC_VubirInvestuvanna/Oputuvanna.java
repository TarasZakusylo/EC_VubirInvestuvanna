package Zakk.EC_VubirInvestuvanna;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Oputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private ButtonGroup group_putanna;
	private ButtonGroup group_putanna1;
	private ButtonGroup group_putanna2;
	private ButtonGroup group_putanna3;
	private ButtonGroup group_putanna4;
	private ButtonGroup group_putanna5;

	private JRadioButton rB_putanna0_0;
	private JRadioButton rB_putanna0_1;
	private JRadioButton rB_putanna1_0;
	private JRadioButton rB_putanna1_1;
	private JRadioButton rB_putanna2_0;
	private JRadioButton rB_putanna2_1;
	private JRadioButton rB_putanna3_0;
	private JRadioButton rB_putanna3_1;
	private JRadioButton rB_putanna4_0;
	private JRadioButton rB_putanna4_1;
	private JRadioButton rB_putanna5_0;
	private JRadioButton rB_putanna5_1;

	private Choice ch_putanna6;
	private JLabel l_prodovgutu;

	private int i_putanna0 = 0;
	private int i_putanna1 = 0;
	private int i_putanna2 = 0;
	private int i_putanna3 = 0;
	private int i_putanna4 = 0;
	private int i_putanna5 = 0;

	public Oputuvanna(String s) {
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
		l_kartunka.setBounds(642, 71, 115, 191);
		getContentPane().add(l_kartunka);

		JLabel l_kartunka1 = new JLabel(" ");
		l_kartunka1.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\kartunka_oputuvanna1.png"));
		l_kartunka1.setBounds(652, 275, 115, 191);
		getContentPane().add(l_kartunka1);

		JLabel l_putanna = new JLabel("У Вас уже був досвід інвестування ?");
		l_putanna.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna.setForeground(new Color(240, 248, 255));
		l_putanna.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna.setBounds(19, 114, 468, 45);
		getContentPane().add(l_putanna);

		JLabel l_putanna1 = new JLabel("Ви займались волонтерством, соц. допомогою ?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setForeground(new Color(240, 248, 255));
		l_putanna1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna1.setBounds(19, 172, 471, 45);
		getContentPane().add(l_putanna1);

		JLabel l_putanna3 = new JLabel("Бажаєте співпрацювати з державою ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setForeground(new Color(240, 248, 255));
		l_putanna3.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna3.setBounds(19, 288, 471, 45);
		getContentPane().add(l_putanna3);

		JLabel l_putanna4 = new JLabel("Бажаєте співпрацювати з іноземцями ?");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setForeground(new Color(240, 248, 255));
		l_putanna4.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna4.setBounds(19, 346, 471, 45);
		getContentPane().add(l_putanna4);

		JLabel l_putanna5 = new JLabel("Бажаєте бути учасником інвестиційного фонду ?");
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setForeground(new Color(240, 248, 255));
		l_putanna5.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna5.setBounds(19, 404, 471, 45);
		getContentPane().add(l_putanna5);

		JLabel l_putanna6 = new JLabel("Оберіть вид оплати:");
		l_putanna6.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna6.setForeground(new Color(240, 248, 255));
		l_putanna6.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna6.setBounds(77, 462, 364, 45);
		getContentPane().add(l_putanna6);

		JLabel l_putanna2 = new JLabel("Бажаєте мати легкий вихід ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setForeground(new Color(240, 248, 255));
		l_putanna2.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		l_putanna2.setBounds(19, 230, 471, 45);
		getContentPane().add(l_putanna2);

		rB_putanna0_0 = new JRadioButton("Так");
		rB_putanna0_0.setForeground(Color.WHITE);
		rB_putanna0_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna0_0.setBounds(495, 126, 62, 25);
		getContentPane().add(rB_putanna0_0);
		rB_putanna0_0.setOpaque(false);
		rB_putanna0_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna0 = 1;
			}
		});

		rB_putanna0_1 = new JRadioButton("Ні");
		rB_putanna0_1.setForeground(Color.WHITE);
		rB_putanna0_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna0_1.setBounds(571, 126, 62, 25);
		getContentPane().add(rB_putanna0_1);
		rB_putanna0_1.setOpaque(false);
		rB_putanna0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna0 = 2;
			}
		});

		rB_putanna1_0 = new JRadioButton("Так");
		rB_putanna1_0.setForeground(Color.WHITE);
		rB_putanna1_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna1_0.setBounds(495, 180, 62, 25);
		getContentPane().add(rB_putanna1_0);
		rB_putanna1_0.setOpaque(false);
		rB_putanna1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});

		rB_putanna1_1 = new JRadioButton("Ні");
		rB_putanna1_1.setForeground(Color.WHITE);
		rB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna1_1.setBounds(571, 180, 62, 25);
		getContentPane().add(rB_putanna1_1);
		rB_putanna1_1.setOpaque(false);
		rB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		rB_putanna2_0 = new JRadioButton("Так");
		rB_putanna2_0.setForeground(Color.WHITE);
		rB_putanna2_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna2_0.setBounds(496, 237, 62, 25);
		getContentPane().add(rB_putanna2_0);
		rB_putanna2_0.setOpaque(false);
		rB_putanna2_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 1;
			}
		});

		rB_putanna2_1 = new JRadioButton("Ні");
		rB_putanna2_1.setForeground(Color.WHITE);
		rB_putanna2_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna2_1.setBounds(572, 237, 62, 25);
		getContentPane().add(rB_putanna2_1);
		rB_putanna2_1.setOpaque(false);
		rB_putanna2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna2 = 2;
			}
		});

		rB_putanna3_0 = new JRadioButton("Так");
		rB_putanna3_0.setForeground(Color.WHITE);
		rB_putanna3_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna3_0.setBounds(495, 297, 62, 25);
		getContentPane().add(rB_putanna3_0);
		rB_putanna3_0.setOpaque(false);
		rB_putanna3_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 1;
			}
		});

		rB_putanna3_1 = new JRadioButton("Ні");
		rB_putanna3_1.setForeground(Color.WHITE);
		rB_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna3_1.setBounds(571, 297, 62, 25);
		getContentPane().add(rB_putanna3_1);
		rB_putanna3_1.setOpaque(false);
		rB_putanna3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 2;
			}
		});

		rB_putanna4_0 = new JRadioButton("Так");
		rB_putanna4_0.setForeground(Color.WHITE);
		rB_putanna4_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna4_0.setBounds(495, 357, 62, 25);
		getContentPane().add(rB_putanna4_0);
		rB_putanna4_0.setOpaque(false);
		rB_putanna4_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna4 = 1;
			}
		});

		rB_putanna4_1 = new JRadioButton("Ні");
		rB_putanna4_1.setForeground(Color.WHITE);
		rB_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna4_1.setBounds(571, 357, 62, 25);
		getContentPane().add(rB_putanna4_1);
		rB_putanna4_1.setOpaque(false);
		rB_putanna4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna4 = 2;
			}
		});

		rB_putanna5_0 = new JRadioButton("Так");
		rB_putanna5_0.setForeground(Color.WHITE);
		rB_putanna5_0.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna5_0.setBounds(495, 414, 62, 25);
		getContentPane().add(rB_putanna5_0);
		rB_putanna5_0.setOpaque(false);
		rB_putanna5_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 1;
			}
		});

		rB_putanna5_1 = new JRadioButton("Ні");
		rB_putanna5_1.setForeground(Color.WHITE);
		rB_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		rB_putanna5_1.setBounds(571, 414, 62, 25);
		getContentPane().add(rB_putanna5_1);
		rB_putanna5_1.setOpaque(false);
		rB_putanna5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 2;
			}
		});

		ch_putanna6 = new Choice();
		ch_putanna6.setBackground(Color.WHITE);
		ch_putanna6.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		ch_putanna6.setBounds(450, 472, 225, 31);
		getContentPane().add(ch_putanna6);
		ch_putanna6.add("Власні кошти");
		ch_putanna6.add("Кредитні кошти");
		ch_putanna6.add("Післяпродажні кошти");

		l_prodovgutu = new JLabel("Продовжити опитування");
		l_prodovgutu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (i_putanna1 == 0 || i_putanna2 == 0 || i_putanna3 == 0 || i_putanna4 == 0 || i_putanna5 == 0
						|| i_putanna0 == 0) {
					JOptionPane.showMessageDialog(null, "Заповніть всі поля !");
				} else {
					
					String s_ch_putanna6 = ch_putanna6.getSelectedItem();
					
					 new Oputuvanna1("Інструменти інвестування", i_putanna0, i_putanna1, i_putanna2,
							 i_putanna3, i_putanna4, i_putanna5, s_ch_putanna6);
					setVisible(false);
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

		group_putanna = new ButtonGroup();
		group_putanna.add(rB_putanna0_0);
		group_putanna.add(rB_putanna0_1);

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(rB_putanna1_0);
		group_putanna1.add(rB_putanna1_1);

		group_putanna2 = new ButtonGroup();
		group_putanna2.add(rB_putanna2_0);
		group_putanna2.add(rB_putanna2_1);

		group_putanna3 = new ButtonGroup();
		group_putanna3.add(rB_putanna3_0);
		group_putanna3.add(rB_putanna3_1);

		group_putanna4 = new ButtonGroup();
		group_putanna4.add(rB_putanna4_0);
		group_putanna4.add(rB_putanna4_1);

		group_putanna5 = new ButtonGroup();
		group_putanna5.add(rB_putanna5_0);
		group_putanna5.add(rB_putanna5_1);

		setVisible(true);
	}
}
