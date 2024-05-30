import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    private String name;
    public Header(String name){
        this.name = name;
        setPreferredSize(new Dimension(200, 200));
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(0,0,199,199);
        g.setColor(Color.BLACK);
        g.drawString(name, 10, 100);
    }

    public static void main(String[] args) {

    }
}
