package csc402.assignment1;
import java.util.*; // for comparing arrays in main() tests only

class HW1 {

	/*
	 * Sum the values of the array.  
	 * Be careful, the array may have length 0.  In this case, sum should return 0
	 * 
	 */
	public static double sum (double[] a) {
		// TODO
		
		double sumTotal =0;
		for (int count=0;count < a.length;count++) {
			sumTotal = sumTotal + a[count];
		}
		return sumTotal;
	  }


	/*
	 *  Returns true if all the elements of the array equal x
	 * Be careful, the array may have length 0.  In this case, In this case, the value returned  should be true
	 * 
	 */
	public static boolean all (int[] a, int x) {
		// TODO
		return false;
	  }

	/*
	 *  Returns if there is any element of the array that equals x
	 * Be careful, the array may have length 0.  In this case, the value returned  should be false
	 * 
	 */
	public static boolean  any (int[] a, int x) {
		// TODO
		return false;
	  }
	
	/*
	 *  Returns number of elements of the array that equals x
	 * Be careful, the array may have length 0.  In this case, the value returned  should be 0
	 * 
	 */
	public static int count (int[] a, int x) {
		// TODO
		return 1;
	  }

	/*
	 *  Returns the number of elements of  the array that equal x
	 * Be careful, the array may have length 0.  In this case, the value returned must be 0
	 * 
	 */

	

	/*
	 * minValue returns the minimum value in an array of doubles. You can assume
	 * the array is nonempty and has no duplicates. Your solution must go
	 * through the array exactly once. Your solution must not call any other
	 * functions. Here are some examples (using "==" informally):
	 * 
	 * -7 == minValue(new double[] { -7 }) -7 == minValue(new double[] { 1, -4,
	 * -7, 7, 8, 11 }) -13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 })
	 * -9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 })
	 */
	public static double minValue(double[] list) {
		// TODO
		return 1;
	}

	/*
	 * minPosition returns the position of the minimum value in an array of
	 * doubles. The first position in an array is 0 and the last is the
	 * array.length-1. You can assume the array is nonempty and has no
	 * duplicates. Your solution must go through the array exactly once. Your
	 * solution must not call any other functions. Here are some examples (using
	 * "==" informally):
	 * 
	 * 0 == minPosition(new double[] { -7 }) 2 == minPosition(new double[] { 1,
	 * -4, -7, 7, 8, 11 }) 0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11
	 * }) 6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 })
	 */
	public static int minPosition(double[] list) {
		 // TODO
		return 1;
	}

	/*
	 * distanceBetweenMinAndMax returns difference between the minPosition and
	 * the maxPosition in an array of doubles.
	 * 
	 * You can assume the array is nonempty and has no duplicates. Your solution
	 * must go through the array exactly once. Your solution must not call any
	 * other functions. Here are some examples (using "==" informally):
	 * 
	 * 0 == distanceBetweenMinAndMax(new double[] { -7 }) // -7,-7 are the min
	 * and max 3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11
	 * }), // 7,11 5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7,
	 * 8, 11 }) // -13,11 1 == distanceBetweenMinAndMax(new double[] { 1, -4,
	 * -7, 7, 8, 11, -9 }) // -9,11
	 */
	public static int distanceBetweenMinAndMax(double[] list) {
		// TODO
		return 1;
	}

	/*
	 * numUnique returns the number of unique values in an array of doubles.
	 * Unlike the previous questions, the array may be empty and it may contain
	 * duplicate values. Also unlike the previous questions, you can assume the
	 * array is sorted.
	 * 
	 * Your solution must go through the array exactly once. Your solution must
	 * not call any other functions. Here are some examples (using "=="
	 * informally):
	 * 
	 * 0 == numUnique(new double[] { }) 1 == numUnique(new double[] { 11 }) 1 ==
	 * numUnique(new double[] { 11, 11, 11, 11 }) 8 == numUnique(new double[] {
	 * 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) 8
	 * == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66,
	 * 77, 88 })
	 */
	public static int numUnique(double[] list) {
		// TODO
		int  result = 0;
		return result;
	}

	/*
	 * removeDuplicates returns the number of unique values in an array of
	 * doubles. You may assume that the list is sorted, as you did for
	 * numUnique.
	 * 
	 * Your solution may call numUnique, but should not call any other
	 * functions. After the call to numUnique, you must go through the array
	 * exactly one more time. Here are some examples (using "==" informally):
	 * 
	 * new double[] { } == removeDuplicates(new double[] { }) new double[] { 11
	 * } == removeDuplicates(new double[] { 11 }) == removeDuplicates(new
	 * double[] { 11, 11, 11, 11 }) new double[] { 11, 22, 33, 44, 55, 66, 77,
	 * 88 } == removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44,
	 * 44, 44, 44, 55, 55, 66, 77, 88, 88 }) == removeDuplicates(new double[] {
	 * 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 })
	 */
	public static double[] removeDuplicates(double[] list) {
		//TODO
		return null;
	}

	public static void main(String[] args) {
		double[] r = removeDuplicates(new double[] { 11,22,33});
		System.out.println(r);
		
	}
	// You can write tests here to make sure your functions work.
	public static void main1(String[] args) {
        // WRITE YOUR OWN TESTS HERE FOR SUM, ALL, any, COUNT
		System.out.println("Tests for SUM");
		System.out.print("array of size 0");
		System.out.println(0==sum(new double[0]));
		System.out.print("array of size 2 [1,2]");
		System.out.println(3==sum(new double[] {1,2}));
		

		// test minValue( double [] )
		System.out.println("minValue:");
		System.out.print("-7 == minValue(new double[] { -7 }) ");
		System.out.println(-7 == minValue(new double[] { -7 }));

		System.out.print("-7 == minValue(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		System.out.println(-7 == minValue(new double[] { 1, -4, -7, 7, 8, 11 }));

		System.out.print("-13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		System.out.println(-13 == minValue(new double[] { -13, -4, -7, 7, 8, 11 }));

		System.out.print("-9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		System.out.println(-9 == minValue(new double[] { 1, -4, -7, 7, 8, 11, -9 }));

		// test minPosition( double[] )
		System.out.println("\nminPosition:");
		System.out.print("0 == minPosition(new double[] { -7 }) ");
		System.out.println(0 == minPosition(new double[] { -7 }));

		System.out.print("2 == minPosition(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		System.out.println(2 == minPosition(new double[] { 1, -4, -7, 7, 8, 11 }));

		System.out.print("0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		System.out.println(0 == minPosition(new double[] { -13, -4, -7, 7, 8, 11 }));

		System.out.print("6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		System.out.println(6 == minPosition(new double[] { 1, -4, -7, 7, 8, 11, -9 }));

		// test distanceBetweenMinAndMax( double[])
		System.out.println("\ndistanceBetweenMinAndMax:");
		System.out.print("0 == distanceBetweenMinAndMax(new double[] { -7 }) ");
		System.out.println(0 == distanceBetweenMinAndMax(new double[] { -7 }));

		System.out.print("3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11 }) ");
		System.out.println(3 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11 }));

		System.out.print("5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7, 8, 11 }) ");
		System.out.println(5 == distanceBetweenMinAndMax(new double[] { -13, -4, -7, 7, 8, 11 }));

		System.out.print("1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }) ");
		System.out.println(1 == distanceBetweenMinAndMax(new double[] { 1, -4, -7, 7, 8, 11, -9 }));
	
		// test numUnique( double[] )
		System.out.println("\nnumUnique:");
		System.out.print("0 == numUnique(new double[] { }) ");
		System.out.println(0 == numUnique(new double[] { }));

		System.out.print("1 == numUnique(new double[] { 11 }) ");
		System.out.println(1 == numUnique(new double[] { 11 }));

		System.out.print("1 == numUnique(new double[] { 11, 11, 11, 11 }) ");
		System.out.println(1 == numUnique(new double[] { 11, 11, 11, 11 }));

		System.out.print("8 == numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) ");
		System.out.println(8 == numUnique(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }));

		System.out.print("8 == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }) ");
		System.out.println(8 == numUnique(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }));

		// test removeDuplicates( double[])
		System.out.println("\nremoveDuplicates:");
		System.out.print("new double[] { } == removeDuplicates(new double[] { }) ");
		System.out.println(Arrays.equals(new double[] { }, removeDuplicates(new double[] { })));

		System.out.print("new double[] { 11 } == removeDuplicates(new double[] { 11 }) ");
		System.out.println(Arrays.equals(new double[] { 11 }, removeDuplicates(new double[] { 11 })));

		System.out.print("new double[] { 11 } == removeDuplicates(new double[] { 11, 11, 11, 11 }) ");
		System.out.println(Arrays.equals(new double[] { 11 }, removeDuplicates(new double[] { 11, 11, 11, 11 })));

		System.out.print("new double[] { 11, 22, 33, 44, 55, 66, 77, 88 } == removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 }) ");
		System.out.println(Arrays.equals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, removeDuplicates(new double[] { 11, 11, 11, 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88, 88 })));

		System.out.print("new double[] { 11, 22, 33, 44, 55, 66, 77, 88 } == removeDuplicates(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 }) ");
		System.out.println(Arrays.equals(new double[] { 11, 22, 33, 44, 55, 66, 77, 88 }, removeDuplicates(new double[] { 11, 22, 33, 44, 44, 44, 44, 44, 55, 55, 66, 77, 88 })));

	}
}

