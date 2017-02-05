package applettest;

/**
 *
 * @author CV
 */
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppletTest extends JApplet  {

    public void init() {
            JButton button = new JButton("FCK-Test");
            add(button);
        }

    public static void main(String[] args) {
        JApplet applet = new AppletTest();
        applet.init();
        final JFrame frame = new JFrame("FCK");
        frame.setContentPane(applet.getContentPane());
        frame.setJMenuBar(applet.getJMenuBar());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        applet.start();
    }
}