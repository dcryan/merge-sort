//Merge Sort
import java.util.*;

public class mergeSort
{

	// public static void main(String [] args)
	// {
	// 	// test elements
	// 	// int[] array = {5,4,6,3,4,3,2,5,7,9,5,7,3,2,5};
	// 	Scanner s = new Scanner(System.in);

	// 	System.out.print("Size of array: ");
	// 	int arraySize = s.nextInt();
	// 	System.out.print("Enter "+arraySize+" elements: ");
	// 	int[] array = new int[arraySize];
	// 	for(int i = 0 ; i < arraySize ; i++)
	// 	{
	// 		array[i] = s.nextInt();
	// 	}

	// 	// Before Sort
	// 	System.out.println("BEFORE SORT");
	// 	for(int i = 0 ; i < array.length ; i++)
	// 		System.out.print(" "+array[i]);
	// 	System.out.println();

	// 	mergeSort(array);

	// 	System.out.println("---------------------------");
	// 	System.out.println("AFTER SORT");
	// 	for(int i = 0 ; i < array.length ; i++)
	// 		System.out.print(" "+array[i]);
	// 	System.out.println();
	// }

	public static void mergeSort( int [] a)
	{
		if( a.length > 1 )
		{	
			int middle = a.length / 2;

			int[] left = Arrays.copyOfRange(a, 0 , middle);
			int[] right = Arrays.copyOfRange(a, middle, a.length);

			mergeSort(left);
			mergeSort(right);
			
			merge(a, left, right);
		}
	}

	public static int[] merge(int [] parent, int[] left, int[] right)
	{
		int iLeft = 0;
		int iRight = 0;

		for(int i = 0 ; i < parent.length ; i++)
		{
			if( iLeft >= left.length )
			{
				parent[i] = right[iRight];
				iRight ++;
			}
			else if( iRight >= right.length )
			{
				parent[i] = left[iLeft];
				iLeft ++;
			}
			else if( left[iLeft] < right[iRight])
			{
				parent[i] = left[iLeft];
				iLeft ++;
			}
			else
			{
				parent[i] = right[iRight];
				iRight ++;
			}
		}

		return parent;
	}
}