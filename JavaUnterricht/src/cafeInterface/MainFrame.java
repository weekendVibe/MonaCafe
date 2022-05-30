package cafeInterface;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {
    JPanel contentPane;
    JLabel imageLabel = new JLabel();
    JLabel headerLabel = new JLabel();

    public MainFrame() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            contentPane = (JPanel) getContentPane();
            contentPane.setLayout(new BorderLayout());
            setSize(new Dimension(400, 300));
            setTitle("���׸�");
            // ��� ���̺�
            headerLabel.setFont(new java.awt.Font("���", Font.BOLD, 16));
            headerLabel.setText("������ �޸��� ���׸�");
            contentPane.add(headerLabel, java.awt.BorderLayout.NORTH);
            // �̹��� ���̺�
            ImageIcon ii = new ImageIcon(this.getClass().getResource(
                    "C:/Users/Soohyun/Desktop/Newman Paul/JavaUnterricht/src/images/sff.png"));
            imageLabel.setIcon(ii);
            contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MainFrame();
    }

}