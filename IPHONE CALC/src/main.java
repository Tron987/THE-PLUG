import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String [] args)
    {
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
    public void paint(Graphics g)
    {
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //borders
        g.setColor(Color.CYAN);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);
    }
}
