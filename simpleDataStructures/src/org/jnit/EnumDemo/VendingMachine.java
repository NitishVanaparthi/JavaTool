package org.jnit.EnumDemo;

public class VendingMachine {
	private Denominations denominations;
	public Denominations getDenominations() {
		return denominations;
	}
	public void setDenominations(Denominations denominations) {
		this.denominations = denominations;
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.setDenominations(Denominations.DIME);
		System.out.println(vm.getDenominations().getDenominationValue());
		for(Denominations deno:Denominations.values()){
			System.out.println(deno.name());
			System.out.println(deno.getDenominationValue());
			//charAt is used to convert string to charecter
			//regular expressions use string matcher classes
			//LInk to verify www.vogella.com/tutorials/javaregularexpressions/article.html
			//alternate way is pattern and matcher
			//regex also used for pattern matching
		}
	}

}
