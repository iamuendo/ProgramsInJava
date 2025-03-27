
package learningapplets;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author iamuendo
 */
public class Test extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        setForeground(Color.red);
        g.drawString("Zetech Univerisity", 25, 50);
    }
}
