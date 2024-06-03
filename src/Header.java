import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Header extends JPanel {
    private String name;
    private BufferedImage image;
    public Header(String name){
        this.name = name;
        setPreferredSize(new Dimension(200, 200));
        try {
            if(name.equals("Atlanta Hawks")) {
                image = ImageIO.read(new File("src/images/hawks.png"));
            }else if(name.equals("Boston Celtics")) {
                image = ImageIO.read(new File("src/images/celtics.png"));
            }else if(name.equals("Brooklyn Nets")) {
                image = ImageIO.read(new File("src/images/nets.png"));
            }else if(name.equals("Charlotte Hornets")) {
                image = ImageIO.read(new File("src/images/hornets.png"));
            }else if(name.equals("Chicago Bulls")) {
                image = ImageIO.read(new File("src/images/bulls.png"));
            }else if(name.equals("Cleveland Cavaliers")) {
                image = ImageIO.read(new File("src/images/cavs.jpg"));
            }else if(name.equals("Dallas Mavericks")) {
                image = ImageIO.read(new File("src/images/mavs.png"));
            }else if(name.equals("Denver Nuggets")) {
                image = ImageIO.read(new File("src/images/nuggets.jpg"));
            }else if(name.equals("Detroit Pistons")) {
                image = ImageIO.read(new File("src/images/pistons.png"));
            }else if(name.equals("Golden State Warriors")) {
                image = ImageIO.read(new File("src/images/warriors.png"));
            }else if(name.equals("Houston Rockets")) {
                image = ImageIO.read(new File("src/images/rockets.png"));
            }else if(name.equals("Indiana Pacers")) {
                image = ImageIO.read(new File("src/images/pacers.png"));
            }else if(name.equals("Los Angeles Clippers")) {
                image = ImageIO.read(new File("src/images/clippers.png"));
            }else if(name.equals("Los Angeles Lakers")) {
                image = ImageIO.read(new File("src/images/lakers.png"));
            }else if(name.equals("Memphis Grizzlies")) {
                image = ImageIO.read(new File("src/images/grizzlies.png"));
            }else if(name.equals("Miami Heat")) {
                image = ImageIO.read(new File("src/images/heat.png"));
            }else if(name.equals("Milwaukee Bucks")) {
                image = ImageIO.read(new File("src/images/bucks.jpg"));
            }else if(name.equals("Minnesota Timberwolves")) {
                image = ImageIO.read(new File("src/images/wolves.jpg"));
            }else if(name.equals("New Orleans Pelicans")) {
                image = ImageIO.read(new File("src/images/pelicans.jpg"));
            }else if(name.equals("New York Knicks")) {
                image = ImageIO.read(new File("src/images/knicks.png"));
            }else if(name.equals("Oklahoma City Thunder")) {
                image = ImageIO.read(new File("src/images/thunder.png"));
            }else if(name.equals("Orlando Magic")) {
                image = ImageIO.read(new File("src/images/magic.jpg"));
            }else if(name.equals("Philadelphia 76ers")) {
                image = ImageIO.read(new File("src/images/sixers.png"));
            }else if(name.equals("Phoenix Suns")) {
                image = ImageIO.read(new File("src/images/suns.jpg"));
            }else if(name.equals("Portland Trail Blazers")) {
                image = ImageIO.read(new File("src/images/blazers.png"));
            }else if(name.equals("Sacramento Kings")) {
                image = ImageIO.read(new File("src/images/kings.png"));
            }else if(name.equals("San Antonio Spurs")) {
                image = ImageIO.read(new File("src/images/spurs.png"));
            }else if(name.equals("Toronto Raptors")) {
                image = ImageIO.read(new File("src/images/raptors.png"));
            }else if(name.equals("Utah Jazz")) {
                image = ImageIO.read(new File("src/images/jazz.jpg"));
            }else if(name.equals("Washington Wizards")) {
                image = ImageIO.read(new File("src/images/wizards.png"));
            }
        } catch (IOException ignored) {
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.fillOval(0,0,199,199);
        g.setColor(Color.BLACK);
        g.drawString(name, 10, 100);
        g.drawImage(image,0,0,this);
    }

    public static void main(String[] args) {

    }
}
