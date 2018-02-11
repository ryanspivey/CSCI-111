/* Course: CSCI 111, Section 4
 Student Name: Ryan Spivey
 Student ID: 010635613
 Program 1 Homework
 Due Date: 2/12/2018
 In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone
 other than the instructor.

 Program Description:
*/
/*Program: converts diameter & height of cone from inches to feet--
 determines weight of gelato in a cone (lbs)
*/
import javax.swing.JOptionPane;
 
	public class Icecream {
	public static void main(String[]args){
		/*
		Variable declaration:
		cds: ConeDiameterString
		chs: ConeHeightString
		
		cd: ConeDiameter
		ch: ConeHeight
		cdf: ConeDiameterFeet
		chf: ConeHeightFeet
		cr: cone radius
		cv: ConeVolume
		hv: HemisphereVolume
		gv: GelatoVolume
		gvp: GelatoVolumePounds
		*/
		String cds, chs;
		double pi=3.14, cd, ch, cdf, chf, cr, cv, hv, gv, gvp;
		cds= JOptionPane.showInputDialog("Enter the diameter of the top of the gelato in inches: ");
		chs= JOptionPane.showInputDialog("What is the height of the gelato cone in inches: ");
		cd= Double.parseDouble(cds);
		ch= Double.parseDouble(chs);
		//Logic
		cdf= cd/12.0;
		chf= ch/12.0;
		cr= cdf/2.0;
		cv= (1.0/3.0)*pi*Math.pow(cr,2.0)*chf;
		hv= (2./3.0)*pi*(cr*cr*cr);
		gv= cv + hv;
		gvp= 1.06*gv;
		//Console Print
		System.out.printf("A gelato cone of height %.2f feet and diameter %.2f feet and can hold %.2f lbs. of gelato",chf,cdf,gvp);
		
		}
}
