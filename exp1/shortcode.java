// Procedure

// new> java project> project_name(AJP)> finish 

// right click on AJP> new package>package_name(JAVA_PRACTICALS)> finsih

// right click on JAVA_PRACTICALS > new class > class_name > finish > 

// copy code and paste





import java.awt.Frame; 
import java.awt.Label; 
import java.awt.event.KeyEvent; 
import java.awt.event.KeyListener; 
public class keyFrame { 
public static void main(String[] args) { 
 // TODO Auto-generated method stub
 Frame fr=new Frame("Key Event"); 
 
 Label l=new Label("Label"); 
 fr.add(l); 
 
 fr.addKeyListener(new KeyListener() { 
 
 @Override
 public void keyTyped(KeyEvent e) { 
 // TODO Auto-generated method stub
 char keychar=e.getKeyChar(); 
 if(keychar=='x') { 
 l.setText("x was pressed"); 
 } 
 
 } 
 
 @Override
 public void keyReleased(KeyEvent e) { 
 // TODO Auto-generated method stub
 l.setText("Key released"); 
 } 
 
 @Override
 public void keyPressed(KeyEvent e) { 
 // TODO Auto-generated method stub
 l.setText("Key pressed"); 
 } 
 }); 
 
 
 fr.setSize(500,500); 
 fr.setVisible(true); 
 } 
}
