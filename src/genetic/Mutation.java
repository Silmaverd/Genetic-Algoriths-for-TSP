package genetic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Mutation {
    public int mutationPercent;
    public String mutationMethod;
    public ArrayList<Point> nodes;

    public Mutation(String mutationMethod, ArrayList<Point> nodes) {
        this.mutationMethod = mutationMethod;
        this.nodes = nodes;
    }
    
    public void mutate(Specimen s){
        if (mutationMethod == "Partial inversion") partialInversion(s);
        else if (mutationMethod == "Simple inversion") simpleInversion(s);
        else scrambleMutation(s);
        s.Grade();
    }
    
    public void swap(Specimen s, int x, int y){
        int temp = s.chromosome[x];
        s.chromosome[x] = s.chromosome[y];
        s.chromosome[y] = temp;
    }
    
    public void simpleInversion(Specimen s){
        Random r = new Random();
        int i1, i2 = 0;
        i1 = r.nextInt(s.chromosomeLen);
        i2 = r.nextInt(s.chromosomeLen);
        while (i1 == i2) i2 = r.nextInt(s.chromosomeLen);
        swap(s, i1, i2);
    }
    
    public void partialInversion(Specimen s){
        Random r = new Random();
        int pivot = r.nextInt(s.chromosomeLen/2);
        int pivot2 = pivot + s.chromosomeLen/2;
        ArrayList ar = new ArrayList();
        for (int i=pivot2-1; i>=pivot; i--){
            ar.add(s.chromosome[i]);
        }
        int l=0;
        for(int i=pivot; i<pivot2; i++){
            s.chromosome[i] = (int)ar.get(l);
            l++;
        }
    }
    
    public void scrambleMutation(Specimen s){
        Random r = new Random();
        int k = r.nextInt(s.chromosomeLen/3)+3;
        int[] array = new int[k];
        for (int i=0; i<k; i++){
            array[i] = r.nextInt(s.chromosomeLen);
        }
        for (int i=0; i<k; i++){
            int x = r.nextInt(k);
            while (x == i) x = r.nextInt(k);
            swap(s, array[i], array[x]);
        }
    }
}
