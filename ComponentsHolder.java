/*
 *  Author: Michael Crowley
 *  Date: 4/6/2019
 * 
 *  This class holds the components like the background and character objects.
 */

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class ComponentsHolder extends JComponent{
  private Background b;
  
  public ComponentsHolder() {
    this.setFocusable(true);
    b = new Background();
  }

//Draw the board
public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    b.draw(g2);
  }
  
}