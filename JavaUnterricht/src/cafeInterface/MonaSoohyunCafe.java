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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MonaSoohyunCafe extends JFrame {

	private JPanel contentPane;
	private String[] coffees = {"Americano 4.0", "Latte Machiato 5.0", "Cappuchino 4.5", "Espresso 3.0", "Kakao 3.0", "Milchshake 4.0", "Wodka 4.0"};
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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String readOnlyString(String wholeString) {
		String onlyString = wholeString.replaceAll("[0-9.]","");
		System.out.println(onlyString);
		return onlyString;
	}
	
	
	public String readOnlyInt(String wholeString) {
		String onlyInt= wholeString.replaceAll("[^0-9.]","");
		System.out.println(onlyInt);
		return onlyInt;
	}
				

	/**
	 * Create the frame.
	 * @return 
	 */
	public MonaSoohyunCafe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 130, 105);
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
		txtNoItem.setText("No item");
		txtNoItem.setBounds(10, 190, 86, 20);
		contentPane.add(txtNoItem);
		txtNoItem.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(218, 46, 110, 105);
		contentPane.add(scrollPane_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("0");
		
		lblNewLabel_1.setBounds(294, 193, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Bestellen");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderItems.add(orderItemName);
				System.out.println(orderItems);
				orders = new JList(orderItems.toArray());
				scrollPane_1.setViewportView(orders);
				String result = readOnlyInt(orderItemName);
				totalAmount += Double.parseDouble(result);
				lblNewLabel_1.setText(totalAmount+"");
				System.out.println("Gesamtbetrag: " + totalAmount);
			}
		});
		btnNewButton.setBounds(10, 221, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		Label label = new Label("Willkommen!");
		label.setBounds(10, 10, 86, 34);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("Gesamtbetrag:");
		lblNewLabel.setBounds(157, 193, 127, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Alles stornieren");
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				orderItems.removeAll(orderItems);
				System.out.println(orderItems);
				orders = new JList(orderItems.toArray());
				scrollPane_1.setViewportView(orders);
			}
		});
		
	
		btnNewButton_1.setBounds(270, 227, 154, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
