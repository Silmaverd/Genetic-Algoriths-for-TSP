package genetic;

import java.awt.Point;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Specimen implements Comparable<Specimen>{
    public int[] chromosome;
    public int chromosomeLen;
    private double grade;
   
    public Specimen(int size){
        int graphSize = size;
        chromosomeLen = graphSize;
        LinkedList temp = new LinkedList();
        chromosome = new int[graphSize];
        for (int i=0; i<graphSize; i++){
            temp.add(i);
        }
        
        Random r = new Random();
        int x;
        for (int i=0; i<graphSize; i++){
            x = r.nextInt(temp.size());
            chromosome[i] = (int) temp.get(x);
            temp.remove(x);
        }
        Grade();
        /*for (int i=0; i<Genetic.nodes.size(); i++){
            System.out.print(chromosome[i] + " ");
        }
        System.out.println("  || " + grade);*/
    }
    
    public Specimen(){
        
    }
    
    public Specimen(Specimen s){
        this.chromosomeLen = s.chromosomeLen;
        this.chromosome = new int[chromosomeLen];
        for (int i=0; i<chromosomeLen; i++){
            this.chromosome[i] = s.chromosome[i];
        }
        this.grade = s.getGrade();
    }
    
    public double Grade(){
        double total = 0;
        int index1, index2;
        for (int i=0; i<Genetic.nodes.size()-1; i++){
            index1 = (int) chromosome[i];
            index2 = (int) chromosome[i+1];
            total += sqrt(pow(Genetic.nodes.get(index1).x - Genetic.nodes.get(index2).x, 2) + pow(Genetic.nodes.get(index1).y - Genetic.nodes.get(index2).y, 2));
        }
        total += sqrt(pow(Genetic.nodes.get(Genetic.nodes.size()-1).x - Genetic.nodes.get(0).x, 2) + pow(Genetic.nodes.get(Genetic.nodes.size()-1).y - Genetic.nodes.get(0).y, 2));
        grade = total;
        return total;
    }
    
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        String s = "";
        for (int i=0; i<Genetic.nodes.size(); i++){
            s += chromosome[i];
            if (chromosome[i] >= 0) s+= " ";
            s += " ";
        }
        //s += "   || " + grade;
        return s;
    }

    @Override
    public int compareTo(Specimen t) {
        if (this.grade > t.grade) return 1;
        else if (this.grade < t.grade) return -1;
        else return 0;
    }
        
    public boolean equals(Specimen s){
        for (int i=0; i<chromosomeLen; i++){
            if (this.chromosome[i] != s.chromosome[i]) return false;
        }
        return true;
    }
    
    public boolean isValid(){
        ArrayList arr = new ArrayList();
        for (int i=0; i<chromosomeLen; i++){
            for (Object x: arr){
                if (chromosome[i] == (int)x) return false;
            }
            arr.add(chromosome[i]);
        }
        return true;
    }

    public void swapGenes(int x, int y){
        int z = chromosome[x];
        chromosome[x] = chromosome[y];
        chromosome[y] = z;
    }
}
