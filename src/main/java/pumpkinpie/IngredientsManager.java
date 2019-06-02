package pumpkinpie;

public class IngredientsManager implements Cloneable{

	private Integer pumpkinFlv;
	private Integer apple;
	private Integer eggs;
	private Integer cupOfMilk;
	private Integer cupOfSugar;
	
	protected final String DELIMETER = ",";
	private IngredientsManager() {};
	
	public IngredientsManager(String ingr) {
		this.pumpkinFlv = getIngrValue(0,ingr);
		this.apple = getIngrValue(1,ingr);
		this.eggs = getIngrValue(2,ingr);
		this.cupOfMilk = getIngrValue(3,ingr);
		this.cupOfSugar = getIngrValue(4,ingr);
		
	}
	
	protected int getIngrValue(int pos, String ingr) {
		int value = 0;
		try {
			value =  Integer.valueOf(ingr.split(DELIMETER)[pos]);
		} catch(NumberFormatException e) {
			value = 0;
		}
		return value;
	}

	public void subPumpkinFlv(Integer num) {
		this.pumpkinFlv -= num;
	}
	
	public void subApple(Integer num) {
		this.apple -= num;
	}
	
	public void subEggs(Integer num) {
		this.eggs -= num;
	}
	
	public void subCupOfMilk(Integer num) {
		this.cupOfMilk -= num;
	}
	
	public void subCupOfSugar(Integer num) {
		this.cupOfSugar -= num;
	}
	
	public Integer getPumpkinFlv() {
		return pumpkinFlv;
	}

	public Integer getApple() {
		return apple;
	}

	public Integer getEggs() {
		return eggs;
	}

	public Integer getCupOfMilk() {
		return cupOfMilk;
	}

	public Integer getCupOfSugar() {
		return cupOfSugar;
	}

	public String getDELIMETER() {
		return DELIMETER;
	}
	
	
	
	
	public void setPumpkinFlv(Integer pumpkinFlv) {
		this.pumpkinFlv = pumpkinFlv;
	}

	public void setApple(Integer apple) {
		this.apple = apple;
	}

	public void setEggs(Integer eggs) {
		this.eggs = eggs;
	}

	public void setCupOfMilk(Integer cupOfMilk) {
		this.cupOfMilk = cupOfMilk;
	}

	public void setCupOfSugar(Integer cupOfSugar) {
		this.cupOfSugar = cupOfSugar;
	}

	@Override 
	public IngredientsManager clone() {
		IngredientsManager ingredientsManager = new IngredientsManager();
	
		ingredientsManager.setPumpkinFlv(pumpkinFlv);
		ingredientsManager.setApple(apple);
		ingredientsManager.setEggs(eggs);
		ingredientsManager.setCupOfMilk(cupOfMilk);
		ingredientsManager.setCupOfSugar(cupOfSugar);
		
		return ingredientsManager;
	}
}
