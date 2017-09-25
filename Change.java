
import javax.swing.JOptionPane;
public class Change{
	public static void main( String[] arg){
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;
		String input = JOptionPane.showInputDialog(" Enter 1,5,10,25 dollar bill");
		int amount = Integer.parseInt(input)*100;
		JOptionPane.showinputDialog(null, " Change in Qurter is : " + amount/QUARTER + " \n Change in Dime is : " + amount/DIME +" /n Change in Nickel is : " + amount/NICKEL + "/n Change in PENNY is :" + amount/PENNY);
	}
}
	
