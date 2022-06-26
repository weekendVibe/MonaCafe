package cafeInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;

public class MonaSoohyunCafe extends JFrame {

	private JPanel contentPane;
	private String[] coffees = { "Americano 4.0", "Latte Machiato 5.0", "Cappuchino 4.5", "Espresso 3.0", "Kakao 3.0",
			"Milchshake 4.0", "Wodka 4.0" };
	private JTextField txtNoItem;
	private ArrayList<String> orderItems = new ArrayList<String>();
	private String orderItemName;
	private JList orders;
	private double totalAmount;
	private JLabel lblNewLabel_1;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonaSoohyunCafe frame = new MonaSoohyunCafe();
					frame.setVisible(true);
					frame.setTitle("Mona-Soohyun Cafe");
					frame.setResizable(false);
					//frame.setDefaultCloseOperation();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String readOnlyString(String wholeString) {
		String onlyString = wholeString.replaceAll("[0-9.]", "");
		System.out.println(onlyString);
		return onlyString;
	}

	public String readOnlyInt(String wholeString) {
		String onlyInt = wholeString.replaceAll("[^0-9.]", "");
		System.out.println(onlyInt);
		return onlyInt;
	}

	/**
	 * Create the frame.
	 * 
	 * @return
	 */
	public MonaSoohyunCafe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 316);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 154, 105);
		contentPane.add(scrollPane);

		JList list = new JList(coffees);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String selectedItem = (String) list.getSelectedValue();
				orderItemName = selectedItem;
				txtNoItem.setText(readOnlyString(selectedItem));

			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

		txtNoItem = new JTextField();
		txtNoItem.setForeground(Color.BLACK);
		txtNoItem.setBackground(Color.LIGHT_GRAY);
		txtNoItem.setText("No item");
		txtNoItem.setBounds(10, 166, 154, 20);
		contentPane.add(txtNoItem);
		txtNoItem.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_1.setBounds(199, 10, 136, 141);
		contentPane.add(scrollPane_1);

		JLabel lblNewLabel_1 = new JLabel("0");

		lblNewLabel_1.setBounds(295, 169, 55, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton = new JButton("Item hinzufügen");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderItems.add(orderItemName);
				//System.out.println(orderItems);
				orders = new JList(orderItems.toArray());
				scrollPane_1.setViewportView(orders);
				String result = readOnlyInt(orderItemName);
				totalAmount += Double.parseDouble(result);
				lblNewLabel_1.setText(totalAmount + "");
				//System.out.println("Gesamtbetrag: " + totalAmount);
			}
		});
		btnNewButton.setBounds(10, 200, 154, 23);
		contentPane.add(btnNewButton);

		Label label = new Label("Willkommen!");
		label.setAlignment(Label.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		label.setBackground(Color.BLACK);
		label.setBounds(10, 10, 154, 34);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("Gesamtbetrag:");
		lblNewLabel.setBounds(199, 169, 86, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("Alles stornieren");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);

		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 1. remove all visible ordered item on scrollPane_1 
				orderItems.removeAll(orderItems);
				System.out.println(orderItems);
				orders = new JList(orderItems.toArray());
				scrollPane_1.setViewportView(orders);
				
				// 2. reset totalamount for the receipt
				totalAmount = 0; // init again 
				lblNewLabel_1.setText(totalAmount + "");
			}
		});

		btnNewButton_1.setBounds(10, 233, 154, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bestellen");
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(orderItems);
				System.out.println("Gesamtbetrag: " + totalAmount);
				
				File file = new File("src/images/coffee.PNG");
		
				BufferedImage img;
				try {
					img = ImageIO.read(file);
					JLabel lb = new JLabel(new ImageIcon(img));
					JFrame f = new JFrame("draw Image");
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f.getContentPane().add(lb);
					f.pack();
					f.setLocation(200,200);
					f.setVisible(true);		
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(199, 230, 136, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("src\\images\\pikachu.gif.gif"));

		btnNewButton_3.setBounds(454, 10, 175, 202);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("HELP");
		btnNewButton_4.setForeground(Color.YELLOW);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(454, 233, 86, 23);
		contentPane.add(btnNewButton_4);

	}
}
