// Procedure

// new> java project> project_name(AJP)> finish 

// right click on AJP> new package>package_name(JAVA_PRACTICALS)> finsih

// right click on JAVA_PRACTICALS > new class >









package JAVA_PRACTICALS;

import java.awt.Color; 
import java.awt.Frame; 
import java.awt.Label; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
public class MouseListenerExample { 
public static void main(String[] args) { 
 // TODO Auto-generated method stub
 Frame f=new Frame("Mouse Event"); 
 
 Label la=new Label("Label"); 
 la.setBounds(100,100,200,80); 
 f.setLayout(null); 
 f.add(la); 
 
 f.addMouseListener(new MouseListener() { 
 
 @Override
 public void mouseReleased(MouseEvent e) { 
 // TODO Auto-generated method stub
 
 } 
 
 @Override
 public void mousePressed(MouseEvent e) { 
 // TODO Auto-generated method stub
 
 
 } 
 
 @Override
 public void mouseExited(MouseEvent e) { 
 // TODO Auto-generated method stub
 f.setVisible(false); 
 } 
 
 @Override
 public void mouseEntered(MouseEvent e) { 
 // TODO Auto-generated method stub
 la.setText("Mouse Entered frame"); 
 f.setBackground(Color.blue); 
 } 
 
 @Override
 public void mouseClicked(MouseEvent e) { 
 // TODO Auto-generated method stub
 la.setText("Mouse Click detected"); 
 f.setBackground(Color.cyan); 
 } 
 }); 
 
 
 f.setSize(500,500); 
 f.setVisible(true); 
 } 
}
