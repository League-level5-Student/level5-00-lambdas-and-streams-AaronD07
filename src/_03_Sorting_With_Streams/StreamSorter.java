package _03_Sorting_With_Streams;



import java.util.Arrays;
import java.util.Random;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt(101);
		}
			Stream<Integer> stream = Arrays.stream(nums);
		Stream<Integer> sorted = stream.sorted();
		sorted.forEach(number->{
			System.out.print(number+ ", ");
		});
		
		
		//1. Convert the Integer array to Stream object.

		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
	}
}
