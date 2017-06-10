package genetic;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileManager {
    public FileManager(){
        
    }
    
    public void saveToFile(ArrayList<Point> al) throws IOException{
        JFileChooser filechooser = new JFileChooser();
        int option;
        String path;
        filechooser.setSelectedFile(new File("Newmap.txt"));
            option = filechooser.showSaveDialog(new JMenu());
            if (option == JFileChooser.APPROVE_OPTION){
                path = filechooser.getSelectedFile().getAbsolutePath();
            }else return;
        
        File file = new File(path);
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        for (Point p: al){
            fw.write(Integer.toString(p.x) + " " + Integer.toString(p.y) + System.getProperty("line.separator"));
            fw.flush();
        }
    }
    public ArrayList<Point> loadFromFile() throws FileNotFoundException, IOException{
        int option;
        String path = null;
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT Files", new String[] {"txt"});
        filechooser.setFileFilter(filter);
        option = filechooser.showOpenDialog(new JMenu());
        if (option == JFileChooser.APPROVE_OPTION){
            path = filechooser.getSelectedFile().getAbsolutePath();
        }
        if (path == null) return null;
        File file = new File(path);
        FileReader fr = new FileReader(file);
        
        ArrayList<Point> al = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);
        String s;
        String[] coords = new String[2];
        int x, y;
        while(br.ready()){
            s = br.readLine();
            coords = s.split(" ");
            x = Integer.parseInt(coords[0]);
            y = Integer.parseInt(coords[1]);
            Point p = new Point(x, y);
            al.add(p);
        }
        return al;
    }
    
    public Result loadResultFromFile() throws FileNotFoundException, IOException{
        int option;
        String path = null;
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT Files", new String[] {"txt"});
        filechooser.setFileFilter(filter);
        option = filechooser.showOpenDialog(new JMenu());
        if (option == JFileChooser.APPROVE_OPTION){
            path = filechooser.getSelectedFile().getAbsolutePath();
        }
        if (path == null) return null;
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int grade; 
        double runtime, generation;
        String grade_s, runtime_s, generation_s;
        grade_s = br.readLine();
        runtime_s = br.readLine();
        generation_s = br.readLine();
        System.out.println(grade_s + "  " + generation_s + "  " + runtime_s);
        
        return new Result(1, 2, 3);
        
    }
    
    public static void saveResult(Result r) throws IOException{
        JFileChooser filechooser = new JFileChooser();
        int option;
        String path;
        filechooser.setSelectedFile(new File(".txt"));
            option = filechooser.showSaveDialog(new JMenu());
            if (option == JFileChooser.APPROVE_OPTION){
                path = filechooser.getSelectedFile().getAbsolutePath();
            }else return;
        
        File file = new File(path);
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write(r.getGrade() + " " + r.getGeneration() + " " + r.getRuntime());
        fw.flush();
    }
}
