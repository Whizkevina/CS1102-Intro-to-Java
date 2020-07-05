/**
 * 
 */

/**
 * @author ICTG_HP
 *
 */

import javax.swing.JOptionPane;


public class SuperPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String power = JOptionPane.showInputDialog("What is your super power?");
		power = power.toUpperCase();
		
//		System.out.println("SUPER POWER TO THE RESCUE! ");
		JOptionPane.showMessageDialog(null, power+" TO THE RESUCE!");

	}

}
