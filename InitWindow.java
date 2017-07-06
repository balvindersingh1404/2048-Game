import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class InitWindow extends JFrame {

	private JPanel contentPane;
	static JLabel label[] = new JLabel[16];
	Moves obj = new Moves();

	public static void main(String[] args) {
					InitWindow frame = new InitWindow();
					frame.setVisible(true);
	}

	public InitWindow() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(4, 4,5,5));
		setContentPane(contentPane);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		
		for(int i=0;i<16;i++){
			label[i]= new JLabel();
			contentPane.add(label[i]);
			label[i].setHorizontalAlignment(SwingConstants.CENTER);
			label[i].setFont(new Font("Ubuntu", Font.BOLD, 32));
			label[i].setOpaque(true);
			label[i].setBackground(Color.GRAY);
			
		}
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 int key = e.getKeyCode();
				if(key==KeyEvent.VK_LEFT){
					obj.left();
				}
				if(key==KeyEvent.VK_UP){
					obj.up();
				}
				if(key==KeyEvent.VK_RIGHT){
					obj.right();
				}
				if(key==KeyEvent.VK_DOWN){
					obj.down();
				}
			}
		});
		obj.start();
	}
}

