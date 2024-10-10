package IngSoftware.Progetto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
public class MainFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1112, 955);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(394, 23, 314, 110);
		frame.getContentPane().add(panel);
		
		JButton btnCaprinali = new JButton("Caprinali");
		btnCaprinali.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCaprinali.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		
		
		panel.add(btnCaprinali);
		
		textField = new JTextField();
		textField.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(45, 143, 1031, 773);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel show_image = new JLabel();
		show_image.setBounds(0, 10, 1008, 758);
		ImageIcon image=new ImageIcon("media/IMG_2588.JPEG");
		Image scaledImage = image.getImage().getScaledInstance(show_image.getWidth(), 
		show_image.getHeight(), Image.SCALE_AREA_AVERAGING);
		show_image.setIcon(new ImageIcon(scaledImage));
		show_image.hide();
		
		panel_1.add(show_image);
		btnCaprinali.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("Caprinali Goat");
				if(show_image.isShowing()) {
					show_image.hide();
				}
				else {
					show_image.show();
				}
				
			}
		});
		
	}
}
