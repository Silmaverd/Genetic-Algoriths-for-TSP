package genetic;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Evolution {
    static public int populationSize;
    public int mutationPercent;
    public String mutationMethod;
    public String selectionMethod;
    public String reproductionMethod;
    public ArrayList<Point> nodes;
    public int generation;
    public Specimen[] population;
    public double[] repChances;
    public int replacementPercent;
    
    public Evolution(){
        populationSize = -1;
        mutationPercent = -1;
        replacementPercent = -1;
    }
    
    public void setNodes(ArrayList<Point> nodes){
        this.nodes = nodes;        
    }
    
    public double similarityPercent(){
        int i;
        for (i=0; i<populationSize/10; i++){
            if (!population[i].equals(population[i+1])) break;
        }
        double percent = (double) i/populationSize;
        return percent;
    }
    
    public boolean isValid(){
        if (populationSize == -1) return false;
        if (mutationPercent == -1) return false;
        if (mutationMethod == null) return false;
        if (selectionMethod == null) return false;
        if (reproductionMethod == null) return false;   
        if (replacementPercent == -1) return false; 
        return true;
    }
    
    @Override
    public String toString(){
        String s = "";
        for (int i=0; i<populationSize; i++){
            s += population[i].toString();
            s += "\n";
        }
        return s;
    }
    
    public Specimen getBestOne(){
        return population[0];
    }
    
    public void computeRepChances(){
        double total = 0.0;
        for (int i=0; i<populationSize; i++){
            total += population[i].getGrade();
        }
        double sum = 0.0;
        for (int i=0; i<populationSize; i++){
            repChances[i] = sum + population[i].getGrade()/ total;
            sum = repChances[i];
        }
    }
    
    public Specimen selectParentRoulette(){
        Random r = new Random();
        double d = r.nextDouble();
        Specimen selected = null;
        for (int i=0; i<populationSize; i++){
            if (d <= repChances[i]) {
                selected = population[i];
                break;
            }
        }
        return selected;
    }
    
    public Specimen selectParentRanking(){
        Random r = new Random();
        int cap = populationSize/10;
        int index = r.nextInt(cap);
        return population[index];
    }
    
    public void firstGeneration(){
        for (int i=0; i<populationSize; i++){
            population[i] = new Specimen(nodes.size());
        }
        Arrays.sort(population);
        computeRepChances();
        generation = 1;
    }
    
    public void evolve(){
        Specimen parent1, parent2;
        SpecimenFactory factory = new SpecimenFactory(nodes);
        double percent = (double)replacementPercent/100.0;
        int amountToReplace = (int) (populationSize*percent);
        Specimen[] newPopulation = new Specimen[amountToReplace];
        
        for(int i=0; i<amountToReplace; i++){
            if (selectionMethod == "Roulette wheel" || populationSize == 10){
                parent1 = selectParentRoulette();
                parent2 = selectParentRoulette();
                int similarity = 0;
                while (parent1.equals(parent2)) {
                    parent2 = selectParentRoulette();
                    similarity++;
                    if (similarity == 10) break;
                }
            }else{
                parent1 = selectParentRanking();
                parent2 = selectParentRanking();
                int similarity = 0;
                while (parent1.equals(parent2)) {
                    parent2 = selectParentRanking();
                    similarity++;
                    if (similarity == 10) break;
                }
            }
            newPopulation[i] = (factory.getNewSpecimen(parent1, parent2, reproductionMethod));
        }
        
        Mutation mutation = new Mutation(mutationMethod, nodes);
        Random r = new Random();
        for (int i=0; i<((float)mutationPercent/100.0 * amountToReplace); i++){
            int spec = r.nextInt(amountToReplace);
            mutation.mutate(newPopulation[spec]);
        }
        
        int k=0;
        for (int i=populationSize-amountToReplace-1; i<populationSize-1; i++){
            population[i] = newPopulation[k];
            k++;
        }
        Arrays.sort(population);
        if ("Roulette wheel".equals(selectionMethod))computeRepChances();
               
        generation++;
    }
        
}
