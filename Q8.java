//Write a Java Program to check whether the given array is Mirror Inverse or not.


package P1;


public class Q8 {

	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			if (arr[arr[i]] != i)
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 0 };
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
