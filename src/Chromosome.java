
import java.util.*;

public class Chromosome implements Comparable<Chromosome> {

	private int fitness = 0;
	private List<Gene> genes = null;

	public Chromosome() {
		this.genes = generateRandomChrom();
		this.fitness = this.getFitness();
	}
	
	public Chromosome(Gene[] genes){
		this.genes = new ArrayList<Gene>(Arrays.asList(genes));
		this.fitness = this.getFitness();
	}

	/**
	 * Generate a random chromosome/individual
	 * @return Randomly created genes that form this chromosome
	 */
	private List<Gene> generateRandomChrom() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This function computes the fitness value of this individual/chromosome
	 * 
	 * @return fitness
	 */
	public int getFitness() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * This function returns genes of this individual/chromosome to the caller
	 * 
	 * @return Gene[]
	 */
	public Gene[] getGenes() {
		return (Gene[]) genes.toArray();
	}

	@Override
	public int compareTo(Chromosome o) {
		if (this.fitness > o.getFitness()) {
			return 1;
		}

		if (this.fitness < o.getFitness()) {
			return -1;
		}
		return 0;
	}

}
