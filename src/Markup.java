//Dennis Sturgill
//Project 1 - COP2552
//Display strings in different formats

import javax.swing.JOptionPane;

public class Markup {
	public static void main (String[] args) 
	{
		String itemNo;		//Item number
		String description;
		Float currentPrice;	//initial price
		Float markup;	// markup input 
		Float finalPrice;	//final price after calculations
		
		String input1;	//string to hold input1 for parsing
		String input2;	//string to hold input2 for parsing
		
		itemNo = JOptionPane.showInputDialog("Enter the item number please.");	//itemno variable used to hold input
		description = JOptionPane.showInputDialog("item " + itemNo + " description");	//description variable used to hold input
		
		
		input1 =JOptionPane.showInputDialog("Current price of item " + itemNo);	//input1 to be parsed to float
		currentPrice = Float.parseFloat(input1);	//Parse input1 variable into float using currentprice variable
		
		input2 =JOptionPane.showInputDialog("Enter the markup %: ");	//input1 to be parsed
		markup = Float.parseFloat(input2);		//parse input2 into float using markup variable
		
		Float markup2 = markup/100; 	//float variable holding markup percentage calculation
		
		float addedCost = markup2 * currentPrice;	// float variable to hold markup cost to be added to initial price
		finalPrice = currentPrice + addedCost;	// finalprice variable holds calculation for the total
		
		JOptionPane.showMessageDialog(null, String.format("Item Number: " + itemNo +"\n"
				+ "Description: " + description + "\n"
				+ "Current Price: $%.2f\n\n"
				+ "New Price: $%.2f", currentPrice,finalPrice));		//MessageBox outputting final price and input information in correct format
	}
}
