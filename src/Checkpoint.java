import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		int arrLen = Integer.parseInt(JOptionPane.showInputDialog("How many elements should be in the array?"));
		int[] arr = new int[arrLen];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Input a number to add to the array."));
		}
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Total: " + total);
		
		double avg = (double)total/arr.length;
		System.out.print("Avg: " + avg);
	}
}
