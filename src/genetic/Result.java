package genetic;

public class Result {
    private double grade;
    private long runtime;
    private int generation;

    public Result(double grade, long runtime, int generation) {
        this.grade = grade;
        this.runtime = runtime;
        this.generation = generation;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public long getRuntime() {
        return runtime;
    }

    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
    
    @Override
    public String toString(){
        return grade+" "+runtime+" "+generation+"\n"; 
    }
}
