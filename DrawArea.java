import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class DrawArea extends Canvas{
	//private existLine[] lines; 
	//private int lineCount;   
	
	public DrawArea(){
	 setSize(800,600);
     setBackground(Color.white);
     //lines = new existLine[1000];
    // addMouseListener((MouseListener) this);
    // addMouseMotionListener((MouseMotionListener) this);
  }
	
	/*void doClear() {
        // Clear all the lines from the picture.
     if (lineCount > 0) {
        lines = new existLine[1000];
        lineCount = 0;
        repaint();
     }
  }
	
	public void paint(Graphics g) {
     for (int i = 0; i < lineCount; i++) {
        int c = lines[i].colorIndex;
        g.setColor(existLine.colorList[c]);
        g.drawLine(lines[i].x1,lines[i].y1,lines[i].x2,lines[i].y2);
     }
  }
	
	   int startX, startY;  
	   int prevX, prevY;  */
       
	   public void mousePressed(MouseEvent evt) { }
	   public void mouseDragged(MouseEvent evt) { }
	   public void mouseReleased(MouseEvent evt) { }
	   public void mouseClicked(MouseEvent evt) { }
	   public void mouseEntered(MouseEvent evt) { }
	   public void mouseExited(MouseEvent evt) { }
	   public void mouseMoved(MouseEvent evt) { }
	
	
}