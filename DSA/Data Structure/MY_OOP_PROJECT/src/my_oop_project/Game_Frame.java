/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_oop_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


/**
 *
 * @author ARC
 */
public class Game_Frame extends JFrame implements ActionListener  {
    
 JFrame frame = new JFrame ();
 JButton button = new JButton();
 JPanel panel = new JPanel();
 JPanel panel1 = new JPanel();
 JPanel panel2 = new JPanel();
 JPanel panel3=new JPanel();
 JPanel panel4 = new JPanel();
 JPanel panel5 = new JPanel();
 JLabel label = new JLabel();
 JLabel label1 = new JLabel();
 Border border = BorderFactory.createLineBorder(Color.yellow, 20);
    JLabel l=new JLabel();

  Game_Frame(){ //(2)//
     panel.setBounds(130, 35, 205, 150);
     panel.setBackground(new Color(0,0,0));
     
     
     l.setIcon(new ImageIcon(getClass().getResource("image1.png")));
     l.setBounds(200, 370, 100, 100);
     panel.add(l);
     
     panel1.setBounds(85, 280, 320, 40);
     panel1.setBackground(new Color(0,0,0));
                 
     panel2.setBounds(0, 0, 500, 10);
     panel2.setBackground(Color.orange);
                 
     panel3.setBounds(0, 462, 500, 10);
     panel3.setBackground(Color.blue); 
                 
     panel4.setBounds(485, 0, 10, 500);
     panel4.setBackground(Color.RED); 
                 
     panel5.setBounds(0, 0, 10, 500);
     panel5.setBackground(Color.YELLOW);
                 
     frame.add(panel5);
     frame.add(panel4);
     frame.add(panel2);
     frame.add(panel3);
     frame.add(panel1);
     frame.add(panel);
                
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(510, 510);
     frame.setLayout(null); 
     frame.setLocationRelativeTo(null); 
     frame.setTitle("Snake Rewind");
     frame.setVisible(true);
     frame.setResizable(false);
     frame.getContentPane().setBackground(new Color(173,255,47));
     frame.add(button); 
     
     panel.add(label);
     panel1.add(label1);
      
     button.setBounds(130,210, 208, 40);
     button.setFocusable(false);
     button.addActionListener(this);
     button.setText("Start Game");
     button.setForeground(Color.WHITE);
     button.setBorder(border);
     button.setBackground(Color.DARK_GRAY);
     button.setBorder(BorderFactory.createEtchedBorder());
     button.setFont(new Font("MV Boli",Font.BOLD,20));
        
     label.setText("Snake Rewind");
     label.setHorizontalTextPosition(JLabel.CENTER  );
     label .setVerticalTextPosition(JLabel.HORIZONTAL);
     label.setForeground(Color.WHITE);
     label.setFont(new Font ("MV Boli",Font.BOLD, 20));
     label.setIconTextGap(50);
     label1.setText("Hint:-Play Keys are W,S,A,D:)");
   
     label.setBounds(200, 280, 20, 38);
     label1.setForeground(Color.WHITE);
     label1.setFont(new Font ("MV Boli",Font.BOLD, 20));
     label1.setIconTextGap(50);

	}

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource()==button)  //(3)//
            
            
            frame.dispose();//for starting once
             this.add(new Game_Code());
		this.setTitle("Snake Rewind");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

            Game_Code mywindow = new Game_Code(); 
            
        }
       
    }

