package genetic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Palette extends Canvas{
    private Graphics g;
    //public ArrayList<Point> nodes;
    public Specimen lastSpecimen;
    public Palette(){
        super();
    }
        
    @Override
    public void paint(Graphics grphcs){
        super.paint(grphcs);
        g = this.getGraphics();
        paintMap(Genetic.nodes);
    }
    
    public void drawPoint(int x, int y){
        g.drawLine(x, y, x, y);
    }
    
    public void paintCity(Point p){
        g.setColor(Color.red);
        drawPoint(p.x, p.y);
        drawPoint(p.x, p.y-1);
        drawPoint(p.x, p.y+1);
        drawPoint(p.x-1, p.y);
        drawPoint(p.x+1, p.y);
        drawPoint(p.x-1, p.y-1);
        drawPoint(p.x+1, p.y+1);
        drawPoint(p.x-1, p.y+1);
        drawPoint(p.x+1, p.y-1);
        drawPoint(p.x, p.y-2);
        drawPoint(p.x, p.y+2);
        drawPoint(p.x-2, p.y);
        drawPoint(p.x+2, p.y);
    }
         
    public void paintMap(ArrayList<Point> list){
        if (!list.isEmpty()){
            for(Point p : list){
                paintCity(p);
            }
        }
    }
    
    @Override
    public void repaint(){
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        paintMap(Genetic.nodes);
        if (lastSpecimen != null) paintSpeciman(lastSpecimen);
    }
    
    public void paintSpeciman(Specimen spec){      
        g.clearRect(0, 0, this.getWidth(), this.getHeight());
        paintMap(Genetic.nodes);
        g.setColor(Color.white);
        Point p1, p2;
        for (int i=0; i<Genetic.nodes.size()-1; i++){
            p1 = Genetic.nodes.get(spec.chromosome[i]);
            p2 = Genetic.nodes.get(spec.chromosome[i+1]);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
        for (int i=0; i<Genetic.nodes.size(); i++){
            //System.out.print(spec.chromosome[i] + " ");
        }
        p1 = Genetic.nodes.get(spec.chromosome[Genetic.nodes.size()-1]);
        p2 = Genetic.nodes.get(spec.chromosome[0]);
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        lastSpecimen = spec;
    }
}
