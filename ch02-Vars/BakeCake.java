/*
	(End of Chapter: CODE) A program that calculates different properties of baking a cake.
	
	This code is under public domain rights and does not require licensing.
*/

class BakeCake {
	
	public static void main (String[] args) {
		
		int cakes = 6;  // The amount of cakes to be made
		double budget = 10.00d;  // The amount of money in total for ingredients 
		
		// Constant properties
		double oneFlour = 1.5d, oneMilk = .25d;  // In Cups
		int oneEggs = 2;
		double temp = 350d;  // In Fahrenheit 
		double time = 15d;  // In minutes
		
		// Costs per unit
		double costFlour = .40d, costMilk = .75d, costEggs = .25d;
		double costEnergy = 0.02d;  // Energy cost every minute@350F
		
		System.out.println("Baking " + cakes + " cakes in the oven... [$" + budget + " budget]");
		System.out.println();
		
		// Calculate total price of ingredients and check if budget allows.
		double flour = oneFlour * cakes, milk = oneMilk * cakes;
		int eggs = oneEggs * cakes;
		System.out.println("using " + (int) flour + " " + (int) ((flour%1)*4) + "/4 cups of flour... ($" + (flour * costFlour) + ")");
		System.out.println("using " + (int) milk + " " + (int) ((milk%1)*4) + "/4 cups of milk... ($" + (milk * costMilk) + ")");
		System.out.println("using " + eggs + " eggs... ($" + (eggs * costEggs) + ")");
		System.out.println("Energy cost: $" + ((temp/350d)*time*cakes*costEnergy));
		
		System.out.println("----------------------------------------------");
		
		double total = (flour * costFlour) + (milk * costMilk) + (eggs * costEggs) + ((temp/350d)*time*cakes*costEnergy);
		System.out.print("Total: $" + total + " ");
		
		if (total <= budget) {
			budget -= total;
			System.out.println("[Meets Budget - $" + budget + " left]");
		} else {
			System.out.println("[ERROR: OVER BUDGET]");
			System.exit(0);
		}
		
		System.out.println();
		
		// Computing Cake
		double totalTime = (time * cakes);
		System.out.println("Cakes Baked! [Total Time: " + (int) totalTime/60  + "h " + totalTime%60 + "s]");
		
	}
	
}	