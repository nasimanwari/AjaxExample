package showcities;

public class City {
	private String cityType;
	private String time;
	private String population;
	
	public City() {
		
	}
	
	public City(String cityType, String time, String population) {
		super();
		this.cityType = cityType;
		this.time = time;
		this.population = population;
	}

	public String getCityType() {
		return cityType;
	}

	public void setCityType(String cityType) {
		this.cityType = cityType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}
	
	public void findCities(String cityType) {
		
	}
}
