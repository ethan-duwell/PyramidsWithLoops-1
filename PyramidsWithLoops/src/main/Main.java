/*
 * Ethan Duwell
 * duwellen@mail.uc.edu
 * Assignment04
 * Course: Advanced App Dev Java
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
		for (int i = 1; i <= lines; i++) { //must set less than or equal to 'lines'
			for (int j = 0; j < lines-i; j++) {
				System.out.print(" ");
			}
			for (int k=1; k <= i+i - 1; k++) {	//create another loop to create the triangle shape
				System.out.print(i + "");
			}
			System.out.println();
		}
	}
}