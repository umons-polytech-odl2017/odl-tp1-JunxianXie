package exercise2;

class Person
{
	private int age;
	private static int populationsize=0;
	private static long totalAge=0;

	public static int getPopulationsize() {
		return populationsize;
	}


	public Person(int age){
		this.age=age;
		populationsize++;
		totalAge +=age;
	}

	public static float computePopulationAverage() {
		return ((float)totalAge)/populationsize;
	}

	public static void resetPopulation(){
		populationsize=0;
		totalAge=0;
	}
}
