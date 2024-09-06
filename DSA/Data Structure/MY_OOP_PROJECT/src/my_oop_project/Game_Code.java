/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_oop_project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author ARC
 */
public class Game_Code extends JPanel implements ActionListener { 
    
   
     Random randomNumber= new Random(); 
    
    int Display_Width = 500;//set width of screen
    int Display_Height = 500;//set height of screen
    int object_Size = 20 ; //20 pixels//how big i want the obj in my screen
    int Game_Hold_Obj = (Display_Width*Display_Height)/(object_Size*object_Size); //how many obj i would fit on my screen
    int Slowdown_Speed = 80;//higher the speed slower my game  // in millisec                                        //  250,000 /400  =  625 boxes on x aur y cordinates of my screen
    //these two array hold the x,y cordinate of my screen
    int x[] = new int[Game_Hold_Obj]; //it will hold snake bodypart and head snake is not biger than the game size itself
    int y[] = new int[Game_Hold_Obj];//it will hold on y cordiantes
    int Body_Parts = 10;//mine initail body_parts start with
    int Rat_Eaten;
    int Rat_X; //appear rat on x cordinate position 
    int Rat_Y;//appear rat on y cordinate position
    char direction = 'R';//initial starting direction
    boolean running = false;
    Timer Set_Timer ; //timer class instance
   
	
	Game_Code(){ //(4)//

		
		this.setPreferredSize(new Dimension(Display_Width,Display_Height));
		this.setBackground (new Color	(5,107,209));
		this.setFocusable(true);//if false it can no longer be navigated with the keyboard.
		this.addKeyListener(new MyKeyAdapter());
		 Play_Game();
	}
	private   void Play_Game() { //play_Game method
		newRat(); //(5)// //to display rat on screen
		running = true;
		Set_Timer = new Timer(Slowdown_Speed,this); //(6)////i pass the speed value so that every 80 millisec it called the panel again 
                //Set_Timer.setRepeats(false);
		Set_Timer.start();//(7)// //start method in timer class
	}
    @Override
	public void paintComponent(Graphics graphics) { //The Graphics.g is a kind of painting tool. We're telling it what color to paint with and then what shape to paint, where it goes, and how big it is.we can call the drawString() method in Graphics class to write a text message in the applet window.
		super.paintComponent(graphics);
		this.draw(graphics);
	}
	public void draw(Graphics graphics) 
        {
		if(running==true) 
            {          //(9)//  //rat Color RGB 
			graphics.setColor(Color.green);
			graphics.fillRect(Rat_X, Rat_Y, object_Size, object_Size);//shape of rat
                          //(12)//
		        for(int i = 0; i< Body_Parts;i++) 
                {
			if(i == 0) 
                        {
				// making head of snake
                        graphics.setColor(Color.green); 
			graphics.fillRect(x[i], y[i], object_Size, object_Size);
		        }
			else  //(13)//
                        {//making body of snake
			graphics.setColor( new Color(randomNumber.nextInt(255),randomNumber.nextInt(255),randomNumber.nextInt(255)));
			graphics.fillOval(x[i], y[i], object_Size, object_Size);
		        }			
		}
//
	    }
	                else 
                        {
			gameOver(graphics);
                        }
		
        }
        
	public void newRat() //(8)////tis is used to generate new rat for snake everytime he eat
        {//x cordinate of rat
	Rat_X = randomNumber.nextInt((int)(Display_Width/object_Size))*object_Size; //x-axis range 500/20*20=500
	//ycordinate of rat
        Rat_Y = randomNumber.nextInt((int)(Display_Height/object_Size))*object_Size;//y-axis range 500/20*20=500
	}
        
	public void Snake_Movement()
        {         //(10)//
		for(int i = Body_Parts;i>0;i--) //create to move the snake on screen
                {                                //shifting the cordinate of  body parts of snake
                    x[i] = x[i-1];  //i use the switch to change the direction of snakebody
                    y[i] = y[i-1];                
		}
		 //(11)//
		switch(direction) // for head condition direction 
                {
		case 'U':
			y[0] = y[0] - object_Size;         //'R' for right
			break;                             //'L' for left
		case 'D':                                  //'U' for Upword
			y[0] = y[0] + object_Size;         // 'D' for Downword
			break;
		case 'L':
			x[0] = x[0] - object_Size;
			break;
		case 'R':
			x[0] = x[0] + object_Size;
			break;
		}
		
	}
        
	public void check_Rat() //make score here in mathed
        {         //(19)//
		if((x[0] == Rat_X) && (y[0] == Rat_Y)) 
                {
		Body_Parts+=5; //body increase
		Rat_Eaten+=5;//rat eaten 
		newRat();  //regenerate rat again  
		}
	}
        
	public void check_Crash()
        {           //(16)//
		//checks if head collides with body
		for(int i = Body_Parts;i>0;i--) 
                { // if condion of head collide with body 
			if((x[0] == x[i])&& (y[0] == y[i]))
                        {
			 running = false;
			}
		}
		//check if head touches left border
		if(x[0] < 0) 
                {
			running = false;
		}
		//check if head touches right border
		if(x[0] > Display_Width) 
                {
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0) 
                {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] > Display_Height)
                {
			running = false;
		}
		
		if(!running)
                {
			Set_Timer.stop();
		}
	}
	public void gameOver(Graphics g) //here i pas graphics g peremeter
        {  //(20)//
		//Score
                
		g.setColor( new Color(0,0,0));
		g.setFont( new Font("MV Boli",Font.PLAIN, 50));
		FontMetrics font  = getFontMetrics(g.getFont()); //making obj of FontMatrics clas
                //font alignment in center of screen 
		g.drawString("Score: "+Rat_Eaten, (Display_Width - font.stringWidth("(:Score = "+Rat_Eaten))/2, Display_Height);
		//Game Over text
		g.setColor( new Color(0,0,0));
		g.setFont( new Font("MV Boli",Font.PLAIN, 40));
		FontMetrics font2 = getFontMetrics(g.getFont());
		g.drawString("Snake is Dead\n Game Over", (Display_Width - font2.stringWidth("Snake is Dead|Game Over|"))/2, Display_Height/2);
                g.drawString("¯\\_(ツ)_/¯ ", (350- font2.stringWidth("Game Over"))/1, 200/1);
	}
        
	@Override
	public void actionPerformed(ActionEvent e)  {//actionperformed
		
		if(running==true)  //(14)//
                {
			Snake_Movement();
			check_Rat();
			check_Crash();
		}  
		repaint();//(15)// //it performs a request to erase and perform redraw of the component after a small delay in time.
	}
	//to contrl the snake
	public class MyKeyAdapter extends KeyAdapter//my one inner_class with method key pressed()
        {         //(17)//
		@Override //KeyEvent is the class which have interface of keylistener for implenting which we used keyAdapter
		public void keyPressed(KeyEvent e) 
                {//Override the keyPressed method to customize the handling of that specific event. Now every time the user presses a key this method will be launched.
			switch(e.getKeyCode())  //e.getKeyCode() get the ASCII value of key i have pressed
                      //(18)//  
                        {
			case KeyEvent.VK_A:
				if(direction != 'R') 
                                {
					direction = 'L';
                                    
				}
				break;
			case KeyEvent.VK_D:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_W:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_S:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
}
