package genetic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class SpecimenFactory {
    public ArrayList<Point> nodes;
    
    public SpecimenFactory(ArrayList<Point> nodes){
        this.nodes = nodes;
    }
    
    public Specimen getNewSpecimen(Specimen parent1, Specimen parent2, String method){
        if ("PMX Operator".equals(method)) return operatorPMX(parent1, parent2);
        else if ("OX Operator".equals(method)) return operatorOX(parent1, parent2);
        else if ("CX Operator".equals(method)) return operatorCX(parent1, parent2);
        else return null;
    }
    
    public Specimen operatorPMX(Specimen parent1, Specimen parent2){
        Specimen child = new Specimen(parent2);
        Specimen child2 = new Specimen(parent1);
        int chromosoneSize = nodes.size();

        Random r = new Random();
        int beginRange = r.nextInt(chromosoneSize/2);
        int endRange = beginRange + chromosoneSize/2-1;
        
        for (int i=beginRange; i<endRange; i++){
            int index = 0;
            for(int k=0; k<chromosoneSize; k++){
                if (parent2.chromosome[k] == parent1.chromosome[i]){
                    index = k;
                    break;
                }
            }
            child.swapGenes(i, index);
        }
        for (int i=beginRange; i<endRange; i++){
            int index = 0;
            for(int k=0; k<chromosoneSize; k++){
                if (parent1.chromosome[k] == parent2.chromosome[i]){
                    index = k;
                    break;
                }
            }
            child2.swapGenes(i, index);
        }
        
        child.Grade();
        child2.Grade();

        if (r.nextInt(2) == 0) return child;
        else return child2;
    }

    public Specimen operatorOX(Specimen parent1, Specimen parent2){
        Specimen child = new Specimen(parent2);
        int chromosomeSize = nodes.size();
        int beginRange = chromosomeSize/3;
        int endRange = beginRange + beginRange;
        
        ArrayList toCopy = new ArrayList();
        for (int i=beginRange; i<endRange; i++){
           for(int k=0; k<chromosomeSize; k++){
               if (parent2.chromosome[k] == parent1.chromosome[i]){
                   toCopy.add(child.chromosome[k]);
                   child.chromosome[k] = -1;                   
                   break;
               }
           }
        }
        
        /*System.out.println("Range:  "+beginRange+"-"+endRange);
        System.out.println("Parent1:  "+parent1);
        System.out.println("Parent2:  "+parent2);
        System.out.println("Child:    "+child);*/
        int[] array = new int[chromosomeSize];
        int beginHoles=0;
        for (int i=beginRange; i<endRange; i++){
            if (child.chromosome[i] != -1){
                array[beginHoles] = child.chromosome[i];
                beginHoles++;
            }
        }
        
        int endHoles = beginHoles + (endRange-beginRange);
        int j=endHoles;
        for (int i=endRange; i<chromosomeSize; i++){
            if(child.chromosome[i] != -1){
                array[j] = child.chromosome[i];
                j++;
            }
        }
        for(int i=0; i<beginRange; i++){
            if (child.chromosome[i] != -1){
                if (j < chromosomeSize) array[j] = child.chromosome[i];
                j++;
            }
        }
        /*for (int i=0; i<chromosomeSize; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("");*/
        //System.out.println("Holes range: "+beginHoles+"-"+endHoles);
        for (int i=beginHoles; i<endHoles; i++){
            array[i] = (Integer)toCopy.get(i-beginHoles);
        }
        
        /*for (int i=0; i<chromosomeSize; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println("");*/
        
        for (int i=0; i<chromosomeSize; i++){
            child.chromosome[i] = array[i];
        }
        child.Grade();
        return child;
    }
    
    public Specimen operatorCX(Specimen parent1, Specimen parent2){
        Specimen child = new Specimen(parent2);
        int chromosomeSize = nodes.size();
        for (int i=0; i<chromosomeSize; i++){
            child.chromosome[i] = -1;
        }

        ArrayList copied = new ArrayList();
        int k=0;
        while(true){
            if (copied.contains(parent1.chromosome[k])) break;
            else{
                child.chromosome[k] = parent1.chromosome[k];
                copied.add(child.chromosome[k]);
                for (int i=0;i<chromosomeSize; i++){
                    if (parent1.chromosome[i] == parent2.chromosome[k]) {k = i; break;}
                }
            }
        }
        
        for(int i=0; i<chromosomeSize; i++){
            if (child.chromosome[i] == -1) child.chromosome[i] = parent2.chromosome[i];
        }
               
        /*System.out.println("Parent1:  "+parent1);
        System.out.println("Parent2:  "+parent2);
        System.out.println("Child:    "+child+"\n");*/
        
        child.Grade();
        return child;
    }
}



