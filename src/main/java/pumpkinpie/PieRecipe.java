package pumpkinpie;

public abstract class PieRecipe {
	private int pumpkinFlv ;
	private int apple ;
	private int eggs ;
	private int cupOfMilk ;
	private int cupOfSugar ;
	
	
	
	public int consumeIngr(IngredientsManager ingr) {
		// TODO Auto-generated method stub
		int totalRecipeCount = 0;
		
		while(isIngrEnough(this.pumpkinFlv,ingr.getPumpkinFlv())
			&& 	isIngrEnough(this.apple,ingr.getApple())
			&& 	isIngrEnough(this.eggs,ingr.getEggs())
			&& 	isIngrEnough(this.cupOfMilk,ingr.getCupOfMilk())
			&& 	isIngrEnough(this.cupOfSugar,ingr.getCupOfSugar())
			) {
			
			// subtract them
			
			ingr.subPumpkinFlv(this.pumpkinFlv);
			ingr.subApple(this.apple);
			ingr.subEggs(this.eggs);
			ingr.subCupOfMilk(this.cupOfMilk);
			ingr.subCupOfSugar(this.cupOfSugar);
			
			totalRecipeCount++;
		}
		
		
		return totalRecipeCount;
	}

	private boolean isIngrEnough(int val1, int val2) {
		
		return val2 > val1;
	}

	public void setPumpkinFlv(int pumpkinFlv) {
		this.pumpkinFlv = pumpkinFlv;
	}



	public void setApple(int apple) {
		this.apple = apple;
	}



	public void setEggs(int eggs) {
		this.eggs = eggs;
	}



	public void setCupOfMilk(int cupOfMilk) {
		this.cupOfMilk = cupOfMilk;
	}



	public void setCupOfSugar(int cupOfSugar) {
		this.cupOfSugar = cupOfSugar;
	}


	

}
