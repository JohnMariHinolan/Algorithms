package pumpkinpie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// challenge link: https://www.reddit.com/r/dailyprogrammer/comments/87rz8c/20180328_challenge_355_intermediate_possible/?utm_content=title&utm_medium=hot&utm_source=reddit&utm_name=dailyprogrammer
public class PieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input1 = "10,14,10,42,24";
		String input2 = "12,4,40,30,40";
		String input3 = "12,14,20,42,24";

		List<String> inputs = new ArrayList<String>() {
		};
		inputs.add(input1);
		inputs.add(input2);
		inputs.add(input3);

		for (String input : inputs) {
			IngredientsManager ingredientsManager = new IngredientsManager(input);

			ResultObj appleRes = getApplePriority(ingredientsManager);

			ResultObj pumpkinRes = getPumpkinPriority(ingredientsManager);

			if (appleRes.total() > pumpkinRes.total() || appleRes.total() == pumpkinRes.total()) {
				appleRes.print();
			} else if (appleRes.total() < pumpkinRes.total()) {
				pumpkinRes.print();
			} else {
				System.out.println("Weird");
			}

		}
	}

	private static ResultObj getApplePriority(IngredientsManager ingredientsManager) {
		IngredientsManager appleFirst = ingredientsManager.clone();

		ApplePieObj appliePieObj = new ApplePieObj();

		int applePie = appliePieObj.consumeIngr(appleFirst);

		PumpkinPieObj pumpkinPieObj = new PumpkinPieObj();

		int pumpkinPie = pumpkinPieObj.consumeIngr(appleFirst);

		return new ResultObj(applePie, pumpkinPie);
	}

	private static ResultObj getPumpkinPriority(IngredientsManager ingredientsManager) {
		IngredientsManager pieFirst = ingredientsManager.clone();

		PumpkinPieObj pumpkinPieObj = new PumpkinPieObj();

		int pumpkinPie = pumpkinPieObj.consumeIngr(pieFirst);

		ApplePieObj appliePieObj = new ApplePieObj();

		int applePie = appliePieObj.consumeIngr(pieFirst);

		return new ResultObj(applePie, pumpkinPie);
	}

	static class ResultObj {

		private int appleCount;
		private int pieCount;

		public ResultObj(int appleCount, int pieCount) {

			this.appleCount = appleCount;
			this.pieCount = pieCount;
		}

		public int total() {
			return this.appleCount + this.pieCount;
		}

		public void print() {

			System.out.println(this.pieCount + " pumpkin pies and " + this.appleCount + " apple pies");
		}

	}

}
