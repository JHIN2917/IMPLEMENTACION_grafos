package Grafo;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener{
private Vector<Nodo>vectorNodos;
public Lienzo(){
    this.vectorNodos=new Vector<>();
    this.addMouseListener(this);
}
@Override
public void paint (Graphics g){
   for(Nodo nodos: vectorNodos){
       nodos.pintar(g);
   } 
}
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getButton()== MouseEvent.BUTTON1){
            this.vectorNodos.add(new Nodo(me.getX(),me.getY()));
            repaint();
            
        }
    }
 
    @Override
    public void mousePressed(MouseEvent me) {
 
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
         
    }
 
}