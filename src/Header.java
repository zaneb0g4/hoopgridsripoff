import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    private String name;
    public Header(String name){
        this.name = name;
        setPreferredSize(new Dimension(100, 100));
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(0,0,99,99);
        g.setColor(Color.BLACK);
        g.drawString(name, 10, 50);
    }

    public static void main(String[] args) {

    }
}
