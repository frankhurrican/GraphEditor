import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GraphEditor extends Frame implements ActionListener{
	public static void main(String[] args) {
     new  GraphEditor();
  }
	
	public GraphEditor(){
		super("Simple Graph Editor");
		Menu mainMenu = new Menu("Menu",true);
	      mainMenu.add("Pythagoras");      
	      mainMenu.add("Graph");        
	      mainMenu.addSeparator();  
	      mainMenu.add("Quit");
	      mainMenu.addActionListener(this);
	      
	      MenuBar mbar = new MenuBar();
	      mbar.add(mainMenu);
	      setMenuBar(mbar);
	      
	      //canvas = new DrawArea();
	      add("Center",new DrawArea());
	      
	      addWindowListener(
	              new WindowAdapter() {
	                 public void windowClosing(WindowEvent evt) {
	                    dispose();
	                    System.exit(0);
	                 }
	              }
	          );
	        
	        pack();
	        setVisible(true);  
	}
	
	public void actionPerformed(ActionEvent evt) {
        // A menu command has bee given by the user.  Respond by calling 
        // the appropriate method in the canvas (except in the case of the
        // Quit command, which is handled by ending the program).

      String command = evt.getActionCommand();

      if (command.equals("Quit")) {
          dispose();  // Close the window, then end the program.
          System.exit(0);
      }
      else if  (command.equals("Pythagoras")){
    	  
      }
      else if (command.equals("Graph")){
    	  //canvas.doClear();
    	  
      }
    	  
      }
    	  
}
